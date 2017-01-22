package source;

/**
 * Created by Drake on 16.12.2016.
 */
public class Enemy extends Character implements java.io.Serializable {

    private Types.enemyType type;

    public Enemy() {
        type = Types.enemyType.Creature;
    }

    public Types.enemyType getType() {
        return type;
    }
    public void setType(Types.enemyType type) {
        this.type = type;
    }

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
