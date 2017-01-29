package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class CombatResult {
    /**
     * This variable is used to calculate the difference of
     * @see Player health during a
     * @see Combat round.
     */
    private float playerLifeDifference;

    /**
     * This variable is used to calculate the difference of
     * @see Enemy health during a
     * @see Combat round.
     */
    private float enemyLifeDifference;

    /**
     * This variable is used to save and use the chosen action of the
     * @see Player during a
     * @see Combat round.
     */
    private Types.combatActionResult playerAction;

    /**
     * This variable is used to save and use the chosen action of the
     * @see Enemy during a
     * @see Combat round.
     */
    private Types.combatActionResult enemyAction;

    /**
     * This variable is used to save and use the chosen action of the
     * @see Player during a
     * @see Combat round if the Player used.
     */
    private Item playerItemUsed;

    /**
     * This variable is used to save and use the chosen action of the
     * @see Enemy during a
     * @see Combat round if the Player used.
     */
    private Item enemyItemUsed;

    /**
     * This variable is used to determine and save whether the
     * @see Player  or the
     * @see Enemy has the first move during a
     * @see Combat round.
     */
    private Boolean enemyHadFirstHit;

    /**
     * This constructor defines the default value of the variables in the class
     * @see CombatResult .
     */
    public CombatResult(){
        enemyHadFirstHit = false;
        playerItemUsed = null;
        enemyItemUsed = null;
        enemyAction = Types.combatActionResult.Waited;
        playerAction = Types.combatActionResult.Waited;
        playerLifeDifference = 0;
        enemyLifeDifference = 0;
    }

    public float getPlayerLifeDifference() {
        return playerLifeDifference;
    }
    public void setPlayerLifeDifference(float playerLifeDifference) {
        this.playerLifeDifference = playerLifeDifference;
    }
    public float getEnemyLifeDifference() {
        return enemyLifeDifference;
    }
    public void setEnemyLifeDifference(float enemyLifeDifference) {
        this.enemyLifeDifference = enemyLifeDifference;
    }
    public Types.combatActionResult getPlayerAction() {
        return playerAction;
    }
    public void setPlayerAction(Types.combatActionResult playerAction) {
        this.playerAction = playerAction;
    }
    public Types.combatActionResult getEnemyAction() {
        return enemyAction;
    }
    public void setEnemyAction(Types.combatActionResult enemyAction) {
        this.enemyAction = enemyAction;
    }
    public Item getPlayerItemUsed() {
        return playerItemUsed;
    }
    public void setPlayerItemUsed(Item playerItemUsed) {
        this.playerItemUsed = playerItemUsed;
    }
    public Item getEnemyItemUsed() {
        return enemyItemUsed;
    }
    public void setEnemyItemUsed(Item enemyItemUsed) {
        this.enemyItemUsed = enemyItemUsed;
    }
    public Boolean getEnemyHadFirstHit() {
        return enemyHadFirstHit;
    }
    public void setEnemyHadFirstHit(Boolean enemyHadFirstHit) {
        this.enemyHadFirstHit = enemyHadFirstHit;
    }
}
