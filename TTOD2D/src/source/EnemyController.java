package source;

import java.util.ArrayList;

/**
 * @author Drake
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class EnemyController {

    /**
     * This variable call's a new enemy to define the called enemy.
     */
    private Enemy enemyToDefine = new Enemy();

    /**
     * This method is is used to define the enemies that exist in a dungeon by name.
     * @param type Type is used to define the different enemy's by dungeonType.
     * @return Returns the ArrayList enemies.
     */
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

    /**
     * This method is used define the enemies that are floor bosses ijn a dungeon by name
     * @param type Type is used to define the different enemy's by dungeonType.
     * @param currentFloor This parameter holds the value what floor the floor boss is to appear at.
     * @return Returns the variable that is used to define all enemies.
     */
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

    /**
     * This method is used define the enemies that are dungeon bosses ijn a dungeon by name.
     * @param type Type is used to define the different enemy's by dungeonType.
     * @return Returns the variable that is used to define all enemies.
     */
    public Enemy getDungeonBoss(Types.dungeonType type){
        switch (type){
            case fire:
                enemyToDefine = getEnemyByName("Salamander");
                break;
            case water:
                enemyToDefine = getEnemyByName("Levaiathan");
                break;
            case earth:
                enemyToDefine = getEnemyByName("Earthgolem");
                break;
            case wind:
                enemyToDefine = getEnemyByName("Windfiend");
                break;
            case ice:
                enemyToDefine = getEnemyByName("Icedrake");
                break;
            case light:
                enemyToDefine = getEnemyByName("Monarch of Light");
                break;
            case darkness:
                enemyToDefine = getEnemyByName("Monarch of Darkness");
                break;
            case poison:
                enemyToDefine = getEnemyByName("Rafflesia");
                break;
            case lightning:
                enemyToDefine = getEnemyByName("Thunderbird");
                break;
            case unaspected:
                enemyToDefine = getEnemyByName("Phantom");
                break;
            case nature:
                enemyToDefine = getEnemyByName("Gaia");
                break;
            case metal:
                enemyToDefine = getEnemyByName("Iron Golem");
                break;
            case death:
                enemyToDefine = getEnemyByName("Goran the Lich");
                break;
        }
        return enemyToDefine;
    }

    /**
     * This method is used define the enemies that are dungeon bosses ijn a dungeon by name.
     * @param name Name is used to assign the Stats of the individual enemies.
     * @return Returns returnValue.
     */
    public Enemy getEnemyByName(String name){
        Enemy returnValue;
        switch (name){
            case "Lizard":
                returnValue = new Enemy("Lizard", 2000, 25, 35, 10, 10, 100, Types.enemyType.Dragon);
                break;
            case "Shepard":
                returnValue = new Enemy("Shepard", 1, 1500, 150, 10, 15, 100, Types.enemyType.Shepard);
                break;
            case "Steve":
                returnValue = new Enemy("Steve", 100, 1, 1, 10, 15, 100, Types.enemyType.Steve);
                break;
            case "Party Pooper":
                returnValue = new Enemy("Party Pooper", 100, 30, 30, 10, 15, 100, Types.enemyType.Party_Pooper);
                break;
            case "Skeleton":
                returnValue = new Enemy("Skeleton", 1600, 20, 20, 10, 15, 100, Types.enemyType.Undead);
                break;
            case "Pinguin":
                returnValue = new Enemy("Pinguin", 2500, 50, 50, 10, 15, 100, Types.enemyType.Pinguin);
                break;
            case "Treant":
                returnValue = new Enemy("Treant", 1800, 25, 35, 10, 15, 100, Types.enemyType.Treant);
                break;
            case "Dryad":
                returnValue = new Enemy("Dryad", 1900, 30, 15, 10, 15, 100, Types.enemyType.Dryad);
                break;
            case "Light Lizard":
                returnValue =new Enemy("Light Lizard", 200, 25, 350, 10, 10, 100, Types.enemyType.Dragon);
                break;
            case "Bandit":
                returnValue = new Enemy("Bandit", 1750, 30, 30, 10, 15, 100, Types.enemyType.Humanoid);
                break;
            case "Goblin":
                returnValue = new Enemy("Goblin", 1750, 30, 30, 10, 15, 100, Types.enemyType.Goblinoid);
                break;
            case "Spider":
                returnValue = new Enemy("Spider", 1500, 30, 30, 10, 25, 100, Types.enemyType.Creature);
                break;
            case "HoboLin":
                returnValue = new Enemy("HoboLin", 1750, 30, 30, 10, 15, 100, Types.enemyType.Goblinoid);
                break;
            case "Iron Lizard":
                returnValue = new Enemy("Iron Lizard", 2000, 25, 35, 10, 10, 100, Types.enemyType.Dragon);
                break;
            case "Iron Spider":
                returnValue = new Enemy("Iron Spider", 1500, 30, 30, 10, 25, 100, Types.enemyType.Creature);
                break;
            case "Firelizards":
                returnValue = new Enemy("Firelizards", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Waterserpent":
                returnValue = new Enemy("Waterserpent", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Gustfiend":
                returnValue = new Enemy("Gustfiend", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Icewurm":
                returnValue = new Enemy("Icewurm", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "General of Light":
                returnValue = new Enemy("General of Light", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Iron Protectors":
                returnValue = new Enemy("Iron Protectors", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Nature Guardian":
                returnValue = new Enemy("Nature Guardian", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Banditlord":
                returnValue = new Enemy("Banditlord", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Lightningbird":
                returnValue = new Enemy("Lightningbird", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Roppers":
                returnValue = new Enemy("Roppers", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "General of Darkness":
                returnValue = new Enemy("General of Darkness", 5000, 30, 40, 10, 20, 500, Types.enemyType.Dragon);
                break;
            case "Rafflesia":
                returnValue = new Enemy("Rafflesia", 7000, 40, 40, 10, 25, 2000, Types.enemyType.Plant);
                break;
            case "Monarch of Darkness":
                returnValue = new Enemy("Monarch of Darkness", 7500, 40, 40, 10, 35, 2000, Types.enemyType.Humanoid);
                break;
            case "Monarch of Light":
                returnValue = new Enemy("Monarch of Light", 9500, 40, 40, 10, 35, 2000, Types.enemyType.Humanoid);
                break;
            case "Salamander":
                returnValue = new Enemy("Salamander", 8000, 50, 60, 10, 25, 2000, Types.enemyType.Dragon);
                break;
            case "Levaiathan":
                returnValue = new Enemy("Levaiathan", 8350, 50, 50, 10, 25, 2000, Types.enemyType.Dragon);
                break;
            case "Earthgolem":
                returnValue = new Enemy("Earthgolem", 6900, 80, 60, 10, 15, 2000, Types.enemyType.Golem);
                break;
            case "Windfiend":
                returnValue = new Enemy("Windfiend", 8500, 40, 40, 10, 35, 2000, Types.enemyType.Phantom);
                break;
            case "Icedrake":
                returnValue = new Enemy("Icedrake", 7000, 50, 65, 10, 25, 2000, Types.enemyType.Dragon);
                break;
            case "Goran the Lich":
                returnValue = new Enemy("Goran the Lich", 11350, 60, 60, 50, 40, 4000, Types.enemyType.Lich);
                break;
            case "Iron Golem":
                returnValue = new Enemy("Iron Golem", 6750, 80, 60, 10, 15, 2000, Types.enemyType.Golem);
                break;
            case "Gaia":
                returnValue = new Enemy("Gaia", 8450, 40, 75, 10, 25, 2000, Types.enemyType.Titan);
                break;
            case "Phantom":
                returnValue = new Enemy("Phantom", 8875, 40, 45, 10, 45, 2000, Types.enemyType.Phantom);
                break;
            case "Thunderbird":
                returnValue = new Enemy("Thunderbird", 7900, 60, 40, 10, 30, 2000, Types.enemyType.Bird);
                break;
            default:
                returnValue = getEnemyByName("Steve");
                break;
        }
        return returnValue;
    }
}