package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] list={new Magic(300,30,"mental","Rem"),
                new Medic(350,40,"heal","Sakura"),
                new Warrior(500,50,"fireBall","Sasuke")};

        String [] power = {" zemlya"," healer"," fireBall"};


        for (int i = 0; i < list.length; i++) {
           list[i].applySuperAbility(power[i]);
        }
    }

}
