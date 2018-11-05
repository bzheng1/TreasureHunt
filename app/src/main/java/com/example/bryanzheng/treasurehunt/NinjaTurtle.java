package com.example.bryanzheng.treasurehunt;

public class NinjaTurtle {
    private String name;
    private int level;
    private int health;
    private int stamina;
    private int imageResourceID;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public static final NinjaTurtle[] NinjaTurtles = {
        new NinjaTurtle("Leonardo", 10, 100, 100, R.drawable.leonardo, Pizza.PIZZAS[0], Pizza.PIZZAS[0],Pizza.PIZZAS[0]),
        new NinjaTurtle("Raphael", 10, 100, 100, R.drawable.raphael, Pizza.PIZZAS[0], Pizza.PIZZAS[0],Pizza.PIZZAS[0]),
        new NinjaTurtle("Michelangelo", 10, 100, 100, R.drawable.michelangelo, Pizza.PIZZAS[0], Pizza.PIZZAS[0],Pizza.PIZZAS[0])
    };

    private NinjaTurtle(String name, int level,int health, int stamina,int imageResourceID, Pizza pizza1, Pizza pizza2, Pizza pizza3){
        this.name = name;
        this.level = level;
        this.health = health;
        this.stamina = stamina;
        this.imageResourceID = imageResourceID;
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
        this.pizza3 = pizza3;
    }

    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public int getHealth() {
        return health;
    }
    public int getStamina() {
        return stamina;
    }
    public int getImageResourceID() {
        return imageResourceID;
    }
    public String toString() {
        return this.name;
    }
}
