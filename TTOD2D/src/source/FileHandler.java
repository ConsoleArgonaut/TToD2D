package source;

import java.io.*;

/**
 * @author pstieger
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class FileHandler {
    /**
     * Tis String is used to save the world state.
     */
    private static final String WORLD_FILE = "world.ser";

    /**
     * This String is used to save the Player state.
     */
    private static final String PLAYER_FILE = "player.ser";

    /**
     * This streing wll be used to get the Filepath.
     */
    private String filePath;

    public FileHandler(){
        filePath = new java.io.File(".").getAbsolutePath();
    }

    /**
     * This method is used to save the state of the world.
     * @param world World passes world to the method.
     * @return Returns true or false.
     */
    public boolean saveGame(World world){
        savePlayer();

        try {
            FileOutputStream fileOut = new FileOutputStream(filePath + WORLD_FILE);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(world);
            out.close();
            fileOut.close();

            return true;
        }catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    /**
     * This method is used to load world.ser.
     * @return Returns world.
     */
    public World loadGame(){
        World world = new World();
        loadPlayer();

        try {
            FileInputStream fileIn = new FileInputStream(filePath + WORLD_FILE);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            world = (World) in.readObject();
            in.close();
            fileIn.close();
        }catch(Exception e) {
            e.printStackTrace();
        }

        return world;
    }

    /**
     * This method is used to save Player to player.ser.
     */
    private void savePlayer(){
        try {
            FileOutputStream fileOut = new FileOutputStream(filePath + PLAYER_FILE);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Player.getInstance());
            out.close();
            fileOut.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is used to load player.ser.
     */
    private void loadPlayer(){
        Player player;

        try {
            FileInputStream fileIn = new FileInputStream(filePath + PLAYER_FILE);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            player = (Player) in.readObject();
            in.close();
            fileIn.close();

            Player.getInstance().setPlayer(player);

            /*
            Player.getInstance().setRace(player.getRace());
            Player.getInstance().setMaxLife(player.getMaxLife());
            Player.getInstance().setExperience(player.getExperience());
            Player.getInstance().setArmor(player.getArmor());
            Player.getInstance().setNextLevel(player.getNextLevel());
            Player.getInstance().setAttack(player.getAttack());
            Player.getInstance().setDefense(player.getDefense());
            Player.getInstance().setFocus(player.getFocus());
            Player.getInstance().setGender(player.getGender());
            Player.getInstance().setImage(player.getImage());
            Player.getInstance().setInitiative(player.getInitiative());
            Player.getInstance().setIntelligence(player.getIntelligence());
            Player.getInstance().setSkills(player.getSkills());
            Player.getInstance().setItems(player.getItems());
            Player.getInstance().setLife(player.getLife());
            Player.getInstance().setMana(player.getMana());
            Player.getInstance().setLevel(player.getLevel());
            Player.getInstance().setMaxMana(player.getMaxMana());
            Player.getInstance().setMoney(player.getMoney());
            Player.getInstance().setName(player.getName());
            Player.getInstance().setShield(player.getShield());
            Player.getInstance().setStatus(player.getStatus());
            Player.getInstance().setWeapon(player.getWeapon());
            */
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
