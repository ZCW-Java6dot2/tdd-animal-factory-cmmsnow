package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        // given (there is a dog name)
        String expectedName = "Milo";

        // given (there is a dog birthdate)
        Date expectedBirthDate = new Date();

        // when a dog is created with those fields
        Dog dog = AnimalFactory.createDog(expectedName, expectedBirthDate);

        // when we get the name of the dog
        String actualName = dog.getName();

        // when we get birthdate of the dog
        Date actualBirthDate = dog.getBirthDate();

        // then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        //give name and bday
        String givenName = "Dexter";
        Date givenDate = new Date(2015, 1, 18);

        //create cat
        Cat cat = AnimalFactory.createCat(givenName, givenDate);

        //get name and bday
        String actualName = cat.getName();
        Date actualBday = cat.getBirthDate();

        //assert equal
        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenDate, actualBday);
    }
}
