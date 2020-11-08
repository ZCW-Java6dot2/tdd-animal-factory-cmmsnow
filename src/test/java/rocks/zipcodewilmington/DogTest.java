package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testNewDog(){
        //given
        String givenName = "Woofy";
        Date givenBday = new Date(2005, 4, 15);
        Integer givenId = 14;

        //when we construct a dog
        Dog dog = new Dog(givenName, givenBday, givenId);

        //when we retrieve dog info
        String actualName = dog.getName();
        Date actualBday = dog.getBirthDate();
        Integer actualId = dog.getId();

        //assertEquals
        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenBday, actualBday);
        Assert.assertEquals(givenId, actualId);
    }

    @Test
    public void testSpeak(){
        //construct
        String name = "Woofy";
        Date bday = new Date(2005, 4, 15);
        Integer id = 14;
        Dog dog = new Dog(name, bday, id);

        //expected
        String expectedSpeak = "bark!";

        //actual
        String actualSpeak = dog.speak();

        //assertEquals
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testSetBirthDate(){
        //when we construct
        String name = "Woofy";
        Date bday = new Date(2005, 4, 15);
        Integer id = 14;
        Dog dog = new Dog(name, bday, id);

        //given
        Date expected = bday;

        //actual
        Date actual = dog.getBirthDate();

        //assertEquals
        Assert.assertEquals(bday, actual);
    }

    @Test
    public void testEat(){
        //when we construct
        String name = "Woofy";
        Date bday = new Date(2005, 4, 15);
        Integer id = 14;
        Dog dog = new Dog(name, bday, id);
        Food food = new Food();

        //given;
        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expectedMealsEaten = initialMealsEaten + 1;

        //actual
        dog.eat(food);
        int actualMealsEaten = dog.getNumberOfMealsEaten();

        //assertEquals
        Assert.assertEquals(expectedMealsEaten, actualMealsEaten);
    }

    @Test
    public void testgetId(){
        //when we construct & given
        String name = "Woofy";
        Date bday = new Date(2005, 4, 15);
        Integer givenId = 14;
        Dog dog = new Dog(name, bday, givenId);

        //actual
        Integer actualId = dog.getId();

        //assertEquals
        Assert.assertEquals(givenId, actualId);
    }

    @Test
    public void testAnimalInheritance(){
        //when we construct/given
        String name = "Woofy";
        Date bday = new Date(2005, 4, 15);
        Integer id = 14;
        Dog dog = new Dog(name, bday, id);

        //when
        boolean answer = dog instanceof Animal;

        //then assert
        Assert.assertTrue(answer);
    }

    @Test
    public void testMammalInheritance(){
        //when we construct/given
        String name = "Woofy";
        Date bday = new Date(2005, 4, 15);
        Integer id = 14;
        Dog dog = new Dog(name, bday, id);

        //when
        boolean answer = dog instanceof Mammal;

        //then assert
        Assert.assertTrue(answer);
    }
}
