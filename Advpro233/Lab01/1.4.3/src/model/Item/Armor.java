package model.Item;

import model.DamageType;

public class Armor extends BasedEquipment {
    private int defense, resistance;
    private int power;

    public Armor(String name, int power, int resistance, String imgpath) {
        this.name = name;
        this.imgpath = imgpath;
        this.power = power;
        this.resistance = resistance;
    }

    public String getImagepath() {
        return imgpath;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return name;
    }
}
