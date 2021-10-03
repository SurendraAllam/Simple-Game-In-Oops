package com.company;

public class Player2 extends Player1 {
    private boolean armour;
    private int health;
    public Player2(String name, String weapon, int health, boolean harmer){
        super(name, weapon, health);
        this.armour = harmer;
        if(health <=0 || health > 100){
            this.health = 100;
        }
        else{
            this.health = health;
        }
    }
    @Override
    public void damageOne(){
        if(armour){
            this.health -= 20;

            if(this.health<= 0){
                this.health = 0;
            }
            System.out.println("Armour is on. Got hit by "+ getWeapon() +" - 1. Health is reduced by 20. New Health is "+ this.health);
        }if(!armour){
            this.health -= 30;
            if(this.health <= 0){
                this.health = 0;
            }
            System.out.println("Armour is off. Got hit by "+ getWeapon() +" - 1. Health is reduced by 30. New Health is "+this.health);
        }
        if(this.health == 0){
            System.out.println(getName()+" is dead.");
        }
    }
    @Override
    public void damageTwo(){
        if(armour){
            this.health -= 40;
            if(this.health <= 0){
                this.health = 0;
            }
            System.out.println("Armour is on. Got hit by "+ getWeapon() +" - 2. Health is reduced by 40. Health is "+this.health);
        }if(!armour){
            this.health -= 50;
            if(this.health <= 0){
                this.health = 0;
            }
            System.out.println("Armour is off. Got hit by "+ getWeapon() +" - 2. Health is reduced by 50. Health is "+this.health);
        }
        if(this.health == 0){
            System.out.println(getName()+" is dead.");
        }
    }
    @Override
    public void heal() {
        if(this.health <=0 ){
            System.out.println(getName()+" is Dead. Heal is not working...");
        }
        else{
            this.health = 100;
            System.out.println(getName() +"'s New health is "+ this.health);
        }
    }
}
