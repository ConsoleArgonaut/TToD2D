package source;

import java.util.ArrayList;

/**
 * Created by Michael on 16.12.2016.
 */
public class Innkeeper extends NPC {

    private int roomPrice;

    public Innkeeper(String name){
        super(name);
    }

    public Innkeeper(String name, int roomPriceToSet){
        this(name);
        roomPrice = roomPriceToSet;
    }

    public Innkeeper(String name, int roomPrice, ArrayList<String> sentences){
        this(name, roomPrice);
        setSentences(sentences);
    }

    public int getRoomPrice(){
        return roomPrice;
    }

    public void setRoomPrice(int roomPriceToSet){
        roomPrice = roomPriceToSet;
    }

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
