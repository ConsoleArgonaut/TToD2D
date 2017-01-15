package source;

/**
 * Created by Drake on 16.12.2016.
 */
public class Potion extends Item {
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
