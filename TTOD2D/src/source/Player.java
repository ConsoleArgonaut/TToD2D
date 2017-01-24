package source;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Michael on 16.12.2016.
 */
public class Player extends Character implements java.io.Serializable {
    private static Player ourInstance = new Player();

    private float experience;
    private Types.playerRace race;
    private float nextLevel;


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

    public float getExperience() {
        return experience;
    }
    public void setExperience(float experience) {
        this.experience = experience;
    }
    public Types.playerRace getRace() {
        return race;
    }
    public void setRace(Types.playerRace race) {
        this.race = race;
        Player.getInstance().setSkills(new SkillController().getSkill(Player.getInstance().getLevel()));
    }
    public float getNextLevel() {
        return nextLevel;
    }
    public void setNextLevel(float nextLevel) {
        this.nextLevel = nextLevel;
    }

    public void addExperience(float experience){
        Player.getInstance().setExperience(Player.getInstance().getExperience() + (Player.getInstance().getNextLevel() / 14));
        Player.getInstance().levelUp();
        Player.getInstance().setSkills(new SkillController().getSkill(Player.getInstance().getLevel()));
    }

    private void levelUp(){
        if(Player.getInstance().getExperience() >= Player.getInstance().getNextLevel()){
            Player.getInstance().setLevel(Player.getInstance().getLevel() + 1);
            Player.getInstance().setNextLevel(Player.getInstance().getNextLevel() * 3);
        }
    }
}
