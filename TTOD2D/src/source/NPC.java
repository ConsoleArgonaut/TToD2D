package source;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class NPC extends Character implements java.io.Serializable {

    /**
     * This method is used to save an ArrayList of Sentences that are used by the NPCs.
     */
    private ArrayList<String> sentences;

    /**
     * This methode is used to assign an ArrayList of sentences to an NPCs.
     * @param npcName npcName holdes a String containing the name of a NPC.
     */
    public NPC(String npcName){
        super();
        sentences = new ArrayList<>();
        setName(npcName);
    }

    /**
     * This method is used to initialise the sentences of an NPC.
     * @param npcName npcName hold's a String containing the name of a NPC.
     * @param npcSentences Holds a list of sentences.
     */
    public NPC(String npcName, ArrayList<String> npcSentences){
        this(npcName);
        sentences = npcSentences;
    }

    /**
     * This method is used to initialise the sentences of an NPC.
     * @param npcName npcName hold's a String containing the name of a NPC.
     * @param npcSentences Holds a list of sentences.
     */
    public NPC(String npcName, String[] npcSentences){
        this(npcName);
        setSentences(npcSentences);
    }

    public ArrayList<String> getSentences(){
        return sentences;
    }
    public void setSentences(ArrayList<String> sentencesToSet){
        sentences=sentencesToSet;
    }
    public void setSentences(String[] sentencesToSet){
        sentences = new ArrayList<>();
        for (String sentence:sentencesToSet) {
            sentences.add(sentence);
        }
    }

    /**
     * This method is used to direct the talk-with-npcs function
     * @return sentences.get(randomNumber)
     */
    public String talk(){
        int min = 0;
        int max = sentences.size() - 1;
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return sentences.get(randomNumber);
    }
}
