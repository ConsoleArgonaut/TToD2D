package source;

import java.util.ArrayList;

/**
 * Created by Michael on 16.12.2016.
 */
public class World implements java.io.Serializable{
    private ArrayList<Dungeon> dungeons;
    private ArrayList<Town> towns;

    public World (){
        dungeons = new ArrayList<Dungeon>();
        towns = new ArrayList<Town>();
    }

    public World (ArrayList<Dungeon> dungeonsToSet, ArrayList<Town> townsToSet ){
        dungeons = dungeonsToSet;
        towns = townsToSet;
    }

    public ArrayList<Dungeon> getDungeons(){
        return dungeons;
    }

    public ArrayList<Town> getTowns() {
        return towns;
    }

    public void generateDefault(){
        generateDefaultTown1();
        generateDefaultTown2();
        generateDefaultDungeons();
        generateDefaultPlayer();
    }

    private void generateDefaultTown1(){
        Town town = new Town();
        town.setName("Paladia");
        Inn inn = new Inn();
        inn.setName("Flowery inn of justice");
        inn.getNpcs().add(new NPC("Brushguy Woodthreep", new String[]{
                "Oh, look behind you, a 3 headed monkey!",
                "So you want to be a pirate, eh? You look more like a flooring inspector?",
                "Swordfighting is a little like making love. It's not always what you do, but what you say."}));
        inn.getNpcs().add(new NPC("Ima-Gun Di", new String[]{
                "For the towers!",
                "I never drink to much... Well, today is an exception",
                "Try to flirt with the innkeeper. Trust me, she loves it.",
                "You wanna be my princess for tonight?",
                "I was in a cartoon, before I died... I'm kind of a ghost, you know."}));
        Innkeeper innkeeper = new Innkeeper("Beatrice");
        innkeeper.setRoomPrice(40);
        innkeeper.getSentences().add("It's annoying that people always try to flirt with me.");
        innkeeper.getSentences().add("I'm sorry, but I think your princess is in another castle.");
        innkeeper.getSentences().add("No, my parents weren't fire wizards, just because I look like a bomb");
        innkeeper.getSentences().add("No, I'm not an ice wizard, and I won't put out your fire.");
        innkeeper.getSentences().add("I should stop serving beer here, that way people wouldn't be so stupid anymore.");
        inn.setInnkeeper(innkeeper);
        town.getInns().add(inn);
        Shop shop = new Shop("Old house");
        Trader wilfred = new Trader("Wilfried the blacksmith");
        wilfred.getSentences().add("I don't have any items anymore.");
        wilfred.getSentences().add("You can't buy anything here, I'm sorry.");
        wilfred.getSentences().add("If you are an adventurer, than just go away. I don't want any trouble.");
        wilfred.getSentences().add("I hate that stupid goran, that filthy bastard robbed me.");
        shop.getTraders().add(wilfred);
        town.getShops().add(shop);
        towns.add(town);
    }

    private void generateDefaultTown2(){
        Town town = towns.get(0);
        town.setName("Necroma");
        Inn inn = new Inn();
        inn.setName("My beer for your horse");
        inn.getNpcs().add(new NPC("Remmie", new String[]{
                "Hi there! I'm Remmie",
                "Did you know, that you can gain GEIL if you kill enemies?",
                "Have you ever tried those potions? They are yummy!",
                "I would like to have an icecream in a shape of a fish.",
                "Did I reapeat myself again?"}));
        inn.getNpcs().add(new NPC("Donald", new String[]{
                "We have to make this kingdom great again",
                "The beauty of me is that I’m very rich",
                "You're disgusting",
                "My parents gave me a small loan of a million GEIL"}));
        inn.getNpcs().add(new NPC("Chameli", new String[]{
                "I like to do stupid puns!",
                "I heard the hero of hope had a massive sword. Got it?",
                "Goran the lich, more like goran the witch",
                "Do you know whats funnier than an wooden stick? An iron sword!",
                "Keep your pants where I can see them."}));
        Innkeeper innkeeper = new Innkeeper("Bob");
        innkeeper.setRoomPrice(40);
        innkeeper.getSentences().add("I once was a trader. But now i finally was able to open up my own inn.");
        innkeeper.getSentences().add("Did you know that traders have to pay Goran GEIL to not get robbed? Crazy, right?");
        innkeeper.getSentences().add("I was a dear friend of the hero of hope. He always talked to me.");
        innkeeper.getSentences().add("In the old days traders were pretty useless. That's kind of sad");
        inn.setInnkeeper(innkeeper);
        town.getInns().add(inn);
        Shop shop = new Shop("The store of legends", Types.buildingType.Shop);
        Trader trader = new Trader("Logan the trader");
        trader.getItems().add(ItemController.getItemById(1));
        trader.getItems().add(ItemController.getArmorById(1));
        trader.getItems().add(ItemController.getArmorById(2));
        trader.getItems().add(ItemController.getArmorById(1));
        trader.getItems().add(ItemController.getWeaponById(2));
        trader.getItems().add(ItemController.getWeaponById(6));
        trader.getItems().add(ItemController.getWeaponById(3));
        trader.getItems().add(ItemController.getShieldById(2));
        trader.getSentences().add("I'm just a normal trader, but one day im going to be a unicorn hunter!");
        trader.getSentences().add("Did you know that the undead didn't exist until Goran arrived?");
        trader.setMoney(300);
        shop.getTraders().add(trader);
        Trader witch = new Trader("Ingrid the witch");
        witch.getItems().add(ItemController.getPotionById(1));
        witch.getItems().add(ItemController.getPotionById(2));
        witch.getItems().add(ItemController.getPotionById(3));
        witch.getItems().add(ItemController.getPoisonById(1));
        witch.getItems().add(ItemController.getPoisonById(2));
        witch.getItems().add(ItemController.getPoisonById(3));
        witch.getItems().add(ItemController.getItemById(2));
        witch.getSentences().add("It's nice that witches are finally accepted as normal people");
        witch.getSentences().add("Witches are not able to cast magic. But we can create poisons and potions.");
        witch.setMoney(200);
        shop.getTraders().add(witch);
        towns.add(town);
    }

    private void generateDefaultDungeons(){
        dungeons.add(new Dungeon(Types.dungeonType.darkness, 5));
        dungeons.add(new Dungeon(Types.dungeonType.earth, 5));
        dungeons.add(new Dungeon(Types.dungeonType.fire, 5));
        dungeons.add(new Dungeon(Types.dungeonType.ice, 5));
        dungeons.add(new Dungeon(Types.dungeonType.light, 5));
        dungeons.add(new Dungeon(Types.dungeonType.lightning, 5));
        dungeons.add(new Dungeon(Types.dungeonType.metal, 5));
        dungeons.add(new Dungeon(Types.dungeonType.nature, 5));
        dungeons.add(new Dungeon(Types.dungeonType.poison, 5));
        dungeons.add(new Dungeon(Types.dungeonType.unaspected, 5));
        dungeons.add(new Dungeon(Types.dungeonType.water, 5));
        dungeons.add(new Dungeon(Types.dungeonType.wind, 5));
    }

    private void generateDefaultPlayer(){
        Weapon weapon1 = ItemController.getWeaponById(1);
        Player.getInstance().getItems().add(weapon1);
        Player.getInstance().setWeapon(weapon1);
        Player.getInstance().getItems().add(ItemController.getItemById(1));
        Player.getInstance().getItems().add(ItemController.getItemById(1));
        Player.getInstance().getItems().add(ItemController.getItemById(1));
        Player.getInstance().getItems().add(ItemController.getItemById(1));
    }
}
