package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet underTest = new VirtualPet("Noodles");
    }

    @Test
    public void shouldBeAbleToNamePet() {
        VirtualPet underTest = new VirtualPet("Noodles");
        String expected = underTest.getName();
        assertEquals(expected, "Noodles");
    }


    @Test
    //write code to play with pet to lessen boredom level
    public void shouldHaveBoredom() {
        VirtualPet underTest = new VirtualPet("Noodles");
        int boredom = underTest.getBoredom();
        assertEquals(20, boredom);
    }


    @Test
    //write code to clean cage and raise filth level
    public void cageShouldBeClean() {
        VirtualPet underTest = new VirtualPet("Noodles");
        int cageCleanliness = underTest.getCageCleanliness();
        assertEquals(20, cageCleanliness);
    }

    @Test
    public void petCleanliness() {
        VirtualPet underTest = new VirtualPet("Noodles");
        int filth = underTest.getFilth();
        assertEquals(20, filth);
    }

    @Test
    public void isAlive(){
        VirtualPet underTest = new VirtualPet("Noodles");
        int lifePoints = underTest.lifePoints();
        assertEquals(20, lifePoints);

    }
    @Test
    public void shouldHaveType(){
        VirtualPet underTest = new VirtualPet("Noodles");
        String expected = underTest.getPetType();
        assertEquals(expected, "Organic");
    }

}



