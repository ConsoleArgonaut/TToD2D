package source;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Types {

    /**
     * This enum holds all dungeon types.
     */
    public enum dungeonType{
        fire, water, earth, wind, ice, light, darkness, poison, lightning, unaspected, nature, metal, death
    }

    /**
     * This enum holds all building types.
     */
    public enum buildingType{
        Inn, Shop, Blacksmith, Unknown
    }

    /**
     * This enum holds all player races.
     */
    public enum playerRace{
        Unknown, Human, Dwarf, Dragonpeeps, Big_Daddys
    }

    /**
     * This enum holds all combat action results.
     */
    public enum combatActionResult{
        ItemUsed, ItemMissed, Attacked, AttackMissed, Defended, Escaped, Waited, Evolved
    }

    /**
     * This enum holds all effect types.
     */
    public enum effect{
        Good, Unrelenting, Stunned, Burning, Poisoned, Freezing, Constipated
    }

    /**
     * This enum holds all enemy types.
     */
    public enum enemyType{
        Dragon, Humanoid, Goblinoid, Creature, Shepard, Undead, Lich, Steve, Pinguin, Treant, Dryad, Party_Pooper, Plant, Golem, Bird, Phantom, Titan
    }

    /**
     * This enum holds all item types.
     */
    public enum itemType {
        Armor, Weapon, Potion, Focus, Poison, Shield,Scrap
    }
}
