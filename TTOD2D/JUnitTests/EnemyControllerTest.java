import org.junit.Assert;
import org.junit.Test;
import source.Enemy;
import source.EnemyController;
import source.Types;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class EnemyControllerTest {
    @Test
    public void getEnemies() {
        for (Types.dungeonType type:Types.dungeonType.values()) {
            if(type != Types.dungeonType.death){
                ArrayList<Enemy> enemies = new EnemyController().getEnemies(type);
                Assert.assertTrue(enemies.size() > 0);
            }
        }
    }

    @Test
    public void getFloorBoss() {
        for (Types.dungeonType type:Types.dungeonType.values()) {
            if(type != Types.dungeonType.death){
                for (int i = 0; i < 5; i++) {
                    Enemy enemy = new EnemyController().getFloorBoss(type, i);
                    Assert.assertTrue(enemy != null);
                }
            }
        }
    }

    @Test
    public void getDungeonBoss() {
        for (Types.dungeonType type:Types.dungeonType.values()) {
            Enemy enemy = new EnemyController().getDungeonBoss(type);
            Assert.assertTrue(enemy != null);
        }
    }

    @Test
    public void getEnemyByName() throws Exception {
        Enemy enemy = new EnemyController().getEnemyByName("Steve");
        Assert.assertTrue(enemy != null);
    }

}