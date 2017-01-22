package source;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Drake on 16.12.2016.
 */
public class Combat {

    private Enemy CurrentEnemy;

    public Combat(Enemy enemy) {
        CurrentEnemy = enemy;
    }

    /**
     * Attack Enemy
     */
    public CombatResult attack() {
        CombatResult result = new CombatResult();
        result.setEnemyHadFirstHit(enemyHasFirstHit());

        //Enemy Attacks first
        if (result.getEnemyHadFirstHit())
            result = enemyMove(result);

        //Player attacks if still alive
        if (Player.getInstance().getLife() > 0 && result.getEnemyAction() != Types.combatActionResult.Escaped) {
            result.setPlayerAction(Types.combatActionResult.Attacked);
            //Calculates Damage
            result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)));
            if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
            //Deals Damage to enemy
            if (result.getEnemyLifeDifference() <= 0)
                CurrentEnemy.setLife(CurrentEnemy.getLife() + result.getEnemyLifeDifference());
            else if (result.getEnemyLifeDifference() > 0) {
                result.setEnemyLifeDifference(0);
                CurrentEnemy.setLife(CurrentEnemy.getLife() + result.getEnemyLifeDifference());
            }
            result.setPlayerAction(Types.combatActionResult.Attacked);
        }
        //Enemy Attacks 2nd if still alive
        if (!(result.getEnemyLifeDifference() > 0 && CurrentEnemy.getLife() > 0))
            result = enemyMove(result);
        return endRound(result);
    }

    /**
     * Defend against Enemy
     */
    private CombatResult defense() {
        CombatResult result = new CombatResult();
        result.setPlayerAction(Types.combatActionResult.Defended);
        return endRound(enemyMove(result));
    }

    /**
     * Use Potion to heal yourself
     */
    public CombatResult usePotion(Potion item) {
        CombatResult result = new CombatResult();
        if (item.getType() == Types.itemType.Potion) {
            result.setPlayerAction(Types.combatActionResult.ItemUsed);
            Player.getInstance().setLife(Player.getInstance().getLife() + item.getHealing());
        }
        if (CurrentEnemy.getLife() > 0)
            result = enemyMove(result);
        return endRound(result);
    }

    /**
     * Escape from Combat
     */
    public CombatResult flee() {
        CombatResult result = new CombatResult();
        result.setEnemyHadFirstHit(enemyHasFirstHit());
        result.setPlayerAction(Types.combatActionResult.Escaped);
        if (result.getEnemyHadFirstHit() == true)
            result = enemyMove(result);
        else
            result.setEnemyAction(Types.combatActionResult.Waited);
        return endRound(result);
    }

    /**
     * Wait a round and let Enemy perform a move
     */
    public CombatResult getAttacked() {
        CombatResult result = new CombatResult();
        result.setPlayerAction(Types.combatActionResult.Waited);
        return endRound(enemyMove(result));
    }

    /**
     * Calculates the first to attack
     * returns true if enemy has first hit
     */
    private boolean enemyHasFirstHit() {
        int playerChance = 0;
        if(!(Player.getInstance().getStatus() = StatusController.getStatus(Types.effect.Stunned))) {
            if (CurrentEnemy.getInitiative() < Player.getInstance().getInitiative())
                playerChance = playerChance + 2;
            if (new java.util.Random().nextBoolean())
                playerChance++;
            if (playerChance >= 3)
                return false;
            else
                return true;
        }
    }

    private CombatResult enemyMove(CombatResult result) {
        //Calculates Enemy Move
        if (CurrentEnemy.getLife() > 0) {
            if (result.getEnemyHadFirstHit()) {
                if (CurrentEnemy.getLife() > (CurrentEnemy.getMaxLife() * 0.25)) {
                    if (new Random().nextBoolean() || new Random().nextBoolean())
                        result = enemyAttacks(result);
                    else
                        result.setEnemyAction(Types.combatActionResult.Defended);
                } else if (new Random().nextBoolean())
                    result = enemyAttacks(result);
                else if (new Random().nextBoolean() || new Random().nextBoolean())
                    result.setEnemyAction(Types.combatActionResult.Defended);
                else
                    result.setEnemyAction(Types.combatActionResult.Escaped);
            } else if (new Random().nextBoolean() || new Random().nextBoolean() || new Random().nextBoolean() || new Random().nextBoolean() || new Random().nextBoolean()) {
                result.setEnemyAction(Types.combatActionResult.Attacked);
                result = enemyAttacks(result);
            } else
                result.setEnemyAction(Types.combatActionResult.Escaped);
            return result;
        }
        return result;
    }

    private CombatResult enemyAttacks(CombatResult result) {
        result.setEnemyAction(Types.combatActionResult.Attacked);
        //Calculates Damage
        result.setPlayerLifeDifference(CurrentEnemy.getAttack() - (Player.getInstance().getDefense() + (Player.getInstance().getArmor() != null ? Player.getInstance().getArmor().getDefence() : 0)) + (Player.getInstance().getShield() != null ? Player.getInstance().getShield().getDefence() : 0));
        if (!result.getEnemyHadFirstHit() && result.getPlayerAction() == Types.combatActionResult.Defended)
            result.setPlayerLifeDifference(result.getPlayerLifeDifference() - (Player.getInstance().getDefense() + (Player.getInstance().getArmor() != null ? Player.getInstance().getArmor().getDefence() : 0)) / 100 * result.getPlayerLifeDifference());
        //Deals Damage to enemy
        if (result.getPlayerLifeDifference() <= 0)
            Player.getInstance().setLife(Player.getInstance().getLife() + result.getPlayerLifeDifference());
        else {
            result.setPlayerLifeDifference(0);
            Player.getInstance().setLife(Player.getInstance().getLife() + result.getPlayerLifeDifference());
        }
        result.setEnemyAction(Types.combatActionResult.Attacked);
        return result;
    }

    private CombatResult endRound(CombatResult result) {
        if (CurrentEnemy.getLife() > 0) {
            if (CurrentEnemy.getItems().size() > 0)
                for (Item item : CurrentEnemy.getItems()) {
                    Player.getInstance().setItems(CurrentEnemy.getItems());
                }
            Player.getInstance().setMoney(Player.getInstance().getMoney() + CurrentEnemy.getMoney());
        }
        return result;

    }
}
