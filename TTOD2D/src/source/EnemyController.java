package source;

import java.util.ArrayList;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class EnemyController {
    private Enemy enemyToDefine = new Enemy();
    public ArrayList<Enemy> getEnemies(Types.dungeonType type){
        ArrayList<Enemy> enemies = new ArrayList<>();
        if(type == Types.dungeonType.fire){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Party Pooper"));
        }
        if (type == Types.dungeonType.water){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Skeleton"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Pinguin"));
            enemies.add(getEnemyByName("Party Pooper"));

        }
        if (type == Types.dungeonType.wind){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Pinguin"));
            enemies.add(getEnemyByName("Party Pooper"));
        }
        if (type == Types.dungeonType.earth){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Treant"));
            enemies.add(getEnemyByName("Dryad"));
            enemies.add(getEnemyByName("Party Pooper"));
        }
        if (type == Types.dungeonType.light){
            enemies.add(getEnemyByName("Light Lizard"));
            enemies.add(getEnemyByName("Bandit"));
            enemies.add(getEnemyByName("Goblin"));
            enemies.add(getEnemyByName("Spider"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Skeleton"));
            enemies.add(getEnemyByName("Party Pooper"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Pinguin"));
            enemies.add(getEnemyByName("Treant"));
            enemies.add(getEnemyByName("Dryad"));
            enemies.add(getEnemyByName("Party Pooper"));
        }
        if (type == Types.dungeonType.lightning){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Goblin"));
            enemies.add(getEnemyByName("Spider"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Party Pooper"));
        }
        if (type == Types.dungeonType.darkness){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Bandit"));
            enemies.add(getEnemyByName("Goblin"));
            enemies.add(getEnemyByName("Spider"));
            enemies.add(getEnemyByName("Skeleton"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Pinguin"));
            enemies.add(getEnemyByName("Treant"));
            enemies.add(getEnemyByName("Dryad"));
            enemies.add(getEnemyByName("Party Pooper"));
        }
        if (type == Types.dungeonType.poison){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Goblin"));
            enemies.add(getEnemyByName("Spider"));
            enemies.add(getEnemyByName("Skeleton"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Treant"));
            enemies.add(getEnemyByName("Dryad"));
            enemies.add(getEnemyByName("Party Pooper"));
        }
        if (type == Types.dungeonType.ice){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Spider"));
            enemies.add(getEnemyByName("Skeleton"));
            enemies.add(getEnemyByName("Pinguin"));
        }
        if (type == Types.dungeonType.nature){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Bandit"));
            enemies.add(getEnemyByName("Goblin"));
            enemies.add(getEnemyByName("Spider"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Pinguin"));
            enemies.add(getEnemyByName("Treant"));
            enemies.add(getEnemyByName("Dryad"));
            enemies.add(getEnemyByName("Party Pooper"));
        }
        if (type == Types.dungeonType.unaspected){
            enemies.add(getEnemyByName("Lizard"));
            enemies.add(getEnemyByName("Bandit"));
            enemies.add(getEnemyByName("HoboLin"));
            enemies.add(getEnemyByName("Spider"));
            enemies.add(getEnemyByName("Shepard"));
            enemies.add(getEnemyByName("Skeleton"));
            enemies.add(getEnemyByName("Steve"));
            enemies.add(getEnemyByName("Pinguin"));
            enemies.add(getEnemyByName("Treant"));
            enemies.add(getEnemyByName("Dryad"));
            enemies.add(getEnemyByName("Party Pooper"));
        }
        if (type == Types.dungeonType.metal){
            enemies.add(getEnemyByName("Iron Lizard"));
            enemies.add(getEnemyByName("Iron Spider"));
            enemies.add(getEnemyByName("Skeleton"));
            enemies.add(getEnemyByName("Steve"));
        }
        return enemies;
    }

    public Enemy getFloorBoss(Types.dungeonType type, int currentFloor){
        if(type == Types.dungeonType.fire){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Firelizards");
                    break;
            }
        }
        if(type == Types.dungeonType.water){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Waterserpent");
                    break;
            }
        }
        if(type == Types.dungeonType.earth){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Mudgolem");
                    break;
            }
        }
        if(type == Types.dungeonType.wind){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Gustfiend");
                    break;
            }
        }
        if(type == Types.dungeonType.ice){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Icewurm");
                    break;
            }
        }
        if(type == Types.dungeonType.light){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("General of Light");
                    break;
            }
        }
        if(type == Types.dungeonType.darkness){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("General of Darkness");
                    break;
            }
        }
        if(type == Types.dungeonType.poison){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Roppers");
                    break;
            }
        }
        if(type == Types.dungeonType.lightning){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Lightningbird");
                    break;
            }
        }
        if(type == Types.dungeonType.unaspected){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Banditlord");
                    break;
            }
        }
        if(type == Types.dungeonType.nature){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Nature Guardian");
                    break;
            }
        }
        if(type == Types.dungeonType.metal){
            switch (currentFloor){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    enemyToDefine = getEnemyByName("Iron Protectors");
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

    public Enemy getEnemyByName(String name){
        Enemy returnValue;
        switch (name){
            case "Lizard":
                returnValue = new Enemy("Lizard", 2000, 250, 350, 10, 10, 100, Types.enemyType.Dragon);
                break;
            case "Shepard":
                returnValue = new Enemy("Shepard", 1, 1500, 1500, 10, 15, 100, Types.enemyType.Shepard);
                break;
            case "Steve":
                returnValue = new Enemy("Steve", 100, 1, 1, 10, 15, 100, Types.enemyType.Steve);
                break;
            case "Party Pooper":
                returnValue = new Enemy("Party Pooper", 100, 300, 300, 10, 15, 100, Types.enemyType.Party_Pooper);
                break;
            case "Skeleton":
                returnValue = new Enemy("Skeleton", 1600, 200, 200, 10, 15, 100, Types.enemyType.Undead);
                break;
            case "Pinguin":
                returnValue = new Enemy("Pinguin", 2500, 500, 500, 10, 15, 100, Types.enemyType.Pinguin);
                break;
            case "Treant":
                returnValue = new Enemy("Treant", 1800, 250, 350, 10, 15, 100, Types.enemyType.Treant);
                break;
            case "Dryad":
                returnValue = new Enemy("Dryad", 1900, 300, 150, 10, 15, 100, Types.enemyType.Dryad);
                break;
            case "Light Lizard":
                returnValue =new Enemy("Light Lizard", 2000, 250, 350, 10, 10, 100, Types.enemyType.Dragon);
                break;
            case "Bandit":
                returnValue = new Enemy("Bandit", 1750, 300, 300, 10, 15, 100, Types.enemyType.Humanoid);
                break;
            case "Goblin":
                returnValue = new Enemy("Goblin", 1750, 300, 300, 10, 15, 100, Types.enemyType.Goblinoid);
                break;
            case "Spider":
                returnValue = new Enemy("Spider", 1500, 300, 300, 10, 25, 100, Types.enemyType.Creature);
                break;
            case "HoboLin":
                returnValue = new Enemy("HoboLin", 1750, 300, 300, 10, 15, 100, Types.enemyType.Goblinoid);
                break;
            case "Iron Lizard":
                returnValue = new Enemy("Iron Lizard", 2000, 250, 350, 10, 10, 100, Types.enemyType.Dragon);
                break;
            case "Iron Spider":
                returnValue = new Enemy("Iron Spider", 1500, 300, 300, 10, 25, 100, Types.enemyType.Creature);
                break;
            case "Firelizards":
                returnValue = new Enemy("Firelizards", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Waterserpent":
                returnValue = new Enemy("Waterserpent", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Gustfiend":
                returnValue = new Enemy("Gustfiend", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Icewurm":
                returnValue = new Enemy("Icewurm", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "General of Light":
                returnValue = new Enemy("General of Light", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Iron Protectors":
                returnValue = new Enemy("Iron Protectors", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Nature Guardian":
                returnValue = new Enemy("Nature Guardian", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Banditlord":
                returnValue = new Enemy("Banditlord", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Lightningbird":
                returnValue = new Enemy("Lightningbird", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Roppers":
                returnValue = new Enemy("Roppers", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "General of Darkness":
                returnValue = new Enemy("General of Darkness", 5000, 300, 400, 10, 20, 500, Types.enemyType.Dragon);
                break;
            default:
                returnValue = getEnemyByName("Steve");
                break;
        }
        return returnValue;
    }
}