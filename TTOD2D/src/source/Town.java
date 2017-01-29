package source;

import java.util.ArrayList;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Town implements java.io.Serializable {

    /**
     * This variable is used to save an ArrayList containing inns.
     */
    private ArrayList<Inn> inns;

    /**
     * This variable is used to save an ArrayList containing shops.
     */
    private ArrayList<Shop> shops;

    /**
     * This variable is used to save a name.
     */
    private String name;

    public Town(){
        inns = new ArrayList<>();
        shops = new ArrayList<>();
        name = "";
    }

    public String getName(){
        return name;
    }
    public void setName(String nameToSet){
        name = nameToSet;
    }
    public ArrayList<Inn> getInns(){
        return inns;
    }
    public void setInns(ArrayList<Inn> innsToSet) {
        inns = innsToSet;
    }
    public ArrayList<Shop> getShops(){
        return shops;
    }
    public void setShops(ArrayList<Shop> shopsToSet) {
        shops = shopsToSet;
    }
    public ArrayList<Building> getBuildings(){
        ArrayList<Building> returnValue = new ArrayList<>();
        for (Building b:inns) {
            returnValue.add(b);
        }
        for (Building b:shops) {
            returnValue.add(b);
        }
        return returnValue;
    }
}
