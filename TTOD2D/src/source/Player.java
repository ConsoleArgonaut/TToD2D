package source;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Player extends Character implements java.io.Serializable {
    /**
     * This variable is defined as a new instance of Player.
     */
    private static Player ourInstance = new Player();

    /**
     * This variable is used to save the current experience of the Player.
     */
    private int experience;

    /**
     * This variable is used to save the race the Player chose.
     */
    private Types.playerRace race;

    /**
     * This variable is used to save the value that experience needs to reach for the Player to level-up.
     */
    private int nextLevel;

    public static Player getInstance() {
        return ourInstance;
    }

    public Player() {
        setMaxLife(1500);
        setLife(getMaxLife());
        setDefense(30);
        setAttack(40);
        setLevel(1);
        setMaxMana(2000);
        setMana(getMaxMana());
        setMoney(500);
        setInitiative(15);
        setIntelligence(35);
        experience = 0;
        race = Types.playerRace.Unknown;
        nextLevel = 300;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public Types.playerRace getRace() {
        return race;
    }
    public void setRace(Types.playerRace race) {
        this.race = race;
        SkillController.getSkill(Player.getInstance().getLevel());
    }
    public int getNextLevel() {
        return nextLevel;
    }
    public void setNextLevel(int nextLevel) {
        this.nextLevel = nextLevel;
    }

    /**
     * This method is used to add experience after defeating an enemy.
     */
    public void addExperience(){
        Player.getInstance().setExperience(Player.getInstance().getExperience() + (Player.getInstance().getNextLevel() / 14));
        Player.getInstance().levelUp();
        SkillController.getSkill(Player.getInstance().getLevel());
    }

    /**
     * This method is used to add a level to Player.
     */
    private void levelUp(){
        if(Player.getInstance().getExperience() >= Player.getInstance().getNextLevel()){
            Player.getInstance().setLevel(Player.getInstance().getLevel() + 1);
            Player.getInstance().setNextLevel(Player.getInstance().getNextLevel() * 3);
        }
    }

    /**
     * Resets the current player
     */
    public void resetPlayer(){
        ourInstance = new Player();
    }
}
