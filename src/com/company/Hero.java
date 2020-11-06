package com.company;

public abstract class Hero implements HavingSuperAbility{
    int health;
    int damage;
    String typePower;
    String name;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypePower() {
        return typePower;
    }

    public void setTypePower(String typePower) {
        this.typePower = typePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Hero(int health, int damage, String typePower, String name) {
        this.health = health;
        this.damage = damage;
        this.typePower = typePower;
        this.name = name;
    }
}
