package com.softwareinstitute.kishan.shiyal.animal.tests;

import com.softwareinstitute.kishan.shiyal.animal.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    void testing_cat_age(){
        Cat testCat = new Cat();
        testCat.setAge(17);
        assertEquals(17, testCat.getAge(), "The expected age of the cat was not the same");
    }

    @Test
    void testing_cat_name(){
        Cat testCat = new Cat();
        testCat.setName("");
        assertEquals("", testCat.getName(), "The expected name of the cat was empty");
    }

    @Test
    void testing_cat_sleep(){
        Cat testCat = new Cat();
        assertEquals("zzz", testCat.Sleep(), "The cat is not sleeping, zzz is not what the output is");
    }
    @Test
    void testing_cat_sound(){
        Cat testCat = new Cat();
        assertEquals("Meow", testCat.Sound(), "The expected sound of the cat was not matching");
    }
}
