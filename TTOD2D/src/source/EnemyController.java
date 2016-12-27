package source;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Created by Drake on 16.12.2016.
 */
public class EnemyController {
    public ArrayList<Enemy> getEnemies(int count, ArrayList<Types.enemyType> possibleEnemies){
        throw new NotImplementedException();
    }

    public Enemy getFloorBoss(Types.enemyType type, int currentFloor, int maxFloor){
        throw new NotImplementedException();
    }

    public Enemy getDungeonBoss(Types.dungeonType type){
        throw new NotImplementedException();
    }
}
