package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Skill {
    private String name = "";
    private float manaCost = 0;
    private float potency = 0;
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
    public float getPotency() {
        return potency;
    }
    public void setPotency(float potency) {
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
