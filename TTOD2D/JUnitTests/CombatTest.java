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
        Player.getInstance().resetPlayer();
        Combat combat = new Combat();
        combat.setCurrentEnemy(new EnemyController().getEnemyByName("Steve"));
        new World().generateDefaultPlayer();
        Player.getInstance().setMaxLife(10000);
        Player.getInstance().setLife(10000);
        Skill s = new Skill();
        s.setName("Ice Needle");
        s.setManaCost(0);
        s.setPotency(1);
        s.setUnlockedAt(1);
        Player.getInstance().getSkills().add(s);
        Player.getInstance().setAttack(1500);
        float enemyLife = combat.getCurrentEnemy().getLife();
        boolean attackMissed = true;
        while (attackMissed){
            CombatResult c = combat.attack(Player.getInstance().getSkills().get(0));
            if(c.getPlayerAction() == Types.combatActionResult.Attacked && combat.getCurrentEnemy().getLife() < enemyLife)
                attackMissed = false;
        }
    }

    @Test
    public void usePotion() {
        Player.getInstance().resetPlayer();
        Combat combat = new Combat();
        combat.setCurrentEnemy(new EnemyController().getEnemyByName("Steve"));
        Player.getInstance().setMaxLife(10000);
        Player.getInstance().setLife(8000);

        Potion potion = new Potion();
        potion.setName("Normal Potion");
        potion.setValue(200);
        potion.setHealing(400);
        potion.setType(Types.itemType.Potion);
        Player.getInstance().getItems().add(potion);
        CombatResult c = combat.usePotion((Potion) Player.getInstance().getItems().get(0));
        Assert.assertTrue(Player.getInstance().getLife() > 8000);
    }

    @Test
    public void usePoison() {
        Player.getInstance().resetPlayer();
        Combat combat = new Combat();
        combat.setCurrentEnemy(new EnemyController().getEnemyByName("Steve"));
        Player.getInstance().setMaxLife(10000);
        Player.getInstance().setLife(8000);

        Poison poison = new Poison();
        poison.setName("Normal Poison");
        poison.setValue(200);
        poison.setPotency(60);
        poison.setType(Types.itemType.Poison);
        Player.getInstance().getItems().add(poison);
        combat.usePoison((Poison) Player.getInstance().getItems().get(0));
        Assert.assertTrue(combat.getCurrentEnemy().getStatus().getName() == "Poisoned");
    }

    @Test
    public void flee() {
        Player.getInstance().resetPlayer();
        Combat combat = new Combat();
        combat.setCurrentEnemy(new EnemyController().getEnemyByName("Steve"));
        Player.getInstance().setMaxLife(10000);
        Player.getInstance().setLife(8000);
        boolean isActive = true;
        int i = 0;
        while (isActive){
            CombatResult c = combat.flee();
            if(c.getPlayerAction() == Types.combatActionResult.Escaped)
                isActive = false;
            i++;
            if(i > 100)
                Assert.assertTrue(false);
        }
    }

    @Test
    public void getAttacked() {
        Player.getInstance().resetPlayer();
        Combat combat = new Combat();
        combat.setCurrentEnemy(new EnemyController().getEnemyByName("Steve"));
        Player.getInstance().setMaxLife(10000);
        Player.getInstance().setLife(8000);
        combat.getCurrentEnemy().setAttack(1000);
        boolean isActive = true;
        int i = 0;
        while (isActive){
            CombatResult c = combat.getAttacked();
            if(c.getEnemyAction() == Types.combatActionResult.Attacked)
                isActive = false;
        }
        Assert.assertTrue(Player.getInstance().getLife() < 8000);
        Assert.assertTrue(combat.getCurrentEnemy().getLife() == combat.getCurrentEnemy().getMaxLife());
    }

}