package source;

import java.util.ArrayList;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Inn extends Building implements java.io.Serializable {

    /**
     * This variable is used to save all NPCs into an ArrayList.
     */
    private ArrayList<NPC> npcs;

    /**
     * This variable is used to save innkeeper
     */
    private Innkeeper innkeeper;

    public Inn(){
        super("Inn", Types.buildingType.Inn);
        npcs = new ArrayList<>();
        innkeeper = new Innkeeper("Unknown Innkeeper");
    }

    public ArrayList<NPC> getNpcs(){
        return npcs;
    }
    public void setNpcs(ArrayList<NPC> npcsToSet){
        npcs = npcsToSet;
    }
    public Innkeeper getInnkeeper(){
        return innkeeper;
    }
    public void setInnkeeper(Innkeeper innkeeperToSet){
        innkeeper = innkeeperToSet;
    }

    /**
     * This method checks when the Player last visited the toilet.
     * @return status
     */
    public Status takeADump(){
        Status status = new Status();
        status.setDuration(5);
        status.setName("Relaxed");
        status.setPotency(20);
        Player.getInstance().setStatus(status);
        return status;
    }
}
