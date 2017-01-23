package source;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Created by Drake on 16.12.2016.
 */
public class EnemyController {
    private Enemy enemyToDefine = new Enemy();
    public ArrayList<Enemy> getEnemies(Types.dungeonType type){
        ArrayList<Enemy> enemies = new ArrayList<>();
        if(type == Types.dungeonType.fire){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
                }
        }
        if (type == Types.dungeonType.water){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;

                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Undead:
                    enemyToDefine.setName("Skeleton");
                    enemyToDefine.setMaxLife(160);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(20);
                    enemyToDefine.setAttack(20);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Undead);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Pinguin:
                    enemyToDefine.setName("Pinguin");
                    enemyToDefine.setMaxLife(250);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(50);
                    enemyToDefine.setAttack(50);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Pinguin);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.wind){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Pinguin:
                    enemyToDefine.setName("Pinguin");
                    enemyToDefine.setMaxLife(250);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(50);
                    enemyToDefine.setAttack(50);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Pinguin);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.earth){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Treant:
                    enemyToDefine.setName("Treant");
                    enemyToDefine.setMaxLife(180);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Treant);
                    enemies.add(enemyToDefine);
                    break;
                case Dryad:
                    enemyToDefine.setName("Dryad");
                    enemyToDefine.setMaxLife(190);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(15);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dryad);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.light){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Light Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Humanoid:
                    enemyToDefine.setName("Bandit");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Humanoid);
                    enemies.add(enemyToDefine);
                    break;
                case Goblinoid:
                    enemyToDefine.setName("Goblin");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Goblinoid);
                    enemies.add(enemyToDefine);
                    break;
                case Creature:
                    enemyToDefine.setName("Spider");
                    enemyToDefine.setMaxLife(150);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(25);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Creature);
                    enemies.add(enemyToDefine);
                    break;
                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Undead:
                    enemyToDefine.setName("Skeleton");
                    enemyToDefine.setMaxLife(160);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(20);
                    enemyToDefine.setAttack(20);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Undead);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Pinguin:
                    enemyToDefine.setName("Pinguin");
                    enemyToDefine.setMaxLife(250);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(50);
                    enemyToDefine.setAttack(50);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Pinguin);
                    enemies.add(enemyToDefine);
                    break;
                case Treant:
                    enemyToDefine.setName("Treant");
                    enemyToDefine.setMaxLife(180);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Treant);
                    enemies.add(enemyToDefine);
                    break;
                case Dryad:
                    enemyToDefine.setName("Dryad");
                    enemyToDefine.setMaxLife(190);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(15);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dryad);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.lightning){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Goblinoid:
                    enemyToDefine.setName("Goblin");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Goblinoid);
                    enemies.add(enemyToDefine);
                    break;
                case Creature:
                    enemyToDefine.setName("Spider");
                    enemyToDefine.setMaxLife(150);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(25);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Creature);
                    enemies.add(enemyToDefine);
                    break;
                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.darkness){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Humanoid:
                    enemyToDefine.setName("Bandit");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Humanoid);
                    enemies.add(enemyToDefine);
                    break;
                case Goblinoid:
                    enemyToDefine.setName("Goblin");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Goblinoid);
                    enemies.add(enemyToDefine);
                    break;
                case Creature:
                    enemyToDefine.setName("Spider");
                    enemyToDefine.setMaxLife(150);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(25);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Creature);
                    enemies.add(enemyToDefine);
                    break;
                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Undead:
                    enemyToDefine.setName("Skeleton");
                    enemyToDefine.setMaxLife(160);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(20);
                    enemyToDefine.setAttack(20);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Undead);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Pinguin:
                    enemyToDefine.setName("Pinguin");
                    enemyToDefine.setMaxLife(250);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(50);
                    enemyToDefine.setAttack(50);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Pinguin);
                    enemies.add(enemyToDefine);
                    break;
                case Treant:
                    enemyToDefine.setName("Treant");
                    enemyToDefine.setMaxLife(180);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Treant);
                    enemies.add(enemyToDefine);
                    break;
                case Dryad:
                    enemyToDefine.setName("Dryad");
                    enemyToDefine.setMaxLife(190);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(15);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dryad);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.poison){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Goblinoid:
                    enemyToDefine.setName("Goblin");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Goblinoid);
                    enemies.add(enemyToDefine);
                    break;
                case Creature:
                    enemyToDefine.setName("Spider");
                    enemyToDefine.setMaxLife(150);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(25);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Creature);
                    enemies.add(enemyToDefine);
                    break;
                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Undead:
                    enemyToDefine.setName("Skeleton");
                    enemyToDefine.setMaxLife(160);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(20);
                    enemyToDefine.setAttack(20);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Undead);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Treant:
                    enemyToDefine.setName("Treant");
                    enemyToDefine.setMaxLife(180);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Treant);
                    enemies.add(enemyToDefine);
                    break;
                case Dryad:
                    enemyToDefine.setName("Dryad");
                    enemyToDefine.setMaxLife(190);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(15);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dryad);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.ice){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Creature:
                    enemyToDefine.setName("Spider");
                    enemyToDefine.setMaxLife(150);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(25);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Creature);
                    enemies.add(enemyToDefine);
                    break;
                case Undead:
                    enemyToDefine.setName("Skeleton");
                    enemyToDefine.setMaxLife(160);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(20);
                    enemyToDefine.setAttack(20);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Undead);
                    enemies.add(enemyToDefine);
                    break;
                case Pinguin:
                    enemyToDefine.setName("Pinguin");
                    enemyToDefine.setMaxLife(250);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(50);
                    enemyToDefine.setAttack(50);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Pinguin);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.nature){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Humanoid:
                    enemyToDefine.setName("Bandit");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Humanoid);
                    enemies.add(enemyToDefine);
                    break;
                case Goblinoid:
                    enemyToDefine.setName("Goblin");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Goblinoid);
                    enemies.add(enemyToDefine);
                    break;
                case Creature:
                    enemyToDefine.setName("Spider");
                    enemyToDefine.setMaxLife(150);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(25);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Creature);
                    enemies.add(enemyToDefine);
                    break;
                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Pinguin:
                    enemyToDefine.setName("Pinguin");
                    enemyToDefine.setMaxLife(250);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(50);
                    enemyToDefine.setAttack(50);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Pinguin);
                    enemies.add(enemyToDefine);
                    break;
                case Treant:
                    enemyToDefine.setName("Treant");
                    enemyToDefine.setMaxLife(180);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Treant);
                    enemies.add(enemyToDefine);
                    break;
                case Dryad:
                    enemyToDefine.setName("Dryad");
                    enemyToDefine.setMaxLife(190);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(15);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dryad);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.unaspected){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Humanoid:
                    enemyToDefine.setName("Bandit");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Humanoid);
                    enemies.add(enemyToDefine);
                    break;
                case Goblinoid:
                    enemyToDefine.setName("Hoboblin");
                    enemyToDefine.setMaxLife(175);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Goblinoid);
                    enemies.add(enemyToDefine);
                    break;
                case Creature:
                    enemyToDefine.setName("Spider");
                    enemyToDefine.setMaxLife(150);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(25);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Creature);
                    enemies.add(enemyToDefine);
                    break;
                case Shepard:
                    enemyToDefine.setName("Shepard");
                    enemyToDefine.setMaxLife(1);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(150);
                    enemyToDefine.setAttack(150);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Shepard);
                    enemies.add(enemyToDefine);
                    break;
                case Undead:
                    enemyToDefine.setName("Skeleton");
                    enemyToDefine.setMaxLife(160);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(20);
                    enemyToDefine.setAttack(20);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Undead);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
                case Pinguin:
                    enemyToDefine.setName("Pinguin");
                    enemyToDefine.setMaxLife(250);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(50);
                    enemyToDefine.setAttack(50);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Pinguin);
                    enemies.add(enemyToDefine);
                    break;
                case Treant:
                    enemyToDefine.setName("Treant");
                    enemyToDefine.setMaxLife(180);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Treant);
                    enemies.add(enemyToDefine);
                    break;
                case Dryad:
                    enemyToDefine.setName("Dryad");
                    enemyToDefine.setMaxLife(190);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(15);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dryad);
                    enemies.add(enemyToDefine);
                    break;
                case Party_Pooper:
                    enemyToDefine.setName("Party Pooper");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Party_Pooper);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        if (type == Types.dungeonType.metal){
            switch (new Enemy().getType()){
                case Dragon:
                    enemyToDefine.setName("Iron Lizard");
                    enemyToDefine.setMaxLife(200);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(25);
                    enemyToDefine.setAttack(35);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(10);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    enemies.add(enemyToDefine);
                    break;
                case Creature:
                    enemyToDefine.setName("Iron Spider");
                    enemyToDefine.setMaxLife(150);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(30);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(25);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Creature);
                    enemies.add(enemyToDefine);
                    break;
                case Undead:
                    enemyToDefine.setName("Skeleton");
                    enemyToDefine.setMaxLife(160);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(20);
                    enemyToDefine.setAttack(20);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Undead);
                    enemies.add(enemyToDefine);
                    break;
                case Steve:
                    enemyToDefine.setName("Steve");
                    enemyToDefine.setMaxLife(100);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(1);
                    enemyToDefine.setAttack(1);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(15);
                    enemyToDefine.setMoney(100);
                    enemyToDefine.setType(Types.enemyType.Steve);
                    enemies.add(enemyToDefine);
                    break;
            }
        }
        return enemies;
    }

    public Enemy getFloorBoss(Types.dungeonType type, int currentFloor){
        if(type == Types.dungeonType.fire){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Firelizards");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Firelizards");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Firelizards");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Firelizards");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Firelizards");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.water){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Waterserpent");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Waterserpent");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Waterserpent");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Waterserpent");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Waterserpent");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.earth){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Mudgolem");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Mudgolem");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Mudgolem");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Mudgolem");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Mudgolem");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.wind){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Gustfiend");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Gustfiend");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Gustfiend");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Gustfiend");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Gustfiend");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.ice){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Icewurm");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Icewurm");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Icewurm");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Icewurm");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Icewurm");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.light){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("General of Light");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("General of Light");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("General of Light");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("General of Light");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("General of Light");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.darkness){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("General of Darkness");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("General of Darkness");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("General of Darkness");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("General of Darkness");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("General of Darkness");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.poison){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Roppers");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Roppers");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Roppers");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Roppers");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Roppers");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.lightning){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Lightningbird");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Lightningbird");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Lightningbird");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Lightningbird");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Lightningbird");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.unaspected){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Banditlord");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Banditlord");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Banditlord");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Banditlord");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Banditlord");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.nature){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Nature Guardian");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Nature Guardian");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Nature Guardian");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Nature Guardian");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Nature Guardian");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        if(type == Types.dungeonType.metal){
            switch (currentFloor){
                case 1:
                    enemyToDefine.setName("Iron Protectors");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 2:
                    enemyToDefine.setName("Iron Protectors");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 3:
                    enemyToDefine.setName("Iron Protectors");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 4:
                    enemyToDefine.setName("Iron Protectors");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
                case 5:
                    enemyToDefine.setName("Iron Protectors");
                    enemyToDefine.setMaxLife(500);
                    enemyToDefine.setLife(enemyToDefine.getMaxLife());
                    enemyToDefine.setDefense(30);
                    enemyToDefine.setAttack(40);
                    enemyToDefine.setIntelligence(10);
                    enemyToDefine.setInitiative(20);
                    enemyToDefine.setMoney(500);
                    enemyToDefine.setType(Types.enemyType.Dragon);
                    break;
            }
        }
        return enemyToDefine;
    }

    public Enemy getDungeonBoss(Types.dungeonType type){
        switch (type){
            case fire:
                enemyToDefine.setName("Salamander");
                enemyToDefine.setMaxLife(1000);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(50);
                enemyToDefine.setAttack(60);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(25);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Dragon);
                break;
            case water:
                enemyToDefine.setName("Levaiathan");
                enemyToDefine.setMaxLife(800);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(50);
                enemyToDefine.setAttack(50);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(25);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Dragon);
                break;
            case earth:
                enemyToDefine.setName("Earthgolem");
                enemyToDefine.setMaxLife(1200);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(80);
                enemyToDefine.setAttack(60);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(15);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Golem);
                break;
            case wind:
                enemyToDefine.setName("Windfiend");
                enemyToDefine.setMaxLife(850);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(40);
                enemyToDefine.setAttack(40);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(35);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Phantom);
                break;
            case ice:
                enemyToDefine.setName("Icedrake");
                enemyToDefine.setMaxLife(1000);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(50);
                enemyToDefine.setAttack(65);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(25);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Dragon);
                break;
            case light:
                enemyToDefine.setName("Monarch of Light");
                enemyToDefine.setMaxLife(950);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(40);
                enemyToDefine.setAttack(40);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(35);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Humanoid);
                break;
            case darkness:
                enemyToDefine.setName("Monarch of Darkness");
                enemyToDefine.setMaxLife(950);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(40);
                enemyToDefine.setAttack(40);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(35);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Humanoid);
                break;
            case poison:
                enemyToDefine.setName("Rafflesia");
                enemyToDefine.setMaxLife(1400);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(40);
                enemyToDefine.setAttack(40);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(25);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Plant);
                break;
            case lightning:
                enemyToDefine.setName("Thunderbird");
                enemyToDefine.setMaxLife(900);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(60);
                enemyToDefine.setAttack(40);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(30);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Bird);
                break;
            case unaspected:
                enemyToDefine.setName("Phantom");
                enemyToDefine.setMaxLife(875);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(40);
                enemyToDefine.setAttack(45);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(45);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Phantom);
                break;
            case nature:
                enemyToDefine.setName("Gaia");
                enemyToDefine.setMaxLife(1450);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(40);
                enemyToDefine.setAttack(75);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(25);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Titan);
                break;
            case metal:
                enemyToDefine.setName("Iron Golem");
                enemyToDefine.setMaxLife(1750);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(80);
                enemyToDefine.setAttack(60);
                enemyToDefine.setIntelligence(10);
                enemyToDefine.setInitiative(15);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Golem);
                break;
            case death:
                enemyToDefine.setName("Goran the Lich");
                enemyToDefine.setMaxLife(1000);
                enemyToDefine.setLife(enemyToDefine.getMaxLife());
                enemyToDefine.setDefense(60);
                enemyToDefine.setAttack(60);
                enemyToDefine.setIntelligence(50);
                enemyToDefine.setInitiative(40);
                enemyToDefine.setMoney(2000);
                enemyToDefine.setType(Types.enemyType.Lich);
                break;
        }
        return enemyToDefine;
    }
}