package source;

/**
 * Created by Drake on 16.12.2016.
 */
public class Enemy extends Character {

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
}
