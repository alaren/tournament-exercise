package com.tournament;

public class Viking extends Warrior {
    public Viking equip(String equipment) {
        if (equipment.equals("sword")) {
            dmg = 5;
            weapon = equipment;
        }
        if (equipment.equals("axe")) {
            dmg = 6;
            weapon = equipment;
        }
        if (equipment.equals("buckler")) {
            buckler = true;
            bucklerCap = 3;
        }
        return this;
    }

    public Viking() {
        healt = 120;
        equip("axe");
    }
}
