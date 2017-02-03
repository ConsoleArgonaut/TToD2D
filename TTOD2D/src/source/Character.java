package source;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public abstract class Character implements Serializable {
    /**
     * This variable is used to save the name of Player or Enemy respectably.
     */
    private String name;
    /**
     * This variable is used to save the current health of Player or Enemy respectably.
     */
    private float life;
    /**
     * This variable is used to save the maximum health of Player or Enemy respectably.
     */
    private float maxLife;
    /**
     * This variable is used to save the defence of Player or Enemy respectably.
     */
    private float defense;
    /**
     * This variable is used to save the attack of Player or Enemy respectably.
     */
    private float attack;
    /**
     * This variable is used to save the level of Player.
     */
    private int level;
    /**
     * This variable is used to save the status of Player or Enemy respectably.
     */
    private Status status;
    /**
     * This variable is used to save the current mana count of Player.
     */
    private float mana;
    /**
     * This variable is used to save the maximum mana count of Player.
     */
    private float maxMana;
    /**
     * This variable is used to save the currently equipped armor of Player.
     */
    private Armor armor;
    /**
     * This variable is used to save the currently equipped weapon of Player.
     */
    private Weapon weapon;
    /**
     * This variable is used to save the currently equipped shield of Player.
     */
    private Shield shield;
    /**
     * This variable is used to save the currently held items of Player or Enemy respectably.
     */
    private ArrayList<Item> items;
    /**
     * This variable is used to save the currently held money of Player or Enemy respectably.
     */
    private int money;
    /**
     * This variable is used to save the initiative of Player or Enemy respectably.
     */
    private int initiative;
    /**
     * This variable is used to save the intelligence of Player or Enemy respectably.
     */
    private float intelligence;
    /**
     * This variable is used to save the currently equipped focus of Player.
     */
    private Focus focus;
    /**
     * This variable is used to save the selected gender of Player.
     */
    private String gender;
    /**
     * This variable is used to save the image corresponding to the chosen race of the Players choosing.
     */
    private String image;
    /**
     * This variable is used to save the currently unlocked skills of Player.
     */
    private ArrayList<Skill> skills;

    public Character(){
        name = "";
        life = 0;
        maxLife = 0;
        defense = 0;
        attack = 0;
        level = 0;
        status = new Status();
        mana = 0;
        maxMana = 0;
        armor = null;
        weapon = null;
        shield = null;
        items = new ArrayList<>();
        money = 0;
        initiative = 0;
        intelligence = 0;
        focus = null;
        gender = "unknown";
        image = "";
        skills = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void setName(String nameToSet){name=nameToSet;}
    public float getLife(){return life;}
    public void setLife(float lifeToSet){life = lifeToSet;}
    public float getMaxLife(){return maxLife;}
    public void setMaxLife(float maxLifeToSet){maxLife = maxLifeToSet;}
    public float getDefense(){return defense;}
    public void setDefense(float defenseToSet){defense=defenseToSet;}
    public float getAttack(){ return attack; }
    public void setAttack(float attackToSet){attack = attackToSet;}
    public int getLevel(){return level;}
    public void setLevel(int levelToSet){level=levelToSet;}
    public Status getStatus(){return status;}
    public void setStatus(Status statusToSet){status=statusToSet;}
    public float getMana(){return mana;}
    public void setMana(float manaToSet){mana=manaToSet;}
    public float getMaxMana(){return maxMana;}
    public void setMaxMana(float maxManaToSet){maxMana=maxManaToSet;}
    public Armor getArmor(){return armor;}
    public void setArmor(Armor armorToSet){armor = armorToSet;}
    public Weapon getWeapon(){return weapon;}
    public void setWeapon(Weapon weaponToSet){weapon = weaponToSet;}
    public Shield getShield(){return shield;}
    public void setShield(Shield shieldToSet){shield=shieldToSet;}
    public ArrayList<Item> getItems(){return items;}
    public void setItems(ArrayList<Item> itemsToSet){items=itemsToSet;}
    public int getMoney(){return money;}
    public void setMoney(int moneyToSet){money=moneyToSet;}
    public int getInitiative(){return initiative;}
    public void setInitiative(int initiativeToSet){initiative=initiativeToSet;}
    public float getIntelligence(){return intelligence;}
    public void setIntelligence(float intelligenceToSet){intelligence =intelligenceToSet;}
    public Focus getFocus(){return focus;}
    public void setFocus(Focus focusToSet){focus=focusToSet;}
    public String getGender(){return gender;}
    public void setGender(String genderToSet){gender = genderToSet;}
    public String getImage(){return image;}
    public void setImage(String imageToSet){image = imageToSet;}
    public ArrayList<Skill> getSkills(){return skills;}
    public void setSkills(ArrayList<Skill> skillsToSet){skills = skillsToSet;}
}
