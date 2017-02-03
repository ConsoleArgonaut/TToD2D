package JUnitTests;

import org.junit.Assert;
import org.junit.Test;
import source.FileHandler;
import source.Player;
import source.World;

import java.io.File;

/**
 * Created by pstieger on 03.02.2017.
 */
public class FileHandlerTest {
    @Test
    public void saveGame() throws Exception {
        World world = new World();
        world.generateDefault();
        world.getDungeons().get(0).setCleared(true);
        Player.getInstance().setName("S");
        FileHandler fileHandler = new FileHandler();
        fileHandler.saveGame(world);

        Assert.assertTrue(doesFileExist("world.ser") && doesFileExist("player.ser"));
    }

    @Test
    public void loadGame() throws Exception {
        FileHandler fileHandler = new FileHandler();
        World world = fileHandler.loadGame();


        Assert.assertTrue(Player.getInstance().getName().equals("S") && world.getDungeons().get(0).isCleared());
    }

    private boolean doesFileExist(String fileName){
        File file = new File(new java.io.File(".").getAbsolutePath() + fileName);

        return file.exists();
    }

}