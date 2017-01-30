package source;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    30.01.2017
 */
public interface ICombat {
    /**
     * This method calculates damage the player deals or the healing the player receives
     * @param skill Skill is the parameter which is executed.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    CombatResult attack(Skill skill);
    /**
     * This method calculates how a potion effects the Player if he owns a any potion
     * @param item Item is the parameter which is used.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    CombatResult usePotion(Potion item);
    /**
     * This method calculates how a poison effects the current enemy if the Player owns a any poison.
     * @param item Item is the parameter which is used.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    CombatResult usePoison(Poison item);
    /**
     * This method determines how the Player acts if the command to "flee" is given.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    CombatResult flee();
    /**
     * This method determines how the Player acts if the command to "wait" is given.
     * @return This method returns endRound(result) which contains the result of the calculation.
     */
    CombatResult getAttacked();

    Enemy getCurrentEnemy();

    void setCurrentEnemy(Enemy enemy);
}
