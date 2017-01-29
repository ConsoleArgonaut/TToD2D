import org.junit.Assert;
import source.Item;
import source.Player;
import source.Trader;

import static org.junit.Assert.*;

/**
 * Created by Michael on 27.01.2017.
 */
public class TraderTest {
    @org.junit.Test
    public void getSellItemPrice()  {
        Player.getInstance().resetPlayer();
        Trader t = new Trader("Test");
        Item i = new Item();
        i.setValue(20);
        t.getItems().add(i);
        Assert.assertTrue(t.getSellItemPrice(i) <= 20);
    }

    @org.junit.Test
    public void getBuyItemPrice() {
        Player.getInstance().resetPlayer();
        Trader t = new Trader("Test");
        Item i = new Item();
        i.setValue(20);
        t.getItems().add(i);
        Assert.assertTrue(t.getBuyItemPrice(i) >= 20);
    }

    @org.junit.Test
    public void sellItem() {
        Player.getInstance().resetPlayer();
        Trader t = new Trader("Test");
        Item i = new Item();
        i.setValue(20);
        t.setMoney(1000);
        Player.getInstance().setMoney(1000);
        Player.getInstance().getItems().add(i);
        t.sellItem(i);
        Assert.assertTrue(t.getItems().contains(i));
        Assert.assertTrue(Player.getInstance().getMoney() > 1000);
        Assert.assertTrue(t.getMoney() < 1000);
    }

    @org.junit.Test
    public void buyItem() {
        Player.getInstance().resetPlayer();
        Trader t = new Trader("Test");
        Item i = new Item();
        i.setValue(20);
        t.getItems().add(i);
        t.setMoney(1000);
        Player.getInstance().setMoney(1000);
        t.buyItem(i);
        Assert.assertTrue(Player.getInstance().getItems().contains(i));
        Assert.assertTrue(Player.getInstance().getMoney() < 1000);
        Assert.assertTrue(t.getMoney() > 1000);
    }
}