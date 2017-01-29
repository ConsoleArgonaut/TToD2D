package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Shield extends Item {

    /**
     * This variable is used to save the defence of a shield.
     */
    private float defence = 0;
    /**
     * This variable is used to save the block chance of a shield.
     */
    private float blockChance = 0;

    public float getDefence() {
        return defence;
    }
    public void setDefence(float defence) {
        this.defence = defence;
    }
    public float getBlockChance() {
        return blockChance;
    }
    public void setBlockChance(float blockChance) {
        this.blockChance = blockChance;
    }
}
