package source;

import java.util.ArrayList;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Floor implements java.io.Serializable {
    /**
     * This variable saves a ArrayList of enemies that can appear on a floor.
     */
    private ArrayList<Enemy> enemies;

    /**
     * This variable is used to count the enemies that have been defeated.
     */
    private int enemiesDefeated = 0;

    /**
     * This variable is used to save the current floor boss.
     */
    private Enemy floorBoss;

    public Floor(){
        enemies = new ArrayList<>();
        floorBoss = new Enemy();
    }

    /**
     * This method is used to set the enemies for a specific floor.
     * @param enemiesToSet This parameter holds teh ArrayList enemies.
     * @param floorBossToSet This parameter initialises teh current floor boss.
     */
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

    /**
     * This method is used to get the next combat instance if necessary
     * @return Returns Combat(nextEnemy)
     */
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
