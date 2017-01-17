package tui;

import source.Dungeon;
import source.StoryController;
import source.Town;
import source.World;

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

    private static void overworld(){
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
        if (nextLocation > world.getTowns().size())
            goToTown(world.getTowns().get(nextLocation));
        else
            goToDungeon(world.getDungeons().get(world.getDungeons().size() - world.getTowns().size()));
    }

    private static void goToTown(Town town){

    }

    private static void goToDungeon(Dungeon dungeon){

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
