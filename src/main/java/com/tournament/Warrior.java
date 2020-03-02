package com.tournament;

public abstract class Warrior {
    protected int healt;
    protected int dmg;
    protected boolean armor;
    protected String weapon;
    protected boolean buckler;
    protected boolean block;
    protected int bucklerCap;
    protected int tired;
    protected int poison;
    protected boolean berserker;
    protected boolean veteran;
    protected double startingHp;


    public int hitPoints() {
        return healt;
    }

    public int damage() {
        return dmg;
    }

    protected void takeHit(Warrior warrior) {
        int hitStrike = warrior.damage();
        if (!block && buckler) {
            if (warrior.weapon.equals("axe") && bucklerCap > 0) {
                bucklerCap--;
                if (bucklerCap == 0) {
                    buckler = false;
                }
            }
            block = true;
            return;
        }
        block = false;
        if (warrior.poison > 0) {
            hitStrike = hitStrike + 20;
            warrior.poison--;
        }
        if (warrior.berserker) {
            hitStrike = hitStrike * 2;
        }
        if (armor) {
            hitStrike = warrior.damage() - 3;
        }
        healt = healt - hitStrike;
    }

    protected void death() {
        healt = 0;
    }

    protected void engage(Warrior warrior) {
        while (healt > 0 && warrior.hitPoints() > 0) {
            attack(warrior);
            warrior.attack(this);
            if (healt < 0) {
                death();
            }
            if (warrior.hitPoints() < 0) {
                warrior.death();
            }
        }
    }

    protected void attack(Warrior warrior) {
        if (veteran && healt < ((startingHp/30)*100)) {
            berserker = true;
        }
        if (tired >= 2) {
            tired = 0;
            return;
        } else {
            warrior.takeHit(this);
            if (weapon.equals("Great Sword")) {
                tired++;
            }
        }
    }
}
