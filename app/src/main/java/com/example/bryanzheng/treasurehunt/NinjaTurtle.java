package com.example.bryanzheng.treasurehunt;

public class NinjaTurtle {
    private String name;
    private int level;
    private int health;
    private int stamina;
    private int imageResourceID;

    public static final NinjaTurtle[] NinjaTurtles = {
        new NinjaTurtle("Leonardo", 10, 100, 100, R.drawable.leonardo),
        new NinjaTurtle("Raphael", 10, 100, 100, R.drawable.raphael),
        new NinjaTurtle("Michelangelo", 10, 100, 100, R.drawable.michelangelo)
    };

    private NinjaTurtle(String name, int level,int health, int stamina,int imageResourceID){
        this.name = name;
        this.level = level;
        this.health = health;
        this.stamina = stamina;
        this.imageResourceID = imageResourceID;
    }

    public String getName(){
        return name;
    }
    public int getLevel(){
        return this.level;
    }
    public int getHealth() {
        return this.health;
    }
    public int getStamina() {
        return this.stamina;
    }
    public int getImageResourceID() {
        return imageResourceID;
    }
    public String toString() {
        return this.name;
    }
}
