package source;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Created by Drake on 16.12.2016.
 */
public class EnemyController {
    private Enemy enemyToDefine = new Enemy();
    public ArrayList<Enemy> getEnemies(int count, ArrayList<Types.enemyType> possibleEnemies){
        throw new NotImplementedException();
    }

    public Enemy getFloorBoss(Types.enemyType type, int currentFloor, int maxFloor){
        throw new NotImplementedException();
    }

    public Enemy getDungeonBoss(Types.dungeonType type){
        switch (type){
            case fire:
                enemyToDefine.setName("Firelizards");
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
                enemyToDefine.setName("Waterserpent");
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
/*
public class EnemyController {
    public Enemy getEnemy(Types.Enemy type){
        Enemy enemyToDefine = new Enemy();
        switch (type){
            case Creature:
                enemyToDefine.Name = "Spider";
                enemyToDefine.MaxLife = 175;
                enemyToDefine.Life = enemyToDefine.MaxLife;
                enemyToDefine.Defense = 20;
                enemyToDefine.Attack = 20;
                enemyToDefine.Intelligence = 10;
                enemyToDefine.CritChance = 50;
                enemyToDefine.BlockChance = 50;
                enemyToDefine.Luck = 10;
                enemyToDefine.Initiative = 25;
                enemyToDefine.MaxItems = 5;
                enemyToDefine.GEIL = 100;
                enemyToDefine.Type = Types.Enemy.Creature;
                break;
            case Humanoid:
                enemyToDefine.Name = "Bandit";
                enemyToDefine.MaxLife = 100;
                enemyToDefine.Life = enemyToDefine.MaxLife;
                enemyToDefine.Defense = 20;
                enemyToDefine.Attack = 20;
                enemyToDefine.Intelligence = 10;
                enemyToDefine.CritChance = 50;
                enemyToDefine.BlockChance = 50;
                enemyToDefine.Luck = 10;
                enemyToDefine.Initiative = 15;
                enemyToDefine.MaxItems = 5;
                enemyToDefine.GEIL = 100;
                enemyToDefine.Type = Types.Enemy.Humanoid;
                break;
            case Goblinoid:
                enemyToDefine.Name = "Goblin";
                enemyToDefine.MaxLife = 150;
                enemyToDefine.Life = enemyToDefine.MaxLife;
                enemyToDefine.Defense = 10;
                enemyToDefine.Attack = 25;
                enemyToDefine.Intelligence = 10;
                enemyToDefine.CritChance = 50;
                enemyToDefine.BlockChance = 50;
                enemyToDefine.Luck = 10;
                enemyToDefine.Initiative = 15;
                enemyToDefine.MaxItems = 5;
                enemyToDefine.GEIL = 100;
                enemyToDefine.Type = Types.Enemy.Goblinoid;
                break;
            case Shepard:
                enemyToDefine.Name = "Shepard";
                enemyToDefine.MaxLife = 1;
                enemyToDefine.Life = enemyToDefine.MaxLife;
                enemyToDefine.Defense = 200;
                enemyToDefine.Attack = 200;
                enemyToDefine.Intelligence = 100;
                enemyToDefine.CritChance = 100;
                enemyToDefine.BlockChance = 50;
                enemyToDefine.Luck = 100;
                enemyToDefine.Initiative = 15;
                enemyToDefine.MaxItems = 5;
                enemyToDefine.GEIL = 33;
                enemyToDefine.Type = Types.Enemy.Shepard;
                break;
            case Dragon:
                enemyToDefine.Name = "Dragon";
                enemyToDefine.MaxLife = 500;
                enemyToDefine.Life = enemyToDefine.MaxLife;
                enemyToDefine.Defense = 40;
                enemyToDefine.Attack = 40;
                enemyToDefine.Intelligence = 20;
                enemyToDefine.CritChance = 50;
                enemyToDefine.BlockChance = 50;
                enemyToDefine.Luck = 20;
                enemyToDefine.Initiative = 25;
                enemyToDefine.MaxItems = 10;
                enemyToDefine.GEIL = 500;
                enemyToDefine.EvolvesTo = getEnemy(Types.Enemy.Undead);
                enemyToDefine.Type = Types.Enemy.Dragon;
                break;
            case Undead:
                enemyToDefine.Name = "Dracolich";
                enemyToDefine.MaxLife = 800;
                enemyToDefine.Life = enemyToDefine.MaxLife;
                enemyToDefine.Defense = 50;
                enemyToDefine.Attack = 50;
                enemyToDefine.Intelligence = 30;
                enemyToDefine.CritChance = 50;
                enemyToDefine.BlockChance = 50;
                enemyToDefine.Luck = 10;
                enemyToDefine.Initiative = 35;
                enemyToDefine.MaxItems = 15;
                enemyToDefine.GEIL = 1000;
                enemyToDefine.Type = Types.Enemy.Undead;
                break;
            case Lich:
                enemyToDefine.Name = "Goran the Lich";
                enemyToDefine.MaxLife = 1000;
                enemyToDefine.Life = enemyToDefine.MaxLife;
                enemyToDefine.Defense = 60;
                enemyToDefine.Attack = 60;
                enemyToDefine.Intelligence = 50;
                enemyToDefine.CritChance = 50;
                enemyToDefine.BlockChance = 50;
                enemyToDefine.Luck = 15;
                enemyToDefine.Initiative = 40;
                enemyToDefine.MaxItems = 20;
                enemyToDefine.GEIL = 2000;
                enemyToDefine.Type = Types.Enemy.Lich;
                break;
            default:
                enemyToDefine.Name = "Steve";
                enemyToDefine.MaxLife = 1;
                enemyToDefine.Life = enemyToDefine.MaxLife;
                enemyToDefine.Defense = 1;
                enemyToDefine.Attack = 1;
                enemyToDefine.Intelligence = 1;
                enemyToDefine.CritChance = 1;
                enemyToDefine.BlockChance = 1;
                enemyToDefine.Luck = 1;
                enemyToDefine.Initiative = 1;
                enemyToDefine.MaxItems = 1;
                enemyToDefine.GEIL = 1;
                enemyToDefine.Type = type;
                break;
        }
        return enemyToDefine;
    }
}
 */