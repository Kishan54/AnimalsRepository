package com.softwareinstitute.kishan.shiyal.animal;

import java.util.ArrayList;

public abstract class Animal {

    //////////////////////Attributes//////////////////
    private String name;
    private int age;

    //////////////////////Constructor/////////////////
    public Animal() {
        super();
    }

    //////////////////////Methods/////////////////////

    //breathe, excrete, eat, die
    public abstract String Sound();

    public abstract void reproduction(Animal a, ArrayList animals);

    public String Sleep() {
        return "zzz";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
