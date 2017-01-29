import org.junit.Assert;
import org.junit.Test;
import source.Player;
import source.Skill;
import source.SkillController;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class SkillControllerTest {
    @Test
    public void getSkill() {
        Player.getInstance().resetPlayer();
        Player.getInstance().setLevel(4);
        SkillController.getSkill(4);
        Skill s = Player.getInstance().getSkills().get(0);
        Assert.assertEquals(s.getName(), "Double Strike");
    }
}