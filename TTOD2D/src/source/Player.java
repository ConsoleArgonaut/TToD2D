package source;

/**
 * Created by Michael on 16.12.2016.
 */
public class Player extends Character {
    private static Player ourInstance = new Player();

    private float experience;
    private Types.playerRace race;
    private float nextLevel;


    public static Player getInstance() {
        return ourInstance;
    }

    public Player() {
        experience = 0;
        race = Types.playerRace.Unknown;
        nextLevel = 0;
    }


}
