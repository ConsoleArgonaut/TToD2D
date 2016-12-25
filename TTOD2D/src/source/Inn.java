package source;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Created by Michael on 16.12.2016.
 */
public class Inn extends Building {
    private ArrayList<NPC> npcs;
    private Innkeeper innkeeper;

    public Inn(){
        super("Inn", Types.buildingType.Inn);
        npcs = new ArrayList<>();
        innkeeper = new Innkeeper("Unknown Innkeeper");
    }

    public Inn(Innkeeper innkeeperToSet, ArrayList<NPC> npcsToSet){
        super("Inn", Types.buildingType.Inn);
        innkeeper = innkeeperToSet;
        npcs = npcsToSet;
    }

    public Inn(Innkeeper innkeeperToSet, ArrayList<NPC> npcsToSet, String innName){
        super(innName, Types.buildingType.Inn);
        innkeeper = innkeeperToSet;
        npcs = npcsToSet;
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

    public Status takeADump(){
        Status status = new Status();
        status.setDuration(5);
        status.setName("Relaxed");
        status.setPotency(20);
        Player.getInstance().setStatus(status);
        return status;
    }
}
