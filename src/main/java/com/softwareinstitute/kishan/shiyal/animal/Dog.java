package com.softwareinstitute.kishan.shiyal.animal;

import java.util.Scanner;

public class Dog extends Mammal {

    //////////////////////Attributes//////////////////
    Scanner myObj = new Scanner(System.in);

    String inputAnimalName;
    int inputAnimalAge;

    //////////////////////Constructor/////////////////
    public Dog() {
        super();
    }

    //////////////////////Methods/////////////////////
    public String Sound() {
        return "Woof";
    }

    public Object reproduction() {
        Dog newDog = new Dog();
        return newDog;
    }
}
