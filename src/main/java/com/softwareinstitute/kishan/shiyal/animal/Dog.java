package com.softwareinstitute.kishan.shiyal.animal;

import java.util.ArrayList;
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

    public void reproduction(Animal Parent, ArrayList animals) {
        System.out.println("The parent is named " + Parent.getName());
        System.out.println("Their ages are " + Parent.getAge());
        Dog newDog = new Dog();
        inputAnimalName = myObj.next();
        newDog.setName(inputAnimalName);
        inputAnimalAge = myObj.nextInt();
        newDog.setAge(inputAnimalAge);
        animals.add(newDog);
    }
}
