package source;

/**
 * Created by Michael on 16.12.2016.
 */
public class Types {
    public enum dungeonType{
        fire, water, earth, wind, ice, light, darkness, poison, lightning, unaspected, nature, metal
    }

    public enum buildingType{
        Inn, Shop, Blacksmith, Unknown
    }

    public enum playerRace{
        Unknown, Huuman, Dwarf, Dragonpeeps, Big_Daddys
    }

    public enum combatActionResult{
        ItemUsed, ItemMissed, Attacked, AttackMissed, Defended, Escaped, Waited, Evolved
    }

    public enum effect{
        Good, Unrellenting, Stunned, Burning, Poisoned, Constipated
    }

    public enum enemyType{
        Dragon, Humanoid, Goblinoid, Creature, Shepard, Undead, Lich, Steve, Pinguin, Treant, Dryad, Party_Pooper
    }

    public enum itemType {
        Armor, Weapon, Potion, Focus, Poison, Shield,Scrap
    }
}
