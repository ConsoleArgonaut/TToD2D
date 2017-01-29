import org.junit.Assert;
import org.junit.Test;
import source.Player;
import source.World;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class WorldTest {
    @Test
    public void generateDefault() {
        Player.getInstance().resetPlayer();
        World world = new World();
        world.generateDefault();
        Assert.assertTrue(world.getTowns().size() > 0);
        Assert.assertTrue(world.getDungeons().size() > 0);
        Assert.assertNotNull(Player.getInstance().getWeapon());
    }

}