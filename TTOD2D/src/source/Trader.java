package source;

import java.util.ArrayList;

/**
 * Created by Michael on 16.12.2016.
 */
public class Trader extends NPC {
    public Trader(String traderName){
        super(traderName);
    }

    public Trader(String traderName, ArrayList<String> sentences){
        super(traderName, sentences);
    }

    public int getSellItemPrice(Item item){
        return (int)item.getValue();
    }

    public int getBuyItemPrice(Item item){
        return (int)item.getValue();
    }

    public boolean sellItem(Item item){
        if(Player.getInstance().getMoney() > getSellItemPrice(item)){
            if(Player.getInstance().getItems().contains(item)) {
                Player.getInstance().getItems().remove(item);
                getItems().add(item);
                Player.getInstance().setMoney(Player.getInstance().getMoney() - getSellItemPrice(item));
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }

    public boolean buyItem(Item item){
        if(getItems().contains(item)){
            int itemPrice = (int)item.getValue();
            if(getMoney() < itemPrice)
                itemPrice = getMoney();
            setMoney(getMoney() - itemPrice);
            Player.getInstance().setMoney(Player.getInstance().getMoney() + itemPrice);
            Player.getInstance().getItems().add(item);
            return true;
        }
        else
            return false;
    }
}
