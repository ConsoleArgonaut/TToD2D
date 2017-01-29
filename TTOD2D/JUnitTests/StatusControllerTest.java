import org.junit.Assert;
import org.junit.Test;
import source.Status;
import source.StatusController;
import source.Types;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class StatusControllerTest {
    @Test
    public void getStatus() {
        for (Types.effect e:Types.effect.values()) {
            Assert.assertNotNull(new StatusController().getStatus(e));
        }
    }

}