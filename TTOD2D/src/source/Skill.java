package source;

/**
 * Created by Drake on 16.12.2016.
 */
public class Skill {
    private String name = "";
    private float manaCost = 0;
    private double potency = 0;
    private int unlockedAt = 0;
    private Types.playerRace raceLocked = Types.playerRace.Unknown;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getManaCost() {
        return manaCost;
    }
    public void setManaCost(float manaCost) {
        this.manaCost = manaCost;
    }
    public double getPotency() {
        return potency;
    }
    public void setPotency(double potency) {
        this.potency = potency;
    }
    public int getUnlockedAt() {
        return unlockedAt;
    }
    public void setUnlockedAt(int unlockedAt) {
        this.unlockedAt = unlockedAt;
    }
    public Types.playerRace getRaceLocked() {
        return raceLocked;
    }
    public void setRaceLocked(Types.playerRace raceLocked) {
        this.raceLocked = raceLocked;
    }
}
