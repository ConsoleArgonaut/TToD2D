package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class CombatResult {
    private float playerLifeDifference;

    private float enemyLifeDifference;

    private Types.combatActionResult playerAction;

    private Types.combatActionResult enemyAction;

    private Item playerItemUsed;

    private Item enemyItemUsed;

    private Boolean enemyHadFirstHit;

    public CombatResult(){
        enemyHadFirstHit = false;
        playerItemUsed = null;
        enemyItemUsed = null;
        enemyAction = null;
        playerAction = null;
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
