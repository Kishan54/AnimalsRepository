package com.softwareinstitute.kishan.shiyal.animal;

import java.util.ArrayList;
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


    public void reproduction(Animal Parent, ArrayList animals) {
        System.out.println("The parent is named " + Parent.getName());
        System.out.println("Their ages is " + Parent.getAge());
        Cat newCat = new Cat();
        inputAnimalName = myObj.next();
        inputAnimalAge = myObj.nextInt();
        newCat.setName(inputAnimalName);
        newCat.setAge(inputAnimalAge);
        animals.add(newCat);
    }
}
