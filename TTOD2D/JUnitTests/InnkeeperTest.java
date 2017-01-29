import org.junit.Assert;
import org.junit.Test;
import source.Innkeeper;
import source.Player;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class InnkeeperTest {
    @Test
    public void goSleeping()  {
        Player.getInstance().resetPlayer();
        Innkeeper innkeeper = new Innkeeper("Test");
        innkeeper.setRoomPrice(10);
        Player.getInstance().setMoney(100);
        Assert.assertTrue(innkeeper.goSleeping());
        Assert.assertEquals(Player.getInstance().getMoney(), 90);
    }

}