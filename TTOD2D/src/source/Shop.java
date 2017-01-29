package source;

import java.util.ArrayList;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Shop extends Building implements java.io.Serializable {

    /**
     * Tis varaible is used to save an ArrayList of traders.
     */
    private ArrayList<Trader> traders;

    public Shop(){
        this("Shop", Types.buildingType.Shop);
    }

    /**
     * This method is used to initialise the name of a Shop.
     * @param shopName This parameter is used to save the name of a shop.
     */
    public Shop (String shopName){
        this(shopName, Types.buildingType.Shop);
    }

    /**
     * This method is used to initialise a new trader in a shop.
     * @param shopName This parameter is used to save the name of a shop.
     * @param shopType This parameter is used to save the type of a shop.
     */
    public Shop(String shopName, Types.buildingType shopType){
        super(shopName, shopType);
        traders = new ArrayList<>();
    }

    /**
     * This method is used to get an ArrayList of traders.
     * @return Returns traders.
     */
    public ArrayList<Trader> getTraders(){return traders;}
}
