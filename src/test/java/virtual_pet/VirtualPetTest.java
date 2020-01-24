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
    //get hunger level, *write code to feed pet*
    public void shouldHaveHunger() {
        VirtualPet underTest = new VirtualPet("Noodles");
        int hunger = underTest.getHunger();
        assertEquals(20, hunger);

    }


    @Test
    //write code to play with pet to lessen boredom level
    public void shouldHaveBoredom() {
        VirtualPet underTest = new VirtualPet("Noodles");
        int boredom = underTest.getBoredom();
        assertEquals(20, boredom);
    }

    @Test
    //write code to take to dr to add health points
    public void shouldHaveHealth() {
        VirtualPet underTest = new VirtualPet("Noodles");
        int health = underTest.getHealth();
        assertEquals(20, health);
    }

    @Test
    //write code to clean cage and raise filth level
    public void cageShouldBeClean() {
        VirtualPet underTest = new VirtualPet("Noodles");
        int filth = underTest.getCageCleanliness();
        assertEquals(20, filth);
    }
    public void animalShouldBeClean() {
        VirtualPet underTest = new VirtualPet("Noodles");
        int filth = underTest.getFilth();
        assertEquals(20, filth);
    }

}



