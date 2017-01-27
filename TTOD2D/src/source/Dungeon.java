package source;

import java.util.ArrayList;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    27.12.2016
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

    /**
     * @return Returns the type when called.
     */
    public Types.dungeonType getType() {
        return type;
    }

    /**
     * Sets the type of the dungeon.
     * @param type The value to set.
     */
    public void setType(Types.dungeonType type) {
        this.type = type;
    }

    /**
     * @return Returns the isCleared when called.
     */
    public boolean isCleared() {
        return isCleared;
    }

    /**
     * Sets if the dungeon is cleared.
     * @param cleared The value to set.
     */
    public void setCleared(boolean cleared) {
        isCleared = cleared;
    }

    /**
     * @return Returns the floorCount when called.
     */
    public ArrayList<Floor> getFloors() {
        return floors;
    }

    /**
     * Sets the floors.
     * @param floors The floors to set.
     */
    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    /**
     * @return Returns the floorCount when called.
     */
    public int getFloorCount() {
        return floorCount;
    }

    /**
     * Sets the floor count.
     * @param floorCount The floor count to set.
     */
    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    /**
     * Generates the floors in the dungeon.
     */
    public void generateFloors(){
        for (int i = 0; i < floorCount; i++) {
            Floor currentFloor;
            if(i != floorCount - 1)
                currentFloor = new Floor(new EnemyController().getEnemies(type), new EnemyController().getFloorBoss(type, i + 1));
            else
                currentFloor = new Floor(new EnemyController().getEnemies(type), new EnemyController().getDungeonBoss(type));
            floors.add(currentFloor);
        }
    }

    /**
     * Gets the next floor that isn't cleared yet.
     * @return The next floor for the player to go in.
     */
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

    /**
     * This method gets the name of the current dungeon or returns standard dungeonname for dungeontype
     * @return The name of the current dungeon.
     */
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
