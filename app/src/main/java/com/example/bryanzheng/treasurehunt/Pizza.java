package com.example.bryanzheng.treasurehunt;

public class Pizza {

    private String name;
    private int level;
    private int health;
    private int stamina;
    private int imageResourceID;

    public static final Pizza[] PIZZAS = {
            new Pizza("Nothing", 0, 0, 0, R.drawable.ic_launcher_background),
            new Pizza("Pizza", 10, 100, 100, R.drawable.michelangelo)
    };

    private Pizza(String name, int level,int health, int stamina,int imageResourceID){
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

