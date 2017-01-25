package source;

import java.util.ArrayList;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    13.01.2017
 */

public class StoryController {
    public static ArrayList<String> getIntro(){
        ArrayList<String> intro = new ArrayList<>();
        intro.add("Ten years ago, there was an evil lich, frightening our people.");
        intro.add("The lich build a mighty tower, with creatures in there, so terrifying, the people of the little town Paladia wanted to flee.");
        intro.add("Then, one day, a mighty hero came, and slayed the creature.");
        intro.add("People call him: 'The Hero of Hope'");
        intro.add("");
        intro.add("Now, ten years later, the creature came back and spawned 12 new towers.");
        intro.add("The hero was no were to be found...");
        intro.add("");
        intro.add("Please, help the kingdom of Angelfall.");
        intro.add("We need a new hero!!!");
        return intro;
    }

    public static ArrayList<String> getCredits(){
        ArrayList<String> credits = new ArrayList<>();
        credits.add("Developers:");
        credits.add("Michael van der Heide");
        credits.add("Enrico Chatelin");
        credits.add("Paolo Stieger");
        credits.add("");
        credits.add("Soundtrack:");
        credits.add("Jonas Fendriger");
        credits.add("Remo Hösli");
        credits.add("");
        credits.add("Graphics:");
        credits.add("Michael van der Heide");
        credits.add("");
        credits.add("Thank you for playing 'The Tower of Doom'");
        return credits;
    }
}
