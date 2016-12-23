package source;

/**
 * Created by Drake on 16.12.2016.
 */
public class Shield extends Item {
    private float defence = 0;
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
