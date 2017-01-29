import org.junit.Assert;
import org.junit.Test;
import source.ItemController;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class ItemControllerTest {
    @Test
    public void getWeaponById() {
        Assert.assertNotNull(ItemController.getWeaponById(0));
    }

    @Test
    public void getPoisonById() {
        Assert.assertNotNull(ItemController.getPoisonById(0));
    }

    @Test
    public void getPotionById() {
        Assert.assertNotNull(ItemController.getPotionById(0));
    }

    @Test
    public void getShieldById() {
        Assert.assertNotNull(ItemController.getShieldById(0));
    }

    @Test
    public void getArmorById() {
        Assert.assertNotNull(ItemController.getArmorById(0));
    }

    @Test
    public void getFocusById() {
        Assert.assertNotNull(ItemController.getFocusById(0));
    }

    @Test
    public void getItemById() {
        Assert.assertNotNull(ItemController.getItemById(0));
    }
}