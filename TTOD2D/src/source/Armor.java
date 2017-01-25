package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Armor extends Item {

    /**
     * This variable is used to determine the defence value of the equipable
     * @see Item of type
     * @see Armor which is used to calculate damage in
     * @see Combat
     */
    private float defence = 0;

    /**
     * @return defence is returned when the method is called
     */
    public float getDefence() {
        return defence;
    }

    /**
     * @param defence is used to assign and set the returned value as the defence value of
     * @see Armor
     */
    public void setDefence(float defence) {
        this.defence = defence;
    }
}
