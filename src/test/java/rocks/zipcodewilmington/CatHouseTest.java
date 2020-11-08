package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        // given
        Date bday = new Date(2018, 4, 5);
        Cat expected = new Cat("Fluffy", bday, 8);
        Integer id = expected.getId();
        CatHouse.add(expected);

        // when
        Cat actual = CatHouse.getCatById(id);

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {

        Cat catToBeAdded = new Cat(null, null, 0);
        CatHouse.add(catToBeAdded);
        Integer id = catToBeAdded.getId();

        // when
        CatHouse.remove(id);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
        // given
        /*Date bday = new Date(2018, 4, 5);
        Cat catToBeAdded = new Cat("Fluffy", bday, 8);
        CatHouse.add(catToBeAdded);
        Integer id = catToBeAdded.getId();

        // when
        CatHouse.remove(id);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);*/
    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByCatTest() {
        // given
        //Date bday = new Date(2018, 4, 5);
        Cat catToBeAdded = new Cat("Fluffy", null, 2);
        Integer id = catToBeAdded.getId();
        CatHouse.add(catToBeAdded);

        // when
        CatHouse.remove(catToBeAdded);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
    }

    //added
    @Test
    public void getCatByIdTest() {
        // given
        //Date bday = new Date(2018, 4, 5);
        Cat givenCat = new Cat("Fluffy", null, 11);
        Integer givenId = givenCat.getId();
        CatHouse.add(givenCat);

        // when
        Cat actualCat = CatHouse.getCatById(givenId);

        // then
        Assert.assertEquals(givenCat, actualCat);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        // given there is a cat to be added
        Cat cat = new Cat();

        // given that I count number of cats before add
        int numberOfCatsBeforeAdd = CatHouse.getNumberOfCats();

        // given that I add one cat, my expected should be numberOfCatsBeforeAdd + 1
        int expected = numberOfCatsBeforeAdd + 1;

        // given that I have added a cat
        CatHouse.add(cat);

        // when I get the number of cats after the add
        int actual = CatHouse.getNumberOfCats();

        // then
        Assert.assertEquals(expected, actual);
    }
}
