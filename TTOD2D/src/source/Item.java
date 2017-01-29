package source;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Item {
    /**
     * This variable is used to save the name of an item.
     */
    private String name;

    /**
     * This variable is used to save the maximum amount of items of the same kind the Player can hold at a time.
     */
    private int maxCount;

    /**
     * This variable is used to save the value of an item.
     */
    private float value;

    /**
     * This variable is used to save wether the item can be used in combat or not.
     */
    private boolean isCombatItem;

    /**
     * This variable is used to save the type of an item.
     */
    private Types.itemType type;

    public Item(){
        name = "";
        maxCount = 0;
        value = 0;
        isCombatItem = false;
    }

    public String getName(){return name;}
    public void setName(String nameToSet){name=nameToSet;}
    public int getMaxCount(){return maxCount;}
    public void setMaxCount(int maxCountToSet){maxCount = maxCountToSet;}
    public float getValue(){return value;}
    public void setValue(float valueToSet){value=valueToSet;}
    public boolean getIsCombatItem(){return isCombatItem;}
    public void setIsCombatItem(boolean isCombatItemToSet){isCombatItem=isCombatItemToSet;}
    public Types.itemType getType() {
        return type;
    }
    public void setType(Types.itemType type) {
        this.type = type;
    }
}
