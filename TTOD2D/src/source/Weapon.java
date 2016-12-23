package source;

/**
 * Created by Drake on 16.12.2016.
 */
public class Weapon extends Item {
    private float attack = 0;
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
