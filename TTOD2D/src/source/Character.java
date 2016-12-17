package source;

import java.util.ArrayList;

/**
 * Created by Michael on 16.12.2016.
 */
public abstract class Character {
    private String name;
    private float life;
    private float maxLife;
    private float defense;
    private float attack;
    private int level;
    private Status status;
    private float mana;
    private float maxMana;
    private Armor armor;
    private Weapon weapon;
    private Shield shield;
    private ArrayList<Item> items;
    private int money;
    private int initiative;
    private float intelligence;
    private Focus focus;
    private String gender;
    private String image;
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
