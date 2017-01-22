package source;

import java.util.ArrayList;

/**
 * Created by Drake on 16.12.2016.
 */
public class SkillController {
    private ArrayList<Skill> skills;
    
    public SkillController(){
        skills = new ArrayList<>();
    }

    public void getSkill(int level){
        Skill skillToDefine = new Skill();
        Skill skillToDefine2 = new Skill();
        Skill skillToDefine3 = new Skill();
        Skill skillToDefine4 = new Skill();
        switch (level){
            case 1:
                switch (Player.getInstance().getRace()) {
                    case Unknown:
                        skillToDefine.setName("Overdrive");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency(10);
                        skillToDefine.setUnlockedAt(2);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Human:
                        skillToDefine.setName("Ice Needle");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        Player.getInstance().getSkills().add(skillToDefine);

                        skillToDefine2.setName("Nature's Embrace");
                        skillToDefine2.setManaCost(20);
                        skillToDefine2.setPotency(1);
                        skillToDefine2.setUnlockedAt(1);
                        Player.getInstance().getSkills().add(skillToDefine2);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Fireball");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        Player.getInstance().getSkills().add(skillToDefine);

                        skillToDefine2.setName("Second Wind");
                        skillToDefine2.setManaCost(20);
                        skillToDefine2.setPotency(1);
                        skillToDefine2.setUnlockedAt(1);
                        Player.getInstance().getSkills().add(skillToDefine2);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Water's Embrace");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        Player.getInstance().getSkills().add(skillToDefine);

                        skillToDefine2.setName("Iron Hammer");
                        skillToDefine2.setManaCost(20);
                        skillToDefine2.setPotency(1);
                        skillToDefine2.setUnlockedAt(1);
                        Player.getInstance().getSkills().add(skillToDefine2);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Rockbullet");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        Player.getInstance().getSkills().add(skillToDefine);

                        skillToDefine2.setName("Dark Endurance");
                        skillToDefine2.setManaCost(20);
                        skillToDefine2.setPotency(1);
                        skillToDefine2.setUnlockedAt(1);
                        Player.getInstance().getSkills().add(skillToDefine2);
                        break;
                }
                skillToDefine3.setName("Attack");
                skillToDefine3.setManaCost(0);
                skillToDefine3.setPotency(1);
                skillToDefine3.setUnlockedAt(1);
                Player.getInstance().getSkills().add(skillToDefine);

                skillToDefine4.setName("Defence");
                skillToDefine4.setManaCost(0);
                skillToDefine4.setPotency(1);
                skillToDefine4.setUnlockedAt(1);
                Player.getInstance().getSkills().add(skillToDefine4);
                break;
            case 2:
                skillToDefine.setName("Throw Scrap");
                skillToDefine.setManaCost(10);
                skillToDefine.setPotency((float) 1.5);
                skillToDefine.setUnlockedAt(2);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
            case 4:
                skillToDefine.setName("Double Strike");
                skillToDefine.setManaCost(20);
                skillToDefine.setPotency((float) 2.5);
                skillToDefine.setUnlockedAt(4);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
            case 6:
                skillToDefine.setName("Cure");
                skillToDefine.setManaCost(50);
                skillToDefine.setPotency(3);
                skillToDefine.setUnlockedAt(6);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
            case 8:
                switch (Player.getInstance().getRace()) {
                    case Human:
                        skillToDefine.setName("Ice Blast");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency((float) 3.5);
                        skillToDefine.setUnlockedAt(8);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Fire Breath");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency((float) 3.5);
                        skillToDefine.setUnlockedAt(8);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Water Bullet");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency((float) 3.5);
                        skillToDefine.setUnlockedAt(8);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Quake");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency((float) 3.5);
                        skillToDefine.setUnlockedAt(8);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                }
            case 10:
                skillToDefine.setName("Life Conversion");
                skillToDefine.setManaCost(0);
                skillToDefine.setPotency(4);
                skillToDefine.setUnlockedAt(10);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
            case 12:
                skillToDefine.setName("Obscene Gesture");
                skillToDefine.setManaCost(50);
                skillToDefine.setPotency((float) 4.5);
                skillToDefine.setUnlockedAt(12);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
            case 14:
                skillToDefine.setName("Focus");
                skillToDefine.setManaCost(100);
                skillToDefine.setPotency(5);
                skillToDefine.setUnlockedAt(14);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
            case 16:
                switch (Player.getInstance().getRace()) {
                    case Human:
                        skillToDefine.setName("Nature's Wrath");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency((float) 6.5);
                        skillToDefine.setUnlockedAt(16);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Wingbeat");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency((float) 6.5);
                        skillToDefine.setUnlockedAt(16);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Iron Breacker");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency((float) 6.5);
                        skillToDefine.setUnlockedAt(16);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Shadow Orb");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency((float) 6.5);
                        skillToDefine.setUnlockedAt(16);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                }
            case 18:
                skillToDefine.setName("Relentless Endurance");
                skillToDefine.setManaCost(1);
                skillToDefine.setPotency(7);
                skillToDefine.setUnlockedAt(18);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
            case 20:
                skillToDefine.setName("Reaper");
                skillToDefine.setManaCost(120);
                skillToDefine.setPotency((float) 7.5);
                skillToDefine.setUnlockedAt(20);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
            case 22:
                skillToDefine.setName("Genesis");
                skillToDefine.setManaCost(10);
                skillToDefine.setPotency(8);
                skillToDefine.setUnlockedAt(2);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
            case 24:
                switch (Player.getInstance().getRace()) {
                    case Human:
                        skillToDefine.setName("Permafrost");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency((float) 8.5);
                        skillToDefine.setUnlockedAt(24);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Firestorm");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency((float) 8.5);
                        skillToDefine.setUnlockedAt(24);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Hydraulic Impact");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency((float) 8.5);
                        skillToDefine.setUnlockedAt(24);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Netherworld");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency((float) 8.5);
                        skillToDefine.setUnlockedAt(24);
                        Player.getInstance().getSkills().add(skillToDefine);
                        break;
                }
                skillToDefine2.setName("Overdrive");
                skillToDefine2.setManaCost(100);
                skillToDefine2.setPotency((float) 8.5);
                skillToDefine2.setUnlockedAt(24);
                Player.getInstance().getSkills().add(skillToDefine2);
                break;
            default:
                skillToDefine.setName("Attack");
                skillToDefine.setManaCost(0);
                skillToDefine.setPotency(1);
                skillToDefine.setUnlockedAt(1);
                Player.getInstance().getSkills().add(skillToDefine);
                break;
        }
    }
}
