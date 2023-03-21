package com.softwareinstitute.kishan.shiyal.animal.tests;

import com.softwareinstitute.kishan.shiyal.animal.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @Test
    void testing_dog_age(){
        Dog testDog = new Dog();
        testDog.setAge(10);
        assertEquals(10, testDog.getAge(), "The expected age of the Dog was not the same");
    }

    @Test
    void testing_dog_name(){
        Dog testDog = new Dog();
        testDog.setName("");
        assertEquals("", testDog.getName(), "The expected name of the Dog was empty");
    }

    @Test
    void testing_dog_sleep(){
        Dog testDog = new Dog();
        assertEquals("zzz", testDog.Sleep(), "The Dog is not sleeping, zzz is not what the output is");
    }
    @Test
    void testing_dog_sound(){
        Dog testDog = new Dog();
        assertEquals("Woof", testDog.Sound(), "The expected sound of the Dog was not matching");
    }
}
