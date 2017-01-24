package source;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Michael on 16.12.2016.
 */
public class Floor implements java.io.Serializable {
    private ArrayList<Enemy> enemies;
    private int enemiesDefeated = 0;

    private Enemy floorBoss;

    public Floor(){
        enemies = new ArrayList<>();
        floorBoss = new Enemy();
    }

    public Floor(ArrayList<Enemy> enemiesToSet, Enemy floorBossToSet){
        enemies = enemiesToSet;
        floorBoss = floorBossToSet;
    }

    public ArrayList<Enemy> getEnemies(){
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemiesToSet){
        enemies = enemiesToSet;
    }

    public Combat getNextCombat(){
        Enemy nextEnemy;
        if(enemiesDefeated == 5)
            nextEnemy = floorBoss.clone();
        else
            nextEnemy = enemies.get((int)(Math.random() * (enemies.size() - 1))).clone();
        enemiesDefeated++;
        return new Combat(nextEnemy);
    }

    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    public Enemy getFloorBoss() {
        return floorBoss;
    }

    public void setFloorBoss(Enemy floorBoss) {
        this.floorBoss = floorBoss;
    }

}
