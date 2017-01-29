package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Potion extends Item {

    /**
     * This variable is used do save the healing potency of a potion.
     */
    private float healing;

    public  Potion(){
        healing = 0;
    }
    public float getHealing() {
        return healing;
    }
    public void setHealing(float healing) {
        this.healing = healing;
    }
}
