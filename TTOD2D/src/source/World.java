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

    public World (ArrayList<Dungeon> dungeonsToSet, ArrayList<Town> townsToSet ){
        dungeons = dungeonsToSet;
        towns = townsToSet;
    }

    public ArrayList<Dungeon> getDungeons(){
        return dungeons;
    }

    public ArrayList<Town> getTowns() {
        return towns;
    }

    public void generateDefault(){
        generateDefaultTown1();
        generateDefaultTown2();
        generateDefaultDungeons();
    }

    private void generateDefaultTown1(){
        Town town = new Town();
        town.setName("Paladia");
        // Create Shop 1
        Shop shop = new Shop();
        shop.setName("Random Shop");
        shop.setTraders(new ArrayList<Trader>());
        shop.getTraders().add(new Trader("Alfred"));
        shop.getTraders().get(0).getSentences().add("Hello there, how are you?");
        shop.getTraders().get(0).getSentences().add("Well if that isn't another self proclaimed hero...");
        Item chunk = new Item();
        chunk.setName("Chunk");
        chunk.setMaxCount(40);
        chunk.setValue(40);
        shop.getTraders().get(0).getItems().add(chunk);
        town.getShops().add(shop);
        Inn inn = new Inn();
        inn.getNpcs().add(new NPC("Steve"));
        inn.getNpcs().get(0).getSentences().add("Your Princess is in another castle");
        inn.getInnkeeper().setName("Beatrice");
        town.getInns().add(inn);
        towns.add(town);
    }

    private void generateDefaultTown2(){
        Town town = towns.get(0);
        town.setName("Necroma");
        towns.add(town);
    }

    private void generateDefaultDungeons(){
        dungeons.add(new Dungeon(Types.dungeonType.darkness, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.earth, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.fire, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.ice, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.light, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.lightning, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.metal, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.nature, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.poison, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.unaspected, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.water, 5, 5, 10));
        dungeons.add(new Dungeon(Types.dungeonType.wind, 5, 5, 10));
    }
}
