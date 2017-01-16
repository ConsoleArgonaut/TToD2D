package source;


/**
 * Created by Drake on 16.12.2016.
 */
public class SkillController {
    public Skill getSkill(int unlockedAt){
        Skill skillToDefine = new Skill();

        switch (unlockedAt){
            case 1:
                switch (Player.getRace(Types.playerRace)) {
                    case Unknown:

                        break;
                    case Human:
                        skillToDefine.setName("Ice Needle");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                    case Human:
                        skillToDefine.setName("Ice Needle");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Fireball");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                    case :
                        skillToDefine.setName("Second Wind");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Water's Embrace");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                    case :
                        skillToDefine.setName("iron Hammer");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Rockbullet");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);

                        break;
                }
                skillToDefine.setName("Attack");
                skillToDefine.setManaCost(0);
                skillToDefine.setPotency(1);
                skillToDefine.setUnlockedAt(1);
                break;
            case 2:
                skillToDefine.setName("Throw Scrap");
                skillToDefine.setManaCost(10);
                skillToDefine.setPotency(1.5);
                skillToDefine.setUnlockedAt(2);
                break;
            case 4:
                skillToDefine.setName("Double Strike");
                skillToDefine.setManaCost(20);
                skillToDefine.setPotency(2.5);
                skillToDefine.setUnlockedAt(4);
                break;
            case 6:
                skillToDefine.setName("cure");
                skillToDefine.setManaCost(50);
                skillToDefine.setPotency(3);
                skillToDefine.setUnlockedAt(6);
                break;
            case 8:
                switch (Player.getRace()) {
                    case Human:
                        skillToDefine.setName("Ice Blast");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency(3.5);
                        skillToDefine.setUnlockedAt(8);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Fire Breath");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency(3.5);
                        skillToDefine.setUnlockedAt(8);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Water Bullet");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency(3.5);
                        skillToDefine.setUnlockedAt(8);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Quake");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency(3.5);
                        skillToDefine.setUnlockedAt(8);
                        break;
                }
            case 10:
                skillToDefine.setName("Life Conversion");
                skillToDefine.setManaCost(0);
                skillToDefine.setPotency(4);
                skillToDefine.setUnlockedAt(10);
                break;
            case 12:
                skillToDefine.setName("Obscene Gesture");
                skillToDefine.setManaCost(50);
                skillToDefine.setPotency(4.5);
                skillToDefine.setUnlockedAt(12);
                break;
            case 14:
                skillToDefine.setName("Focus");
                skillToDefine.setManaCost(100);
                skillToDefine.setPotency(5);
                skillToDefine.setUnlockedAt(14);
                break;
            case 16:
                switch (Player.getRace()) {
                    case Human:
                        skillToDefine.setName("Nature's Wrath");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Wingbeat");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Iron Breacker");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Rockbullet");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        break;
                }
            case 18:
                skillToDefine.setName("Relentless Endurance");
                skillToDefine.setManaCost(1);
                skillToDefine.setPotency(7);
                skillToDefine.setUnlockedAt(18);
                break;
            case 20:
                skillToDefine.setName("Reaper");
                skillToDefine.setManaCost(120);
                skillToDefine.setPotency(7.5);
                skillToDefine.setUnlockedAt(20);
                break;
            case 22:
                skillToDefine.setName("Genesis");
                skillToDefine.setManaCost(10);
                skillToDefine.setPotency(8);
                skillToDefine.setUnlockedAt(2);
                break;
            case 24:
                skillToDefine.setName("Overdrive");
                skillToDefine.setManaCost(10);
                skillToDefine.setPotency(8.5);
                skillToDefine.setUnlockedAt(2);
                break;
            default:
                skillToDefine.setName("Attack");
                skillToDefine.setManaCost(0);
                skillToDefine.setPotency(1);
                skillToDefine.setUnlockedAt(1);
                break;
        }
        return skillToDefine;
    }
}
