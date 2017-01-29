import org.junit.Assert;
import org.junit.Test;
import source.StoryController;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class StoryControllerTest {
    @Test
    public void getIntro() {
        Assert.assertTrue(StoryController.getIntro().size() > 0);
    }

    @Test
    public void getCredits() {
        Assert.assertTrue(StoryController.getCredits().size() > 0);
    }

}