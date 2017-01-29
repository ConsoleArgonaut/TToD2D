import org.junit.Assert;
import org.junit.Test;
import source.Dungeon;
import source.Floor;
import source.Types;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class DungeonTest {
    @Test
    public void generateFloors() {
        Dungeon dungeon = new Dungeon();
        dungeon.setFloorCount(5);
        dungeon.setType(Types.dungeonType.fire);
        dungeon.generateFloors();
        Assert.assertTrue(dungeon.getFloors().size() == 5);
    }

    @Test
    public void getNextFloor() {
        Dungeon dungeon = new Dungeon();
        dungeon.setFloorCount(5);
        dungeon.setType(Types.dungeonType.fire);
        dungeon.generateFloors();
        for (int i = 0; i < 5; i++) {
            Floor f = dungeon.getFloors().get(i);
            Floor temp = dungeon.getNextFloor();
            Assert.assertTrue(f == temp);
            temp.getNextCombat();
            temp.getNextCombat();
            temp.getNextCombat();
            temp.getNextCombat();
            temp.getNextCombat();
        }
    }

}