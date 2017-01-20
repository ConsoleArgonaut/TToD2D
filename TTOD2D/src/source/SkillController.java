package source;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;

/**
 * Created by Drake on 16.12.2016.
 */
public class SkillController {
    private ArrayList<Skill> skills;
    //private ArrayList<? extends Player> skills;
    
    public SkillController(){
        skills = new ArrayList<>();
    }

    public Skill getSkill(int level){
        Skill skillToDefine = new Skill();
        switch (level){
            case 1:
                switch (Player.getInstance().getRace()) {
                    case Unknown:

                        break;
                    case Human:
                        skillToDefine.setName("Ice Needle");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        skills.add(skillToDefine);

                        skillToDefine.setName("Ice Needle");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        skills.add(skillToDefine);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Fireball");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        skills.add(skillToDefine);

                        skillToDefine.setName("Second Wind");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        skills.add(skillToDefine);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Water's Embrace");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        skills.add(skillToDefine);

                        skillToDefine.setName("Iron Hammer");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        skills.add(skillToDefine);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Rockbullet");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        skills.add(skillToDefine);

                        skillToDefine.setName("Shadoworb");
                        skillToDefine.setManaCost(20);
                        skillToDefine.setPotency(1);
                        skillToDefine.setUnlockedAt(1);
                        skills.add(skillToDefine);
                        break;
                }
                skillToDefine.setName("Attack");
                skillToDefine.setManaCost(0);
                skillToDefine.setPotency(1);
                skillToDefine.setUnlockedAt(1);
                skills.add(skillToDefine);

                skillToDefine.setName("Defense");
                skillToDefine.setManaCost(0);
                skillToDefine.setPotency(1);
                skillToDefine.setUnlockedAt(1);
                skills.add(skillToDefine);
                break;
            case 2:
                skillToDefine.setName("Throw Scrap");
                skillToDefine.setManaCost(10);
                skillToDefine.setPotency(1.5);
                skillToDefine.setUnlockedAt(2);
                skills.add(skillToDefine);
                break;
            case 4:
                skillToDefine.setName("Double Strike");
                skillToDefine.setManaCost(20);
                skillToDefine.setPotency(2.5);
                skillToDefine.setUnlockedAt(4);
                skills.add(skillToDefine);
                break;
            case 6:
                skillToDefine.setName("cure");
                skillToDefine.setManaCost(50);
                skillToDefine.setPotency(3);
                skillToDefine.setUnlockedAt(6);
                skills.add(skillToDefine);
                break;
            case 8:
                switch (Player.getInstance().getRace()) {
                    case Human:
                        skillToDefine.setName("Ice Blast");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency(3.5);
                        skillToDefine.setUnlockedAt(8);
                        skills.add(skillToDefine);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Fire Breath");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency(3.5);
                        skillToDefine.setUnlockedAt(8);
                        skills.add(skillToDefine);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Water Bullet");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency(3.5);
                        skillToDefine.setUnlockedAt(8);
                        skills.add(skillToDefine);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Quake");
                        skillToDefine.setManaCost(100);
                        skillToDefine.setPotency(3.5);
                        skillToDefine.setUnlockedAt(8);
                        skills.add(skillToDefine);
                        break;
                }
            case 10:
                skillToDefine.setName("Life Conversion");
                skillToDefine.setManaCost(0);
                skillToDefine.setPotency(4);
                skillToDefine.setUnlockedAt(10);
                skills.add(skillToDefine);
                break;
            case 12:
                skillToDefine.setName("Obscene Gesture");
                skillToDefine.setManaCost(50);
                skillToDefine.setPotency(4.5);
                skillToDefine.setUnlockedAt(12);
                skills.add(skillToDefine);
                break;
            case 14:
                skillToDefine.setName("Focus");
                skillToDefine.setManaCost(100);
                skillToDefine.setPotency(5);
                skillToDefine.setUnlockedAt(14);
                skills.add(skillToDefine);
                break;
            case 16:
                switch (Player.getInstance().getRace()) {
                    case Human:
                        skillToDefine.setName("Nature's Wrath");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        skills.add(skillToDefine);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Wingbeat");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        skills.add(skillToDefine);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Iron Breacker");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        skills.add(skillToDefine);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Rockbullet");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        skills.add(skillToDefine);
                        break;
                }
            case 18:
                skillToDefine.setName("Relentless Endurance");
                skillToDefine.setManaCost(1);
                skillToDefine.setPotency(7);
                skillToDefine.setUnlockedAt(18);
                skills.add(skillToDefine);
                break;
            case 20:
                skillToDefine.setName("Reaper");
                skillToDefine.setManaCost(120);
                skillToDefine.setPotency(7.5);
                skillToDefine.setUnlockedAt(20);
                skills.add(skillToDefine);
                break;
            case 22:
                skillToDefine.setName("Genesis");
                skillToDefine.setManaCost(10);
                skillToDefine.setPotency(8);
                skillToDefine.setUnlockedAt(2);
                skills.add(skillToDefine);
                break;
            case 24:
                skillToDefine.setName("Overdrive");
                skillToDefine.setManaCost(10);
                skillToDefine.setPotency(8.5);
                skillToDefine.setUnlockedAt(2);
                skills.add(skillToDefine);

                switch (Player.getInstance().getRace()) {
                    case Human:
                        skillToDefine.setName("Permafrost");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        skills.add(skillToDefine);
                        break;
                    case Dragonpeeps:
                        skillToDefine.setName("Fireburst");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        skills.add(skillToDefine);
                        break;
                    case Big_Daddys:
                        skillToDefine.setName("Hydraulic Impact");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        skills.add(skillToDefine);
                        break;
                    case Dwarf:
                        skillToDefine.setName("Netherworld");
                        skillToDefine.setManaCost(250);
                        skillToDefine.setPotency(6.5);
                        skillToDefine.setUnlockedAt(16);
                        skills.add(skillToDefine);
                        break;
                }
                break;
            default:
                skillToDefine.setName("Attack");
                skillToDefine.setManaCost(0);
                skillToDefine.setPotency(1);
                skillToDefine.setUnlockedAt(1);
                skills.add(skillToDefine);
                break;
        }
        return skillToDefine;
    }

    private SkillController initializeSkills() {throw new NotImplementedException();}
}
