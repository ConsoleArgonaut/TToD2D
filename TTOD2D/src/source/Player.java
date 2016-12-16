package source;

/**
 * Created by Michael on 16.12.2016.
 */
public class Player extends Character {
    private static Player ourInstance = new Player();

    public static Player getInstance() {
        return ourInstance;
    }

    private Player() {
    }
}
