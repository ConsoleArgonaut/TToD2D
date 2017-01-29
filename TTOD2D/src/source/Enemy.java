package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Enemy extends Character implements java.io.Serializable {

    /**
     * The type of this enemy
     */
    private Types.enemyType type;

    public Enemy() {
        type = Types.enemyType.Creature;
    }

    /**
     * Initialises Enemy with all needed base values set
     * @param name The enemy name
     * @param life The max life of the enemy
     * @param defense The defense of the enemy
     * @param attack The attack of the enemy
     * @param intelligence The intelligence of the enemy
     * @param initiative The initiative of the enemy
     * @param money The money of the enemy
     * @param enemyType The type of this enemy
     */
    public Enemy(String name, int life, int defense, int attack, int intelligence, int initiative, int money, Types.enemyType enemyType){
        this();
        setName(name);
        setMaxLife(life);
        setLife(getMaxLife());
        setDefense(defense);
        setAttack(attack);
        setIntelligence(intelligence);
        setInitiative(initiative);
        setMoney(money);
        setType(enemyType);
    }

    public Types.enemyType getType() {
        return type;
    }
    public void setType(Types.enemyType type) {
        this.type = type;
    }

    /**
     * Copies every value of this Enemy to new Enemy and returns it
     * @return A copy of this Enemy
     */
    @Override
    public Enemy clone(){
        Enemy enemy = new Enemy();
        enemy.setMoney(getMoney());
        enemy.setName(getName());
        enemy.setGender(getGender());
        enemy.setMaxLife(getMaxLife());
        enemy.setType(getType());
        enemy.setArmor(getArmor());
        enemy.setAttack(getAttack());
        enemy.setDefense(getDefense());
        enemy.setFocus(getFocus());
        enemy.setImage(getImage());
        enemy.setInitiative(getInitiative());
        enemy.setIntelligence(getIntelligence());
        enemy.setItems(getItems());
        enemy.setLevel(getLevel());
        enemy.setLife(getLife());
        enemy.setMana(getMana());
        enemy.setMaxMana(getMaxMana());
        enemy.setShield(getShield());
        enemy.setWeapon(getWeapon());
        enemy.setSkills(getSkills());
        enemy.setStatus(getStatus());
        return enemy;
    }
}
