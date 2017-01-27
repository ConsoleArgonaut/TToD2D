package source;

import java.util.Random;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Combat {

    private Enemy currentEnemy;
    private int duration;
    private float reposte;

    public Combat() {
        duration = 0;
        reposte = 0;
    }

    public Combat(Enemy enemy) {
        currentEnemy = enemy;
    }

    /**
     * This method calculates damage the player deals or the healing the player receives
     * @param skill Skill is the parameter which is executed.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    public CombatResult attack(Skill skill) {
        CombatResult result = new CombatResult();
        result.setEnemyHadFirstHit(enemyHasFirstHit());

        //Enemy Attacks first
        if (result.getEnemyHadFirstHit())
            result = enemyMove(result);

        //Player attacks if still alive
        if (Player.getInstance().getLife() > 0 && result.getEnemyAction() != Types.combatActionResult.Escaped) {
            result.setPlayerAction(Types.combatActionResult.Attacked);

            switch (skill.getName()) {
                case "Attack":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)));
                   if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                        currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Defence":
                    result.setPlayerAction(Types.combatActionResult.Defended);
                    break;
                case "Ice Needle":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 1)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Freezing));
                    break;
                case "Nature's Embrace":
                    Player.getInstance().setLife(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if (Player.getInstance().getLife() > Player.getInstance().getMaxLife()) {
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    break;
                case "Second Wind":
                    Player.getInstance().setLife(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if (Player.getInstance().getLife() > Player.getInstance().getMaxLife()) {
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    break;
                case "Fireball":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Burning));
                    break;
                case "Water's Embrace":
                    Player.getInstance().setLife(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if (Player.getInstance().getLife() > Player.getInstance().getMaxLife()) {
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    break;
                case "Iron Hammer":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Rockbullet":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Dark Endurance":
                    Player.getInstance().setLife(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if (Player.getInstance().getLife() > Player.getInstance().getMaxLife()) {
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    break;
                case "Throw Scrap":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)));
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Double Strike":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - ((Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)) * 2));
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Cure":
                    Player.getInstance().setLife(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if (Player.getInstance().getLife() > Player.getInstance().getMaxLife()) {
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    if (!(Player.getInstance().getStatus() == new StatusController().getStatus(Types.effect.Good)))
                        Player.getInstance().setStatus(new StatusController().getStatus(Types.effect.Good));
                    break;
                case "Ice Blast":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Freezing));
                    break;
                case "Fire Breath":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Burning));
                    break;
                case "Water Bullet":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Quake":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Life Conversion":
                    float LifeManaConversion = 0;
                    LifeManaConversion = ((Player.getInstance().getLife() / 100) * 20);
                    Player.getInstance().setLife(Player.getInstance().getLife() - LifeManaConversion);
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost() + LifeManaConversion);
                    break;
                case "Obscene Gesture":
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Riposte":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)) + reposte);
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Nature's Wrath":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Wingbeat":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Iron Breacker":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Shadow Orb":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Relentless Endurance":
                    Player.getInstance().setStatus(new StatusController().getStatus(Types.effect.Unrelenting));
                    break;
                case "Reaper":
                    float LifeDamageConversion;
                    LifeDamageConversion = ((Player.getInstance().getLife() / 100) * 20);
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - ((Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0) + LifeDamageConversion) * skill.getPotency()));
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Permafrost":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Freezing));
                    break;
                case "Genesis":
                    Player.getInstance().setLife(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if (Player.getInstance().getLife() > Player.getInstance().getMaxLife()) {
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    if (!(Player.getInstance().getStatus() == new StatusController().getStatus(Types.effect.Good)))
                        Player.getInstance().setStatus(new StatusController().getStatus(Types.effect.Good));
                    break;
                case "Firestorm":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Burning));
                    break;
                case "Hydraulic Impact":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Netherworld":
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - ((Player.getInstance().getIntelligence() + (Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    break;
                case "Overdrive":
                    float ManaDamageConversion = 0;
                    ManaDamageConversion = Player.getInstance().getMana();
                    result.setEnemyLifeDifference(currentEnemy.getDefense() - ((Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0) + ManaDamageConversion) * skill.getPotency()));
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - currentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
                    Player.getInstance().setMana(0);
                    break;
            }
            //Deals Damage to enemy
            if (result.getEnemyLifeDifference() <= 0)
                currentEnemy.setLife(currentEnemy.getLife() + result.getEnemyLifeDifference());
            else if (result.getEnemyLifeDifference() > 0) {
                result.setEnemyLifeDifference(0);
                currentEnemy.setLife(currentEnemy.getLife() + result.getEnemyLifeDifference());
            }
            result.setPlayerAction(Types.combatActionResult.Attacked);
        }
        //Enemy Attacks 2nd if still alive
        if (!(result.getEnemyLifeDifference() > 0 && currentEnemy.getLife() > 0))
            result = enemyMove(result);
        return endRound(result);
    }

    /**
     * This method calculates how a potion effects the Player if he owns a any potion
     * @param item Item is the parameter which is used.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    public CombatResult usePotion(Potion item) {
        CombatResult result = new CombatResult();
        if (item.getType() == Types.itemType.Potion) {
            result.setPlayerAction(Types.combatActionResult.ItemUsed);
            Player.getInstance().setLife(Player.getInstance().getLife() + item.getHealing());
        }
        if (currentEnemy.getLife() > 0)
            result = enemyMove(result);
        return endRound(result);
    }

    /**
     * This method calculates how a poison effects the current enemy if the Player owns a any poison.
     * @param item Item is the parameter which is used.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    public CombatResult usePoison(Poison item) {
        CombatResult result = new CombatResult();
        if (item.getType() == Types.itemType.Poison) {
            result.setPlayerAction(Types.combatActionResult.ItemUsed);
            currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Poisoned));
        }
        if (currentEnemy.getLife() > 0)
            result = enemyMove(result);
        return endRound(result);
    }

    /**
     * This method determines how the Player acts if the command to "flee" is given.
     * @return This method returns endRound(result) which contains the result of the calculation.
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
     * This method determines how the Player acts if the command to "wait" is given.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    public CombatResult getAttacked() {
        CombatResult result = new CombatResult();
        result.setPlayerAction(Types.combatActionResult.Waited);
        return endRound(enemyMove(result));
    }

    /**
     * This method determines if the Player or the enemy is first to act in combat.
     * @return Returns true if the enemy is first and returns false if the Player is first to act.
     */
    private boolean enemyHasFirstHit() {
        int playerChance = 0;
        if (currentEnemy.getInitiative() < Player.getInstance().getInitiative())
            playerChance = playerChance + 2;
        if (new java.util.Random().nextBoolean())
            playerChance++;
        if (playerChance >= 3)
            return false;
        else
            return true;
    }

    /**
     * This method determines the next action of the enemy.
     * @param result CombatResult passes the enemy's chosen action.
     * @return Returns the result of the enemy's chosen action.
     */
    private CombatResult enemyMove(CombatResult result) {
        //Calculates Enemy Move
        if (currentEnemy.getLife() > 0) {
            if (!(currentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Stunned) || currentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Freezing))) {
                if (result.getEnemyHadFirstHit()) {
                    if (currentEnemy.getLife() > (currentEnemy.getMaxLife() * 0.25)) {
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
            } else {
                result.setEnemyAction(Types.combatActionResult.Waited);
            }
            return result;
        }
        return result;
    }

    /**
     * This method calculates the damage the enemy deals to the Player if the chosen action the enemy made is attack.
     * @param result CombatResult passes the enemy's chosen action.
     * @return Returns the result of the enemy's chosen action.
     */
    private CombatResult enemyAttacks(CombatResult result) {
        result.setEnemyAction(Types.combatActionResult.Attacked);

        //Calculates Damage
        result.setPlayerLifeDifference(currentEnemy.getAttack() - (Player.getInstance().getDefense() + (Player.getInstance().getArmor() != null ? Player.getInstance().getArmor().getDefence() : 0)) + (Player.getInstance().getShield() != null ? Player.getInstance().getShield().getDefence() : 0));
        reposte = result.getPlayerLifeDifference();
        if (!result.getEnemyHadFirstHit() && result.getPlayerAction() == Types.combatActionResult.Defended)
            result.setPlayerLifeDifference(result.getPlayerLifeDifference() - (Player.getInstance().getDefense() + (Player.getInstance().getArmor() != null ? Player.getInstance().getArmor().getDefence() : 0)) / 100 * result.getPlayerLifeDifference());
        //Deals Damage to enemy
        if (result.getPlayerLifeDifference() >= 0)
            Player.getInstance().setLife(Player.getInstance().getLife() - result.getPlayerLifeDifference());
        else {
            result.setPlayerLifeDifference(0);
            Player.getInstance().setLife(Player.getInstance().getLife() - result.getPlayerLifeDifference());
        }
        result.setEnemyAction(Types.combatActionResult.Attacked);
        return result;
    }

    /**
     * This method calculates the damage the enemy takes from abnormal status effects he currently has and if the enemy is dead the Player receives all items held by the enemy and gains experience.
     * @param result CombatResult passes the enemy's and the Players chosen action.
     * @return Returns the result of the enemy's and the Players chosen action.
     */
    private CombatResult endRound(CombatResult result) {
        if (currentEnemy.getLife() > 0) {
            if (currentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Poisoned) || currentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Burning) || currentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Freezing)) {
                if (currentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Poisoned)){
                    currentEnemy.setLife(currentEnemy.getLife() - (new StatusController().getStatus(Types.effect.Poisoned).getPotency()));
                }
                if (currentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Burning)){
                    currentEnemy.setLife(currentEnemy.getLife() - (new StatusController().getStatus(Types.effect.Burning).getPotency()));
                }
                if (currentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Freezing)){
                    currentEnemy.setLife(currentEnemy.getLife() - (new StatusController().getStatus(Types.effect.Freezing).getPotency()));
                }
            }
            if (currentEnemy.getLife() > 0) {
                if (currentEnemy.getItems().size() > 0)
                    for (Item item : currentEnemy.getItems()) {
                        Player.getInstance().getItems().add(item);
                    }
                Player.getInstance().setMoney(Player.getInstance().getMoney() + currentEnemy.getMoney());
                Player.getInstance().addExperience(1);
            }
        }
        return result;
    }

    /**
     * @return Returns currentEnemy when called.
     */
    public Enemy getCurrentEnemy(){
        return currentEnemy;
    }

    /**
     * @param enemy Enemy passes the current enemy.
     */
    public void setCurrentEnemy(Enemy enemy){
        currentEnemy = enemy;
    }
}