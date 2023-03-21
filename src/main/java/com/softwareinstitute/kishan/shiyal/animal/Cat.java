package com.softwareinstitute.kishan.shiyal.animal;

import java.util.Scanner;

public class Cat extends Mammal {

    //////////////////////Attributes//////////////////
    Scanner myObj = new Scanner(System.in);

    String inputAnimalName;
    int inputAnimalAge;

    //////////////////////Constructor/////////////////
    public Cat() {
        super();
    }

    //////////////////////Methods/////////////////////
    public String Sound() {
        return "Meow";
    }

    public Object reproduction() {
        Cat newCat = new Cat();
        newCat.setName(inputAnimalName = myObj.next());
        newCat.setAge(inputAnimalAge = myObj.nextInt());
        return newCat;
    }
}
