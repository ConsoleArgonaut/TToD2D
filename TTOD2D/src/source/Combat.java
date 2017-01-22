package source;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Drake on 16.12.2016.
 */
public class Combat {

    private Enemy CurrentEnemy;
    private int duration;
    private float reposte;

    public Combat(){
        duration = 0;
        reposte = 0;
    }

    public Combat(Enemy enemy) {
        CurrentEnemy = enemy;
    }

    /**
     * Attack Enemy
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

            switch(skill.getName()){
                case "Attack":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)));
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Defence":
                    result.setPlayerAction(Types.combatActionResult.Defended);
                    break;
                case "Ice Needle":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Freezing));
                    break;
                case "Nature's Embrace":
                    result.setPlayerLifeDifference(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if(Player.getInstance().getLife() > Player.getInstance().getMaxLife()){
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    break;
                case "Second Wind":
                    result.setPlayerLifeDifference(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if(Player.getInstance().getLife() > Player.getInstance().getMaxLife()){
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    break;
                case "Fireball":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Burning));
                    break;
                case "Water's Embrace":
                    result.setPlayerLifeDifference(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if(Player.getInstance().getLife() > Player.getInstance().getMaxLife()){
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    break;
                case "Iron Hammer":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Rockbullet":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Dark Endurance":
                    result.setPlayerLifeDifference(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if(Player.getInstance().getLife() > Player.getInstance().getMaxLife()){
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    break;
                case "Throw Scrap":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)));
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Double Strike":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - ((Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)) * 2));
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Cure":
                    result.setPlayerLifeDifference(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if(Player.getInstance().getLife() > Player.getInstance().getMaxLife()){
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    if(!(Player.getInstance().getStatus() == new StatusController().getStatus(Types.effect.Good)))
                        Player.getInstance().setStatus(new StatusController().getStatus(Types.effect.Good));
                    break;
                case "Ice Blast":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Freezing));
                    break;
                case "Fire Breath":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Burning));
                    break;
                case "Water Bullet":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Quake":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Life Conversion":
                    float LifeManaConversion = 0;
                    LifeManaConversion = ((Player.getInstance().getLife() / 100) * 20);
                    Player.getInstance().setLife(Player.getInstance().getLife() - LifeManaConversion);
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost() + LifeManaConversion);
                    break;
                case "Obscene Gesture":
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Riposte":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)) + reposte);
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Nature's Wrath":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Wingbeat":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Iron Breacker":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Shadow Orb":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Relentless Endurance":
                    Player.getInstance().setStatus(new StatusController().getStatus(Types.effect.Unrelenting));
                    break;
                case "Reaper":
                    float LifeDamageConversion = 0;
                    LifeDamageConversion = ((Player.getInstance().getLife() / 100) * 20);
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - ((Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0) + LifeDamageConversion) * skill.getPotency()));
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Permafrost":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Freezing));
                    break;
                case "Genesis":
                    result.setPlayerLifeDifference(Player.getInstance().getLife() + (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    if(Player.getInstance().getLife() > Player.getInstance().getMaxLife()){
                        result.setPlayerLifeDifference(Player.getInstance().getMaxLife());
                    }
                    if(!(Player.getInstance().getStatus() == new StatusController().getStatus(Types.effect.Good)))
                        Player.getInstance().setStatus(new StatusController().getStatus(Types.effect.Good));
                    break;
                case "Firestorm":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Burning));
                    break;
                case "Hydraulic Impact":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getIntelligence() + ((Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Netherworld":
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - ((Player.getInstance().getIntelligence() + (Player.getInstance().getFocus() != null ? Player.getInstance().getFocus().getIntelligence() : (float) 0)) * skill.getPotency()));
                    Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    break;
                case "Overdrive":
                    float ManaDamageConversion = 0;
                    ManaDamageConversion = Player.getInstance().getMana();
                    result.setEnemyLifeDifference(CurrentEnemy.getDefense() - ((Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0) + ManaDamageConversion) * skill.getPotency()));
                    if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
                        result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
                    Player.getInstance().setMana(0);
                    break;
            }
            //Calculates Damage
            ///result.setEnemyLifeDifference(CurrentEnemy.getDefense() - (Player.getInstance().getAttack() + (Player.getInstance().getWeapon() != null ? Player.getInstance().getWeapon().getAttack() : (float) 0)));
            ///if (result.getEnemyHadFirstHit() && result.getEnemyAction() == Types.combatActionResult.Defended)
            ///    result.setEnemyLifeDifference(result.getEnemyLifeDifference() - CurrentEnemy.getDefense() / 100 * result.getEnemyLifeDifference());
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
     * Use Poison to causes harm to the Enemy
     */
    public CombatResult usePoison(Poison item) {
        CombatResult result = new CombatResult();
        if (item.getType() == Types.itemType.Poison) {
            result.setPlayerAction(Types.combatActionResult.ItemUsed);
            CurrentEnemy.setStatus(new StatusController().getStatus(Types.effect.Poisoned));
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
        if (CurrentEnemy.getInitiative() < Player.getInstance().getInitiative())
            playerChance = playerChance + 2;
        if (new java.util.Random().nextBoolean())
            playerChance++;
        if (playerChance >= 3)
            return false;
        else
            return true;
    }

    private CombatResult enemyMove(CombatResult result) {
        //Calculates Enemy Move
        if (CurrentEnemy.getLife() > 0) {
            if(!(CurrentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Stunned) || CurrentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Freezing))) {
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
            } else {
                result.setEnemyAction(Types.combatActionResult.Waited);
            }
            return result;
        }
        return result;
    }

    private CombatResult enemyAttacks(CombatResult result) {
        result.setEnemyAction(Types.combatActionResult.Attacked);

        //Calculates Damage
        result.setPlayerLifeDifference(CurrentEnemy.getAttack() - (Player.getInstance().getDefense() + (Player.getInstance().getArmor() != null ? Player.getInstance().getArmor().getDefence() : 0)) + (Player.getInstance().getShield() != null ? Player.getInstance().getShield().getDefence() : 0));
        reposte = result.getPlayerLifeDifference();
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
            if (CurrentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Poisoned) || CurrentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Burning) || CurrentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Freezing)){
                if(CurrentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Poisoned));{
                    CurrentEnemy.setLife(CurrentEnemy.getLife() - (new StatusController().getStatus(Types.effect.Poisoned).getPotency()));
                }
                if(CurrentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Burning));{
                    CurrentEnemy.setLife(CurrentEnemy.getLife() - (new StatusController().getStatus(Types.effect.Burning).getPotency()));
                }
                if(CurrentEnemy.getStatus() == new StatusController().getStatus(Types.effect.Freezing));{
                    CurrentEnemy.setLife(CurrentEnemy.getLife() - (new StatusController().getStatus(Types.effect.Freezing).getPotency()));
                }
                if (CurrentEnemy.getLife() > 0) {
                    if (CurrentEnemy.getItems().size() > 0)
                        for (Item item : CurrentEnemy.getItems()) {
                            Player.getInstance().setItems(CurrentEnemy.getItems());
                        }
                    Player.getInstance().setMoney(Player.getInstance().getMoney() + CurrentEnemy.getMoney());
                }
            }
        }
        return result;
    }
}
