import org.junit.Assert;
import org.junit.Test;
import source.NPC;

import static org.junit.Assert.*;

/**
 * Created by Michael on 29.01.2017.
 */
public class NPCTest {
    @Test
    public void talk() {
        NPC npc = new NPC("Test", new String[]{"Test1", "Test2", "Test3"});
        Assert.assertTrue(npc.getSentences().contains(npc.talk()));
    }

}