package source;

import java.util.ArrayList;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Shop extends Building implements java.io.Serializable {
    private ArrayList<Trader> traders;

    public Shop(){
        this("Shop", Types.buildingType.Shop);
    }

    public Shop(Types.buildingType shopType){
        this("Shop", shopType);
    }

    public Shop (String shopName){
        this(shopName, Types.buildingType.Shop);
    }

    public Shop(String shopName, Types.buildingType shopType){
        super(shopName, shopType);
        traders = new ArrayList<>();
    }

    public Shop(String shopName, Types.buildingType shopType, ArrayList<Trader> tradersToSet){
        this(shopName, shopType);
        traders = tradersToSet;

    }

    public ArrayList<Trader> getTraders(){return traders;}

    public void setTraders(ArrayList<Trader> tradersToSet){traders = tradersToSet;}
}
