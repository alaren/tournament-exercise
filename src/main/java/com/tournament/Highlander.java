package com.tournament;

public class Highlander extends Warrior {

    public Highlander equip(String equipment) {
        if (equipment.equals("Great Sword")) {
            dmg = 12;
            weapon = equipment;
        }
        if (equipment.equals("buckler")) {
            buckler = true;
            bucklerCap = 3;
        }
        return this;
    }

    public Highlander() {
        healt = 150;
        equip("Great Sword");
    }

    public Highlander(String vet) {
        if (vet.equals("Veteran")) {
            veteran = true;
        }
        healt = 150;
        startingHp = 150;
        equip("Great Sword");
    }
}
