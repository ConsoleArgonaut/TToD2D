package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Skill {

    /**
     * This variable is used to save the name of a skill.
     */
    private String name = "";

    /**
     * This variable is used to save the mana cost of a skill.
     */
    private float manaCost = 0;

    /**
     * This variable is used to save the potency of a skill.
     */
    private float potency = 0;

    /**
     * This variable is used to save the level at which the Player onlocks this skill.
     */
    private int unlockedAt = 0;

    /**
     * This variable is used to save wether the skill is locked to a specific race.
     */
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
