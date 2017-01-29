import org.junit.Assert;
import org.junit.Test;
import source.*;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class CombatTest {
    @Test
    public void attack() {
        Combat combat = new Combat();
        combat.setCurrentEnemy(new EnemyController().getEnemyByName("Steve"));
        new World().generateDefaultPlayer();
        Skill s = new Skill();
        s.setName("Attack");
        s.setManaCost(0);
        s.setPotency(1);
        s.setUnlockedAt(1);
        Player.getInstance().getSkills().add(s);
        Player.getInstance().setMaxLife(10000);
        Player.getInstance().setLife(10000);
        float enemyLife = combat.getCurrentEnemy().getLife();
        boolean attackMissed = true;
        while (attackMissed){
            CombatResult c = combat.attack(Player.getInstance().getSkills().get(0));
            if(c.getPlayerAction() == Types.combatActionResult.Attacked)
                attackMissed = false;
        }
        Assert.assertTrue(combat.getCurrentEnemy().getLife() < enemyLife);
    }

    @Test
    public void usePotion() throws Exception {

    }

    @Test
    public void usePoison() throws Exception {

    }

    @Test
    public void flee() throws Exception {

    }

    @Test
    public void getAttacked() throws Exception {

    }

}