package com.company;

public class Player1 {
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon,int health){
        this.name = name;
        this.weapon = weapon;
        if(health <=0 || health > 100){
            this.health = 100;
        }
        else{
            this.health = health;
        }

    }

    public void damageOne(){
        this.health -= 30;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by "+ this.weapon +" - 1. Health is reduced by 30. New Health is "+this.health);
        if(this.health == 0){
            System.out.println(getName() +" is Dead");
        }
    }
    public void damageTwo(){
        this.health -= 50;
        if(this.health <= 0){
            this.health = 0;
        }
        System.out.println("Got hit by "+ this.weapon +" - 2. Health is reduced by 50. New Health is "+this.health);
        if(this.health == 0){
            System.out.println(getName() +" is Dead");
        }
    }
    public void heal(){
        if(this.health <=0 ){
            System.out.println(getName()+" is Dead. Heal is not working...");
        }
        else{
            this.health = 100;
            System.out.println(getName() +"'s New health is "+ this.health);
        }
    }
    public String getName(){
        return name;
    }
    public String getWeapon(){
        return weapon;
    }
    public int getHealth(){
        return health;
    }
    public void setName(String newname){
        this.name = newname;
    }
    public void setWeapon(String newweapon){
        this.weapon = newweapon;
    }
    public void setHealth(int newhealth){
        this.health = newhealth;
    }
}
