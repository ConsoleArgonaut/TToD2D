package source;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Innkeeper extends NPC {

    /**
     * This variable is used to calculate teh remaining money the Player holds after the cost-of-living deduction.
     */
    private int roomPrice;

    /**
     * This method is used to initialise the name of the innkeeper.
     * @param name Name of the innkeeper
     */
    public Innkeeper(String name){
        super(name);
    }

    public int getRoomPrice(){
        return roomPrice;
    }
    public void setRoomPrice(int roomPriceToSet){
        roomPrice = roomPriceToSet;
    }

    /**
     * This method checks if the Player has enough money to sleep at the inn and if that is the case the Player regains all his health and mana.
     * @return true or false
     */
    public boolean goSleeping(){
        if(Player.getInstance().getMoney() > roomPrice){
            Player.getInstance().setMoney(Player.getInstance().getMoney() - roomPrice);
            Player.getInstance().setLife(Player.getInstance().getMaxLife());
            Player.getInstance().setStatus(null);
            return true;
        }
        else
            return false;
    }
}
