package source;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Created by Michael on 16.12.2016.
 */
public class World {
    private ArrayList<Dungeon> dungeons;
    private ArrayList<Town> towns;

    public World (){
        dungeons = new ArrayList<Dungeon>();
        towns = new ArrayList<Town>();
    }

    public ArrayList<Dungeon> getDungeons(){
        return dungeons;
    }

    public ArrayList<Town> getTowns() {
        return towns;
    }

    public void generateDefault(){
        throw new NotImplementedException();
    }
}
