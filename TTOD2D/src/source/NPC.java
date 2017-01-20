package source;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Michael on 16.12.2016.
 */
public class NPC extends Character implements java.io.Serializable {
    private ArrayList<String> sentences;

    public NPC(String npcName){
        super();
        sentences = new ArrayList<>();
        setName(npcName);
    }

    public NPC(String npcName, ArrayList<String> npcSentences){
        this(npcName);
        sentences = npcSentences;
    }

    public ArrayList<String> getSentences(){
        return sentences;
    }

    public void setSentences(ArrayList<String> sentencesToSet){
        sentences=sentencesToSet;
    }

    public String talk(){
        int min = 0;
        int max = sentences.size() - 1;
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        return sentences.get(randomNumber);
    }
}
