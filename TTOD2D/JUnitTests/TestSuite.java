import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by pstieger on 03.02.2017.
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CombatTest.class,
        DungeonTest.class,
        EasyCombatTest.class,
        EnemyControllerTest.class,
        FileHandlerTest.class,
        FloorTest.class,
        InnkeeperTest.class,
        InnTest.class,
        ItemControllerTest.class,
        NPCTest.class,
        SkillControllerTest.class,
        StatusControllerTest.class,
        StoryControllerTest.class,
        TraderTest.class,
        WorldTest.class
})

public class TestSuite {
}
