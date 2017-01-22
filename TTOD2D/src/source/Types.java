package source;

/**
 * Created by Michael on 16.12.2016.
 */
public class Types {
    public enum dungeonType{
        fire, water, earth, wind, ice, light, darkness, poison, lightning, unaspected, nature, metal, death
    }

    public enum buildingType{
        Inn, Shop, Blacksmith, Unknown
    }

    public enum playerRace{
        Unknown, Human, Dwarf, Dragonpeeps, Big_Daddys
    }

    public enum combatActionResult{
        ItemUsed, ItemMissed, Attacked, AttackMissed, Defended, Escaped, Waited, Evolved
    }

    public enum effect{
        Good, Unrelenting, Stunned, Burning, Poisoned, Freezing, Constipated
    }

    public enum enemyType{
        Dragon, Humanoid, Goblinoid, Creature, Shepard, Undead, Lich, Steve, Pinguin, Treant, Dryad, Party_Pooper, Plant, Golem, Bird, Phantom, Titan
    }

    public enum itemType {
        Armor, Weapon, Potion, Focus, Poison, Shield,Scrap
    }
}
