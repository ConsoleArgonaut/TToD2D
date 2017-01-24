package tui;

import source.*;

import java.lang.Character;
import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.Scanner;

import static source.Types.combatActionResult.Attacked;

/**
 * Created by Michael on 17.01.2017.
 */
public class Main {
    private static World world;
    public static void main(String[] args) {
        world = new World();
        world.generateDefault();
        seperator();
        writeline("Hello and welcome to The Tower of Doom 2!");
        seperator();
        writeline(StoryController.getIntro());
        seperator();
        createCharacter();
        overworld();
    }

    private static boolean gameIsActive = true;

    private static void overworld(){
        while (gameIsActive){
            seperator();
            int clearedDungeons = 0;
            ArrayList<String> locations = new ArrayList<>();
            for (Town t:world.getTowns()) {
                locations.add(t.getName() + " (Town)");
            }
            for (Dungeon d:world.getDungeons()) {
                String dungeonname = d.getName();
                if(d.isCleared()){
                    dungeonname += " (Cleared)";
                    clearedDungeons++;
                }
                locations.add(dungeonname);
            }

            locations.add("Set best equipment");

            if(clearedDungeons == world.getDungeons().size())
                rollCredits();

            int nextLocation = askQuestion("Where do you wanna go?", locations);
            if (nextLocation < world.getTowns().size())
                goToTown(world.getTowns().get(nextLocation));
            else if (nextLocation >= world.getTowns().size() && nextLocation <= locations.size() - 2)
                goToDungeon(world.getDungeons().get(nextLocation - world.getTowns().size()));
            else {
                seperator();
                for (Item i: Player.getInstance().getItems()) {
                    switch (i.getType()){
                        case Weapon:
                            Weapon w = (Weapon)i;
                            if(Player.getInstance().getWeapon() == null || w.getAttack() > Player.getInstance().getWeapon().getAttack())
                                Player.getInstance().setWeapon(w);
                            break;
                        case Shield:
                            Shield s = (Shield)i;
                            if(Player.getInstance().getShield() == null || s.getDefence() > Player.getInstance().getShield().getDefence())
                                Player.getInstance().setShield(s);
                            break;
                        case Armor:
                            Armor a = (Armor)i;
                            if(Player.getInstance().getArmor() == null || a.getDefence() > Player.getInstance().getArmor().getDefence())
                                Player.getInstance().setArmor(a);
                            break;
                        default:
                            break;
                    }
                }
                if(Player.getInstance().getWeapon() != null)
                    writeline("Weapon: " + Player.getInstance().getWeapon().getName());
                if(Player.getInstance().getArmor() != null)
                    writeline("Armor: " + Player.getInstance().getArmor().getName());
                if(Player.getInstance().getShield() != null)
                    writeline("Shield: " + Player.getInstance().getShield().getName());
            }
        }
    }

    private static void goToTown(Town town){
        boolean townIsActive = true;
        while (townIsActive)
        {
            seperator();
            writeline("You are in the middle of the town " + town.getName());
            seperator();
            ArrayList<String> buildings = new ArrayList<>();
            for (Inn i:town.getInns()) {
                buildings.add(i.getName() + " (Inn)");
            }
            for (Shop s: town.getShops()) {
                buildings.add(s.getName() + " (Shop)");
            }
            buildings.add("Back to Worldmap");
            int nextBuilding = askQuestion("Where do you wanna go?", buildings);
            if(nextBuilding < town.getInns().size())
                goToInn(town.getInns().get(nextBuilding));
            else if (buildings.size() - 1 == nextBuilding)
                townIsActive = false;
            else
                goToShop(town.getShops().get(nextBuilding - town.getInns().size()));
        }
    }

    private static void goToInn(Inn inn) {
        boolean innIsActive = true;
        seperator();
        writeline("You entered: " + inn.getName());
        while(innIsActive)
        {
            seperator();
            int nextMove = 0;
            ArrayList<String> innPossibleMoves = new ArrayList<>();
            innPossibleMoves.add("Talk to " + inn.getInnkeeper().getName() + " (Innkeeper)");
            innPossibleMoves.add("Take a dump");
            for (NPC npc:inn.getNpcs()) {
                innPossibleMoves.add("Talk to " + npc.getName());
            }
            innPossibleMoves.add("Exit inn");
            nextMove = askQuestion("What do you wanna do?", innPossibleMoves);
            if(nextMove == 0)
                goToInnkeeper(inn.getInnkeeper());
            else if(nextMove == 1){
                writeline("You took a dump");
                inn.takeADump();
            }
            else if(nextMove == innPossibleMoves.size() - 1)
                innIsActive = false;
            else{
                NPC npcToTalkTo = inn.getNpcs().get(nextMove - 2);
                writeline(npcToTalkTo.getName() + "said: ");
                seperator();
                writeline(npcToTalkTo.talk());
            }

        }

    }

    private static void goToInnkeeper(Innkeeper innkeeper){
        boolean innkeeperIsActive = true;
        seperator();
        writeline("You are standing by the innkeeper: " + innkeeper.getName());
        while(innkeeperIsActive){
            seperator();
            ArrayList<String> innkeeperPossibleMoves = new ArrayList<>();
            innkeeperPossibleMoves.add("Talk");
            innkeeperPossibleMoves.add("Get a room to sleep in " + innkeeper.getRoomPrice() + " GEIL");
            innkeeperPossibleMoves.add("Exit");
            switch(askQuestion("What do you wanna do? (GEIL: " + Player.getInstance().getMoney() + ")" , innkeeperPossibleMoves)){
                case 0:
                    writeline(innkeeper.getName() + " said: ");
                    seperator();
                    writeline(innkeeper.talk());
                    break;
                case 1:
                    if(innkeeper.goSleeping())
                        writeline("You slept in the inn");
                    else
                        writeline("You didn't have enough GEIL for the room");
                    break;
                case 2:
                    innkeeperIsActive = false;
                    break;
            }
        }
    }

    private static void goToShop(Shop shop){
        boolean shopIsActive = true;
        while(shopIsActive){
            seperator();
            writeline("You are in the shop: " + shop.getName());
            ArrayList<String> possibleShopOptions = new ArrayList<>();
            for (Trader t:shop.getTraders()) {
                possibleShopOptions.add("Go to trader: " + t.getName());
            }
            possibleShopOptions.add("Exit");
            int shopMove = askQuestion("What do you wanna do?", possibleShopOptions);
            if(shopMove == possibleShopOptions.size() - 1)
                shopIsActive = false;
            else
                goToTrader(shop.getTraders().get(shopMove));
        }
    }

    private static void goToTrader(Trader trader){
        boolean traderIsActive = true;
        while(traderIsActive){
            seperator();
            ArrayList<String> possibleTraderMoves = new ArrayList<>();
            possibleTraderMoves.add("Talk to " + trader.getName());
            int traderItemsBuyable = 0;
            for (Item i:trader.getItems()) {
                if(trader.getBuyItemPrice(i) > Player.getInstance().getMoney())
                    traderItemsBuyable++;
            }
            if(traderItemsBuyable > 0)
                possibleTraderMoves.add("Buy something");
            if(Player.getInstance().getItems().size() > 0)
                possibleTraderMoves.add("Sell something");
            possibleTraderMoves.add("Exit");
            writeline(trader.getName() + " GEIL: " + trader.getMoney());
            seperator();
            int nextTraderMove = askQuestion("What do you wanna do? (GEIL: " +Player.getInstance().getMoney() + ")" , possibleTraderMoves);
            if(nextTraderMove == 0){
                writeline(trader.getName() + " said:");
                seperator();
                writeline(trader.talk());
            }
            else{
                if(traderItemsBuyable > 0 && Player.getInstance().getItems().size() > 0){}
                else if (Player.getInstance().getItems().size() > 0){
                    if(nextTraderMove == 1)
                        nextTraderMove = 2;
                    else
                        nextTraderMove = 3;
                }
                else if (traderItemsBuyable > 0){
                    if(nextTraderMove == 2)
                        nextTraderMove = 3;
                }
                else
                    nextTraderMove = 3;
            }
            if(nextTraderMove == 1){
                seperator();
                ArrayList<String> possibleItemsToBuyString = new ArrayList<>();
                ArrayList<Item> possibleItemsToBuy = new ArrayList<>();
                for (Item i:trader.getItems()) {
                    if(trader.getBuyItemPrice(i) < Player.getInstance().getMoney()){
                        possibleItemsToBuy.add(i);
                        possibleItemsToBuyString.add(i.getName() + ": " + trader.getBuyItemPrice(i) + " GEIL");
                    }
                }
                possibleItemsToBuyString.add("Nothing");
                int itemToBuy = askQuestion("What do you wanna buy?", possibleItemsToBuyString);
                if(itemToBuy != possibleItemsToBuyString.size() - 1){
                    if(trader.buyItem(possibleItemsToBuy.get(itemToBuy)))
                        writeline("Successfully bought the item");
                    else
                        writeline("Couldn't buy the item");
                }
            }
            if(nextTraderMove == 2){
                seperator();
                ArrayList<String> possibleItemsToSellString = new ArrayList<>();
                ArrayList<Item> possibleItemsToSell = new ArrayList<>();
                for (Item i:Player.getInstance().getItems()) {
                     possibleItemsToSell.add(i);
                     possibleItemsToSellString.add(i.getName() + ": " + trader.getSellItemPrice(i) + " GEIL");
                }
                possibleItemsToSellString.add("Nothing");
                int itemToBuy = askQuestion("What do you wanna sell?", possibleItemsToSellString);
                if(itemToBuy != possibleItemsToSellString.size() - 1){
                    if(trader.sellItem(possibleItemsToSell.get(itemToBuy)))
                        writeline("Successfully sold the item");
                    else
                        writeline("Couldn't sell the item");
                }
            }
            if (nextTraderMove == 3){
                traderIsActive = false;
            }
        }
    }

    private static void goToDungeon(Dungeon dungeon){
        boolean dungeonIsActive = true;
        while(dungeonIsActive && gameIsActive){
            seperator();
            writeline("You are at: " + dungeon.getName());
            if(dungeon.isCleared()){
                writeline("The dungeon is cleared");
                seperator();
                writeline("You went back...");
            }
            else {
                ArrayList<String> possibleDungeonMoves = new ArrayList<>();
                possibleDungeonMoves.add("Go to next floor");
                possibleDungeonMoves.add("Exit dungeon");
                int nextDungeonMove = askQuestion("What do you wanna do?", possibleDungeonMoves);
                if(nextDungeonMove == 0)
                    goToFloor(dungeon.getNextFloor());
                else
                    dungeonIsActive = false;
            }
        }
    }

    private static void goToFloor(Floor floor){
        boolean floorIsActive = true;
        while (floorIsActive && gameIsActive){
            seperator();
            if(floor.getEnemiesDefeated() >= 6){
                writeline("Floor is cleared");
                floorIsActive = false;
            }
            else{
                if(askQuestion("Do you wanna keep on going?", new String[]{"Yes", "No"}) == 0){
                    doCombat(floor.getNextCombat());
                }
                else{
                    floorIsActive = false;
                }
            }
        }
    }

    private static void doCombat(Combat combat){
        boolean combatIsActive = true;
        while (combatIsActive){
            seperator();
            writeline(Player.getInstance().getName() + " health: " + Player.getInstance().getLife() + "/" + Player.getInstance().getMaxLife() + " | Mana: " + Player.getInstance().getMana() + "/" + Player.getInstance().getMaxMana());
            writeline(combat.getCurrentEnemy().getName() + " health: " + combat.getCurrentEnemy().getLife() + "/" + combat.getCurrentEnemy().getMaxLife() + " | Mana: " + combat.getCurrentEnemy().getMana() + "/" + combat.getCurrentEnemy().getMaxMana());
            seperator();
            ArrayList<String> possibleMoves = new ArrayList<>();
            for (Skill s:Player.getInstance().getSkills()) {
                possibleMoves.add(s.getName());
            }
            possibleMoves.add("Use healing potion");
            possibleMoves.add("Use poison");
            possibleMoves.add("Wait");
            possibleMoves.add("Try to flee");
            int nextMove = askQuestion("What do you wanna do?", possibleMoves);
            CombatResult result;
            if(nextMove <= possibleMoves.size() - 5){
                result = combat.attack(Player.getInstance().getSkills().get(nextMove - 3));
            }
            else if(nextMove == possibleMoves.size() - 4){
                Potion potion = null;
                for (Item i:Player.getInstance().getItems()) {
                    if(i.getType() == Types.itemType.Potion) {
                        potion = (Potion)i;
                    }
                }
                if(potion == null) {
                    writeline("You didn't have any potions");
                    result = combat.getAttacked();
                }
                else
                    result = combat.usePotion(potion);
            }
            else if (nextMove == possibleMoves.size() - 3){
                Poison poison = null;
                for (Item i:Player.getInstance().getItems()) {
                    if(i.getType() == Types.itemType.Poison) {
                        poison = (Poison)i;
                    }
                }
                if(poison == null) {
                    writeline("You didn't have any poisons");
                    result = combat.getAttacked();
                }
                else
                    result = combat.usePoison(poison);
            }
            else if (nextMove == possibleMoves.size() - 2){
                result = combat.getAttacked();
            }
            else{
                result = combat.flee();
            }
            seperator();
            if(result.getEnemyHadFirstHit())
                writeline(combat.getCurrentEnemy().getName() + " had first hit.");
            else
                writeline(Player.getInstance().getName() + " had first hit.");
            writeline(Player.getInstance().getName() + getActionName(result.getPlayerAction()));
            writeline(combat.getCurrentEnemy().getName() + getActionName(result.getEnemyAction()));
            if(Player.getInstance().getLife() <= 0){
                writeline(Player.getInstance().getName() + " died");
                gameIsActive = false;
                combatIsActive = false;
            }
            if(combat.getCurrentEnemy().getLife() <= 0){
                writeline(combat.getCurrentEnemy().getName() + "was defeated");
                combatIsActive = false;
            }
            if(result.getPlayerAction() == Types.combatActionResult.Escaped){
                combatIsActive = false;
            }
        }
    }

    private static String getActionName(Types.combatActionResult result){
        String returnValue;
        switch(result){
            case Attacked:
                returnValue = " attacked";
                break;
            case AttackMissed:
                returnValue = " missed an attack";
                break;
            case Defended:
                returnValue = " defended himself";
                break;
            case ItemUsed:
                returnValue = " used an item";
                break;
            case ItemMissed:
                returnValue = " tried to use an item but missed";
                break;
            case Waited:
                returnValue = " waited";
                break;
            case Evolved:
                returnValue = " evolved";
                break;
            case Escaped:
                returnValue = " escaped";
                break;
            default:
                returnValue = " pulled of an unknown move";
                break;
        }
        return returnValue;
    }

    private static void rollCredits(){
        seperator();
        writeline(StoryController.getCredits());
        gameIsActive = false;
    }

    private static void createCharacter(){
        switch(askQuestion("Which race do you wanna be?", new String[]{"Woman", "Dwarf", "Dragonwoman", "Swimming Daddy"})){
            case 0:
                Player.getInstance().setRace(Types.playerRace.Human);
                Player.getInstance().setGender("Woman");
                break;
            case 1:
                Player.getInstance().setRace(Types.playerRace.Dwarf);
                Player.getInstance().setGender("Male");
                break;
            case 2:
                Player.getInstance().setRace(Types.playerRace.Dragonpeeps);
                Player.getInstance().setGender("Woman");
                break;
            case 3:
                Player.getInstance().setRace(Types.playerRace.Big_Daddys);
                Player.getInstance().setGender("Male");
                break;
        }
        seperator();
        writeline("Whats your name?");
        Player.getInstance().setName(getInput());
    }

    /** Read line */
    private static String getInput(){
        boolean gettingInput = true;
        String returnValue = "";
        System.out.print("  ");
        Scanner in = new Scanner(System.in);
        returnValue = in.nextLine();
        if(returnValue != null)
            return returnValue;
        else
            return "";
    }
    /** Output of 1 to n lines  */
    private static void writeline(String[] textlines){
        for (String s: textlines) {
            writeline(s);
        }
    }
    private static void writeline(ArrayList<String> textlines){
        for (String s: textlines) {
            writeline(s);
        }
    }
    /** Output of 1 line */
    private static void writeline(String text){
        System.out.println("  " + text);
    }
    /** Writes a separator to separate printlines */
    private static void seperator(){
        System.out.println("[]------------------------------------------------------------------------------------------------------------------------------[]");
    }
    /** Ask a Question and get Answer */
    private static int askQuestion(String question, String[] possibleAnswers){
        int returnValue = 0;
        writeline(question);
        for (int i = 0; i < possibleAnswers.length; i++) {
            writeline((i+1) + ") " + possibleAnswers[i]);
        }
        boolean inputIsCorrect = false;
        while(!inputIsCorrect){
            String input = getInput();
            if(input.length() != 0){
                try{
                    returnValue = Integer.parseInt(input);
                    returnValue--;
                    if(returnValue >= possibleAnswers.length || returnValue < 0){
                        writeline("Please answer correctly");
                    }
                    else {
                        inputIsCorrect = true;
                    }
                }
                catch (Exception ex){
                    inputIsCorrect = false;
                    writeline("Please answer with a number");
                }
            }
            else
                writeline("Please give an input before pressing enter");
        }
        return returnValue;
    }
    private static int askQuestion(String question, ArrayList<String> possibleAnswers){
        String[] answers = new String[possibleAnswers.size()];
        for (int i = 0; i < possibleAnswers.size(); i++) {
            answers[i] = possibleAnswers.get(i);
        }
        return askQuestion(question, answers);
    }
}
