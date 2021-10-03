package com.company;

public class Main {

    public static void main(String[] args) {
        Player1 p1 = new Player1("Tom","sword",500);
//        System.out.println(p1.getName());
//        System.out.println(p1.getHealth());
//        System.out.println(p1.getWeapon());
//        p1.damageOne();
//        p1.damageOne();
//        p1.heal();
//        p1.damageTwo();


        Player2 p = new Player2("Jack","Machine Gun",500,true);
        p.damageOne();
        p.damageTwo();
        p.heal();
        p.damageTwo();

    }
}
