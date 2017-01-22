package source;

/**
 * Created by Michael on 22.01.2017.
 */
public class ItemController {
    public static Weapon getWeaponById(int weaponNumber){
        Weapon returnValue = new Weapon();
        switch (weaponNumber){
            case 1:
                returnValue.setName("Stick");
                returnValue.setAttack(10);
                returnValue.setCritChance(10);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(3);
                returnValue.setValue(20);
                break;
            case 2:
                returnValue.setName("The blade of heroes");
                returnValue.setAttack(120);
                returnValue.setCritChance(80);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(3);
                returnValue.setValue(700);
                break;
            case 3:
                returnValue.setName("Woodcutters Axe");
                returnValue.setAttack(100);
                returnValue.setCritChance(10);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(3);
                returnValue.setValue(400);
                break;
            case 4:
                returnValue.setName("Cold iron");
                returnValue.setAttack(180);
                returnValue.setCritChance(20);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(3);
                returnValue.setValue(1200);
                break;
            case 5:
                returnValue.setName("Adamantium blade");
                returnValue.setAttack(200);
                returnValue.setCritChance(30);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(3);
                returnValue.setValue(1500);
                break;
            case 6:
                returnValue.setName("Black saber");
                returnValue.setAttack(120);
                returnValue.setCritChance(90);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(3);
                returnValue.setValue(1000);
                break;
            case 7:
                returnValue.setName("Old sword");
                returnValue.setAttack(10);
                returnValue.setCritChance(10);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(3);
                returnValue.setValue(90);
                break;
            case 8:
                returnValue.setName("Iron sword");
                returnValue.setAttack(140);
                returnValue.setCritChance(30);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(3);
                returnValue.setValue(500);
                break;
            case 9:
                returnValue.setName("Spiky bat");
                returnValue.setAttack(60);
                returnValue.setCritChance(20);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(3);
                returnValue.setValue(200);
                break;
            case 10:
                returnValue.setName("Legendary sword of doom");
                returnValue.setAttack(250);
                returnValue.setCritChance(40);
                returnValue.setType(Types.itemType.Weapon);
                returnValue.setIsCombatItem(true);
                returnValue.setMaxCount(1);
                returnValue.setValue(2000);
                break;
            default:
                returnValue = getWeaponById(1);
                break;
        }
        return returnValue;
    }

    public static Poison getPoisonById(int poisonId){
        Poison returnValue = new Poison();
        returnValue.setMaxCount(10);
        returnValue.setIsCombatItem(true);
        returnValue.setType(Types.itemType.Poison);
        switch (poisonId){
            case 1:
                returnValue.setName("Weak Poison");
                returnValue.setValue(100);
                returnValue.setPotency(30);
                break;
            case 2:
                returnValue.setName("Normal Poison");
                returnValue.setValue(200);
                returnValue.setPotency(60);
                break;
            case 3:
                returnValue.setName("Strong Poison");
                returnValue.setValue(300);
                returnValue.setPotency(90);
                break;
            default:
                returnValue = getPoisonById(1);
                break;
        }
        return returnValue;
    }

    public static Potion getPotionById(int potionId){
        Potion returnValue = new Potion();
        returnValue.setType(Types.itemType.Potion);
        returnValue.setMaxCount(5);
        returnValue.setIsCombatItem(true);
        switch (potionId){
            case 1:
                returnValue.setName("Weak Potion");
                returnValue.setValue(100);
                returnValue.setHealing(200);
                break;
            case 2:
                returnValue.setName("Normal Potion");
                returnValue.setValue(200);
                returnValue.setHealing(400);
                break;
            case 3:
                returnValue.setName("Strong Potion");
                returnValue.setValue(300);
                returnValue.setHealing(600);
                break;
            default:
                returnValue = getPotionById(1);
                break;
        }
        return returnValue;
    }

    public static Shield getShieldById(int shieldId){
        Shield returnValue = new Shield();
        returnValue.setType(Types.itemType.Shield);
        returnValue.setMaxCount(3);
        returnValue.setIsCombatItem(false);
        switch (shieldId){
            case 1:
                returnValue.setName("Wooden Shield");
                returnValue.setValue(100);
                returnValue.setBlockChance(20);
                returnValue.setDefence(40);
                break;
            case 2:
                returnValue.setName("Iron Shield");
                returnValue.setValue(100);
                returnValue.setBlockChance(40);
                returnValue.setDefence(100);
                break;
            case 3:
                returnValue.setName("Adamantium Shield");
                returnValue.setValue(100);
                returnValue.setBlockChance(60);
                returnValue.setDefence(160);
                break;
            default:
                returnValue = getShieldById(1);
                break;
        }
        return returnValue;
    }

    public static Armor getArmorById(int armorId){
        Armor returnValue = new Armor();
        returnValue.setType(Types.itemType.Armor);
        returnValue.setMaxCount(3);
        returnValue.setIsCombatItem(false);
        switch (armorId){
            case 1:
                returnValue.setName("Leather Armor");
                returnValue.setValue(100);
                returnValue.setDefence(40);
                break;
            case 2:
                returnValue.setName("Iron Armor");
                returnValue.setValue(100);
                returnValue.setDefence(100);
                break;
            case 3:
                returnValue.setName("Adamantium Armor");
                returnValue.setValue(100);
                returnValue.setDefence(160);
                break;
            default:
                returnValue = getArmorById(1);
                break;
        }
        return returnValue;
    }

    public static Focus getFocusById(int focusId){
        Focus returnValue = new Focus();
        returnValue.setType(Types.itemType.Focus);
        returnValue.setIsCombatItem(false);
        returnValue.setValue(1);
        switch (focusId){
            case 1:
                returnValue.setName("Focus 1");
                returnValue.setIntelligence(30);
                break;
            case 2:
                returnValue.setName("Focus 2");
                returnValue.setIntelligence(90);
                break;
            case 3:
                returnValue.setName("Focus 3");
                returnValue.setIntelligence(90);
                break;
            case 4:
                returnValue.setName("Focus 4");
                returnValue.setIntelligence(120);
                break;
            default:
                returnValue = getFocusById(1);
                break;
        }
        return returnValue;
    }

    public static Item getItemById(int itemId){
        Item returnValue = new Item();
        returnValue.setIsCombatItem(false);
        returnValue.setType(Types.itemType.Scrap);
        switch (itemId){
            case 1:
                returnValue.setName("Chunk");
                returnValue.setMaxCount(20);
                returnValue.setValue(20);
                break;
            case 2:
                returnValue.setName("Useless");
                returnValue.setMaxCount(20);
                returnValue.setValue(40);
                break;
            default:
                returnValue = getItemById(1);
                break;
        }
        return returnValue;
    }
}
