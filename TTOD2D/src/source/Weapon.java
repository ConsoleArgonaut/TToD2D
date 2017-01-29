package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Weapon extends Item {

    /**
     * This variable is used to save the attack value of the weapon.
     */
    private float attack = 0;

    /**
     * Thsi variable is used to save the critical hit chance.
     */
    private float critChance = 0;

    public float getAttack() {
        return attack;
    }
    public void setAttack(float attack) {
        this.attack = attack;
    }
    public float getCritChance() {
        return critChance;
    }
    public void setCritChance(float critChance) {
        this.critChance = critChance;
    }
}
