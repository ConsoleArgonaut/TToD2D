package source;

import java.util.ArrayList;

/**
 * Created by Michael on 16.12.2016.
 */
public class Town implements java.io.Serializable {
    private ArrayList<Inn> inns;
    private ArrayList<Shop> shops;
    private String name;

    public Town(){
        inns = new ArrayList<>();
        shops = new ArrayList<>();
        name = "";
    }

    public Town(String townName){
        this();
        name = townName;
    }

    public Town(String townName, ArrayList<Inn> innsToSet, ArrayList<Shop> shopsToSet){
        name = townName;
        inns = innsToSet;
        shops = shopsToSet;
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
