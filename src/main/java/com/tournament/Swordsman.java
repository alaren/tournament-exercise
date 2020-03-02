package com.tournament;

public class Swordsman extends Warrior {

    public Swordsman equip(String equipment) {
        if (equipment.equals("sword")) {
            dmg = 5;
            weapon = equipment;
        }
        if (equipment.equals("axe")) {
            dmg = 6;
            weapon = equipment;
        }
        if (equipment.equals("armor")) {
            armor = true;
        }
        if (equipment.equals("buckler")) {
            buckler = true;
            bucklerCap = 3;
        }
        if (armor) {
            dmg = dmg -1;
        }
        return this;
    }

    public Swordsman() {
        healt = 100;
        equip("sword");
    }

    public Swordsman(String vicious) {
        if (vicious.equals("Vicious")) {
            poison = 2;
        }
        healt = 100;
        equip("sword");
    }
}
