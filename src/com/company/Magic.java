package com.company;

public class Magic extends Hero {


    public Magic(int health, int damage, String typePower, String name) {
        super(health, damage, typePower, name);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(getName() + " применил суперспособность" + superAbilityType);
    }
}
