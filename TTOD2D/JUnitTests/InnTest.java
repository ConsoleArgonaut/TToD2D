import org.junit.Assert;
import org.junit.Test;
import source.Inn;
import source.Player;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class InnTest {
    @Test
    public void takeADump() {
        Player.getInstance().resetPlayer();
        Inn inn = new Inn();
        inn.takeADump();
        Assert.assertTrue(Player.getInstance().getStatus() != null);
    }

}