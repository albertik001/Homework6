package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----DIABLO----");
        BOSS boss = new BOSS();
        boss.setHealth(1000);
        boss.setDamage(150);
        boss.weapon.setWeaponName("Винтовка");
        boss.weapon.setWeaponType("Bushmaster BA50");
        System.out.println(boss.printlninfo());
        System.out.println("---------------------------");
        System.out.println("----SKELET----");
        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(150);
        skeleton.setDamage(15);
        skeleton.setKolstrel(10);
        skeleton.weapon.setWeaponType("DIAMOND MEDALIST 38");
        skeleton.weapon.setWeaponName("Блочный лук");
        System.out.println(skeleton.printlninfo());
        System.out.println("---------------------------");
        System.out.println("----SKELET2.0----");
        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(300);
        skeleton2.setDamage(30);
        skeleton2.setKolstrel(7);
        skeleton2.weapon.setWeaponType("Sebastien Flute Optimo");
        skeleton2.weapon.setWeaponName("Древний лук");
        System.out.println(skeleton2.printlninfo());

    }


}
