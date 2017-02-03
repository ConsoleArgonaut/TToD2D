package source;

import java.io.Serializable;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Status implements Serializable {

    /**
     * This method is used to save the name of a status.
     */
    private String name = "";

    /**
     * This method is used to save the potency of a status.
     */
    private float potency = 0;

    /**
     * This method is used to save the duration of a status.
     */
    private int duration = 0;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPotency() {
        return potency;
    }
    public void setPotency(float potency) {
        this.potency = potency;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
