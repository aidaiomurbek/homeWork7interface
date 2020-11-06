package com.company;

public class Warrior extends Hero{


    public Warrior(int health, int damage, String typePower, String name) {
        super(health, damage, typePower, name);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(getName() + " применил суперспособность" + superAbilityType);
    }
}
