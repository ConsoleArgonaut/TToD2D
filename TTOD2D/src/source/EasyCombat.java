package source;

import java.util.Random;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    30.01.2017
 */
public class EasyCombat implements ICombat {
    /**
     * The result of the current combat round.
     */
    private CombatResult result;

    /**
     * This variable is used to pass the current enemy that is beeing fought in the damage calculation.
     */
    private Enemy currentEnemy;

    /**
     * This method calculates damage the player deals or the healing the player receives
     *
     * @param skill Skill is the parameter which is executed.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    public CombatResult attack(Skill skill) {
        startRound();
        if(Player.getInstance().getSkills().contains(skill) || Player.getInstance().getMana() < skill.getManaCost()){
            Player.getInstance().setMana(Player.getInstance().getMana() - skill.getManaCost());
            switch(skill.getName()){
                case "Double Strike":
                case "Attack":
                case "Water Bullet":
                case "Riposte":
                case "Wingbeat":
                case "Iron Breacker":
                case "Shadow Orb":
                case "Netherworld":
                    doAttack(skill.getPotency(), null);
                case "Defence":
                    result.setPlayerAction(Types.combatActionResult.Defended);
                    if(result.getEnemyAction() == Types.combatActionResult.Attacked)
                        result.setPlayerLifeDifference(result.getPlayerLifeDifference() * (skill.getPotency() / 100));
                    break;
                case "Ice Blast":
                case "Ice Needle":
                case "Permafrost":
                    doAttack(skill.getPotency(), Types.effect.Freezing);
                    break;
                case "Nature's Embrace":
                case "Second Wind":
                case "Water's Embrace":
                case "Dark Endurance":
                case "Nature's Wrath":
                    doHealing(skill.getPotency());
                    break;
                case "Fireball":
                case "Fire Breath":
                case "Firestorm":
                    doAttack(skill.getPotency(), Types.effect.Burning);
                    break;
                case "Iron Hammer":
                case "Rockbullet":
                case "Quake":
                case "Hydraulic Impact":
                    doAttack(skill.getPotency(), Types.effect.Stunned);
                    break;
                case "Throw Scrap":
                    Item itemToThrow = null;
                    for (Item item:Player.getInstance().getItems()) {
                        if(item.getType() == Types.itemType.Scrap)
                            itemToThrow = item;
                    }
                    if(itemToThrow != null){
                        Player.getInstance().getItems().remove(itemToThrow);
                        doAttack(skill.getPotency(), null);
                    }
                    else
                        result.setPlayerAction(Types.combatActionResult.Waited);
                    break;
                case "Cure":
                    doHealing(skill.getPotency());
                    Player.getInstance().setStatus(new StatusController().getStatus(Types.effect.Good));
                    break;
                case "Life Conversion":
                    result.setPlayerAction(Types.combatActionResult.Waited);
                    result.setEnemyLifeDifference((Player.getInstance().getLife() / 100) * 20);
                    break;
                case "Obscene Gesture":
                    result.setPlayerAction(Types.combatActionResult.Attacked);
                    currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Stunned));
                    break;
                case "Relentless Endurance":
                    result.setPlayerAction(Types.combatActionResult.Attacked);
                    Player.getInstance().setStatus(new StatusController().getStatus(Types.effect.Unrelenting));
                    break;
                case "Reaper":
                    doAttack(skill.getPotency(), null);
                    result.setPlayerLifeDifference(result.getPlayerLifeDifference() - result.getEnemyLifeDifference());
                    break;
                case "Genesis":
                    result.setPlayerLifeDifference(Player.getInstance().getLife() - 1);
                    result.setEnemyLifeDifference(currentEnemy.getLife() * 3000);
                    result.setPlayerAction(Types.combatActionResult.Attacked);
                    break;
                case "Overdrive":
                    result.setPlayerAction(Types.combatActionResult.Attacked);
                    result.setEnemyLifeDifference(Player.getInstance().getMana());
                    Player.getInstance().setMana(0);
                    break;
                default:
                    result.setPlayerAction(Types.combatActionResult.Waited);
                    break;
            }
        }
        else
            result.setPlayerAction(Types.combatActionResult.Waited);
        return endRound();
    }

    /**
     * This method calculates how a potion effects the Player if he owns a any potion
     *
     * @param item Item is the parameter which is used.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    public CombatResult usePotion(Potion item) {
        startRound();
        if(Player.getInstance().getItems().contains(item) && item.getType() == Types.itemType.Potion){
            result.setPlayerAction(Types.combatActionResult.ItemUsed);
            result.setPlayerLifeDifference(result.getPlayerLifeDifference() - item.getHealing());
            result.setPlayerItemUsed(item);
            Player.getInstance().getItems().remove(item);
        }
        else
            result.setPlayerAction(Types.combatActionResult.Waited);
        return endRound();
    }

    /**
     * This method calculates how a poison effects the current enemy if the Player owns a any poison.
     *
     * @param item Item is the parameter which is used.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    public CombatResult usePoison(Poison item) {
        startRound();
        if(Player.getInstance().getItems().contains(item) && item.getType() == Types.itemType.Poison){
            result.setPlayerAction(Types.combatActionResult.ItemUsed);
            currentEnemy.setStatus(new StatusController().getStatus(Types.effect.Poisoned));
            result.setPlayerItemUsed(item);
            Player.getInstance().getItems().remove(item);
        }
        else
            result.setPlayerAction(Types.combatActionResult.Waited);
        return endRound();
    }

    /**
     * This method determines how the Player acts if the command to "flee" is given.
     *
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    public CombatResult flee() {
        startRound();
        if(Player.getInstance().getLife() - result.getPlayerLifeDifference() > 0)
            result.setPlayerAction((new Random().nextBoolean() ? Types.combatActionResult.Escaped : Types.combatActionResult.Waited));
        return endRound();
    }

    /**
     * This method determines how the Player acts if the command to "wait" is given.
     *
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    public CombatResult getAttacked() {
        startRound();
        result.setPlayerAction(Types.combatActionResult.Waited);
        return endRound();
    }

    /**
     * This method determines what happens at the end of a round.
     */
    private CombatResult endRound(){
        currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
        Player.getInstance().setLife(Player.getInstance().getLife() - result.getPlayerLifeDifference());
        //Sets Defended enemy
        if(result.getEnemyAction() == Types.combatActionResult.Defended)
            result.setEnemyLifeDifference(result.getEnemyLifeDifference() * (currentEnemy.getDefense() / 100));
        //Calculates if someone died
        if(result.getEnemyHadFirstHit()){
            Player.getInstance().setLife(Player.getInstance().getLife() - result.getPlayerLifeDifference());
            if(Player.getInstance().getLife() <= 0)
                result.setPlayerAction(Types.combatActionResult.Waited);
            if(result.getPlayerAction() == Types.combatActionResult.Waited)
                currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
        }
        else{
            currentEnemy.setLife(currentEnemy.getLife() - result.getEnemyLifeDifference());
            if(currentEnemy.getLife() <= 0)
                result.setEnemyAction(Types.combatActionResult.Waited);
            if(result.getEnemyAction() == Types.combatActionResult.Waited)
                Player.getInstance().setLife(Player.getInstance().getLife() - result.getPlayerLifeDifference());
        }
        //Handles Status
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
        //Adds Items to Player
        if(currentEnemy.getLife() <= 0 && currentEnemy.getItems().size() > 0){
            for (Item i:currentEnemy.getItems()) {
                Player.getInstance().getItems().add(i);
            }
        }
        return result;
    }

    /**
     * This method determines what happens at the start of a round.
     */
    private void startRound(){
        result = new CombatResult();
        result.setEnemyHadFirstHit(new Random().nextBoolean());
        //Calculate Enemy Move
        if (new Random().nextBoolean()){
            float attackValue = currentEnemy.getAttack();
            attackValue = attackValue - Player.getInstance().getDefense();
            result.setPlayerLifeDifference(Player.getInstance().getMaxLife() * (attackValue / 1000));
            result.setEnemyAction(Types.combatActionResult.Attacked);
        }
        else if(new Random().nextBoolean())
            result.setEnemyAction(Types.combatActionResult.Defended);
        else
            result.setEnemyAction(Types.combatActionResult.Waited);
    }

    /**
     * This method does an attack from player to enemy.
     *
     * @param effect The effect to set with the attack
     * @param percentage The percentage of effectiveness of the attack
     */
    private void doAttack(float percentage, Types.effect effect){
        percentage = (percentage / 2) + Player.getInstance().getAttack();
        percentage = percentage - currentEnemy.getDefense();
        if(Player.getInstance().getWeapon() != null)
            percentage = percentage + (Player.getInstance().getWeapon().getAttack() / 4);
        result.setEnemyLifeDifference(currentEnemy.getMaxLife() * (percentage / 200));
        if(effect != null)
            currentEnemy.setStatus(new StatusController().getStatus(effect));
    }

    /**
     * This method heals the player.
     *
     * @param percentage The percentage of effectiveness of the heal
     */
    private void doHealing(float percentage){
        if(Player.getInstance().getFocus() != null)
            percentage = percentage * (100 / percentage);
        result.setPlayerLifeDifference(Player.getInstance().getMaxLife() * -(percentage / 100));
    }

    public Enemy getCurrentEnemy(){
        return currentEnemy;
    }
    public void setCurrentEnemy(Enemy enemy){
        currentEnemy = enemy;
    }
}
