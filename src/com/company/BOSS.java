package com.company;

public class BOSS extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printlninfo() {
        return super.printlninfo() +"Тип Орудия:"+  weapon.getWeaponName() +"\nМодель:"+ weapon.getWeaponType();

    }
}

