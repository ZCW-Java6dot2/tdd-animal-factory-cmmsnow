package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addDogTest() {
        // given
        Date bday = new Date(2018, 4, 5);
        Dog expected = new Dog("Spotty", bday, 8);
        Integer id = expected.getId();
        DogHouse.add(expected);

        // when
        Dog actual = DogHouse.getDogById(id);

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        /*Dog dogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(id);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);*/

        // given
        Date bday = new Date(2018, 4, 5);
        Dog dogToBeAdded = new Dog("Spotty", bday, 8);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(id);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }


    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByDogTest() {
        // given
        Date bday = new Date(2018, 4, 5);
        Dog dogToBeAdded = new Dog("Spotty", bday, 2);
        Integer id = dogToBeAdded.getId();
        DogHouse.add(dogToBeAdded);

        // when
        DogHouse.remove(dogToBeAdded);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }

    //added
    @Test
    public void getDogByIdTest() {
        // given
        Date bday = new Date(2018, 4, 5);
        Dog givenDog = new Dog("Fluffy", bday, 11);
        Integer givenId = givenDog.getId();
        DogHouse.add(givenDog);

        // when
        Dog actualDog = DogHouse.getDogById(givenId);

        // then
        Assert.assertEquals(givenDog, actualDog);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfDogsTest() {
        // given there is a dog to be added
        Dog dog = new Dog("Spotty", null, 6);

        // given that I count number of dogs before add
        int numberOfDogsBeforeAdd = DogHouse.getNumberOfDogs();

        // given that I add one dog, my expected should be numberOfDogsBeforeAdd + 1
        int expected = numberOfDogsBeforeAdd + 1;

        // given that I have added a dog
        DogHouse.add(dog);

        // when I get the number of dogs after the add
        int actual = DogHouse.getNumberOfDogs();

        // then
        Assert.assertEquals(expected, actual);
    }
}
