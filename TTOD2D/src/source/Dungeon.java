package source;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Michael on 16.12.2016.
 */
public class Dungeon implements java.io.Serializable{
    private ArrayList<Floor> floors;

    private int floorCount;

    public void setName(String name) {
        Dungeon.name = name;
    }

    private static String name;

    private Types.dungeonType type;

    private boolean isCleared;

    public Dungeon(){
        floors = new ArrayList<>();
        floorCount = 0;
        type = Types.dungeonType.unaspected;
        isCleared = false;
        name = "";
    }

    public Dungeon(Types.dungeonType dungeonType, int dungeonFloorCount){
        this();
        type = dungeonType;
        floorCount = dungeonFloorCount;
        generateFloors();
    }

    public Types.dungeonType getType() {
        return type;
    }

    public void setType(Types.dungeonType type) {
        this.type = type;
    }

    public boolean isCleared() {
        return isCleared;
    }

    public void setCleared(boolean cleared) {
        isCleared = cleared;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public void generateFloors(){
        for (int i = 0; i < floorCount; i++) {
            Floor currentFloor;
            if(i != 4)
                currentFloor = new Floor(new EnemyController().getEnemies(type), new EnemyController().getFloorBoss(type, i + 1));
            else
                currentFloor = new Floor(new EnemyController().getEnemies(type), new EnemyController().getDungeonBoss(type));
            floors.add(currentFloor);
        }
    }

    public Floor getNextFloor(){
        Floor floor = null;
        boolean isSet = false;
        for (Floor x:floors) {
            if(!isSet)
                if(x.getEnemiesDefeated() < 6) {
                    isSet = true;
                    floor = x;
                }
        }
        return floor;
    }

    public String getName() {
        String returnValue = name;
        if(returnValue == "")
            switch (this.type){
                case darkness:
                    returnValue = "Dark dungeon of doom";
                    break;
                case earth:
                    returnValue = "Dungeon of earth";
                    break;
                case fire:
                    returnValue = "Lava temple";
                    break;
                case ice:
                    returnValue = "Snow palace";
                    break;
                case light:
                    returnValue = "Bright place?";
                    break;
                case lightning:
                    returnValue = "Cloud paradise";
                    break;
                case metal:
                    returnValue = "Metal concert";
                    break;
                case poison:
                    returnValue = "Witch village";
                    break;
                case nature:
                    returnValue = "Sunny hill of the evil creatures";
                    break;
                case unaspected:
                    returnValue = "Plain dungeon";
                    break;
                case wind:
                    returnValue = "Dungeon of the blowing wind";
                    break;
                case water:
                    returnValue = "Boat of aqua";
                    break;
            }
        return returnValue;
    }
}
