import org.junit.Assert;
import org.junit.Test;
import source.*;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class FloorTest {
    @Test
    public void getNextCombat() {
        Floor floor = new Floor();
        floor.setEnemies(new EnemyController().getEnemies(Types.dungeonType.darkness));
        floor.setFloorBoss(new EnemyController().getFloorBoss(Types.dungeonType.darkness, 1));
        for (int i = 0; i < 5; i++) {
            Combat c = floor.getNextCombat();
            if(i == 5){
                Assert.assertTrue(c.getCurrentEnemy().getName() == floor.getFloorBoss().getName());
            }
            else {
                boolean enemyIsCorrect = false;
                for (Enemy e:floor.getEnemies()) {
                    if(e.getName() == c.getCurrentEnemy().getName())
                        enemyIsCorrect = true;
                }
                Assert.assertTrue(enemyIsCorrect);
            }
        }
    }
}