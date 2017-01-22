package tui;

import source.*;

import java.lang.Character;
import java.util.ArrayList;
import java.util.Scanner;

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
        overworld();
    }

    private static boolean gameIsActive = true;

    private static void overworld(){
        while (gameIsActive){
            ArrayList<String> locations = new ArrayList<>();
            for (Town t:world.getTowns()) {
                locations.add(t.getName() + " (Town)");
            }
            for (Dungeon d:world.getDungeons()) {
                String dungeonname = d.getName();
                if(d.isCleared())
                    dungeonname += " (Cleared)";
                locations.add(dungeonname);
            }
            int nextLocation = askQuestion("Where do you wanna go?", locations);
            if (nextLocation < world.getTowns().size())
                goToTown(world.getTowns().get(nextLocation));
            else
                goToDungeon(world.getDungeons().get(world.getDungeons().size() - world.getTowns().size()));
        }
    }

    private static void goToTown(Town town){
        boolean townIsActive = true;
        while (townIsActive)
        {
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
        while(innIsActive)
        {
            writeline("You entered: " + inn.getName());
            seperator();
            int nextMove = 0;
            ArrayList<String> innPossibleMoves = new ArrayList<>();
            innPossibleMoves.add("Talk to" + inn.getInnkeeper().getName() + " (Innkeeper)");
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
        while(innkeeperIsActive){
            ArrayList<String> innkeeperPossibleMoves = new ArrayList<>();
            innkeeperPossibleMoves.add("Talk");
            innkeeperPossibleMoves.add("Get a room to sleep in " + innkeeper.getRoomPrice() + " GEIL");
            innkeeperPossibleMoves.add("Exit");

            switch(askQuestion("What do you wanna do?", innkeeperPossibleMoves)){
                case 0:
                    writeline(innkeeper.getName() + "said: ");
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
        writeline("You entered an Shop, congratulations");
    }

    private static void goToDungeon(Dungeon dungeon){
        writeline("You entered an Dungeon, congratulations");
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
        System.out.println("[]---------------------------------------------------------------------[]");
    }
    /** Ask a Question and get Answer */
    private static int askQuestion(String question, String[] possibleAnswers){
        int returnValue = 0;
        writeline(question);
        for (int i = 0; i < possibleAnswers.length - 1; i++) {
            writeline((i+1) + ") " + possibleAnswers[i]);
        }
        boolean inputIsCorrect = false;
        while(!inputIsCorrect){
            String input = getInput();
            if(input.length() != 0){
                char answer = input.toCharArray()[0];
                returnValue = Character.getNumericValue(answer);
                returnValue--;
                if(returnValue >= possibleAnswers.length || returnValue < 0){
                    writeline("Please answer correctly");
                }
                else {
                    inputIsCorrect = true;
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
