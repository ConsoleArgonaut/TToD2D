package source;

import java.util.ArrayList;

/**
 * Created by Michael on 16.12.2016.
 */
public class Floor {
    private ArrayList<Enemy> enemies;

    public Floor(){
        enemies = new ArrayList<>();
    }

    public Floor(ArrayList<Enemy> enemiesToSet){
        enemies = enemiesToSet;
    }

    public ArrayList<Enemy> getEnemies(){
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemiesToSet){
        enemies = enemiesToSet;
    }

    public Combat getNextCombat(){
        Enemy nextEnemy = enemies.get(0);
        enemies.remove(nextEnemy);
        return new Combat(nextEnemy);
    }
}
