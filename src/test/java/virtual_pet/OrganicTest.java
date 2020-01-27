package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganicTest {

    @Test
    //get hunger level, *write code to feed pet*
    public void shouldHaveHunger() {
        Organic underTest = new Organic("Noodles");
        int hunger = underTest.getHunger();
        assertEquals(20, hunger);
    }

    @Test
    //write code to take to dr to add health points
    public void shouldHaveHealth() {
        Organic underTest = new Organic("Noodles");
        int health = underTest.getHealth();
        assertEquals(20, health);
    }

    @Test
    //write code to take to dr to add health points
    public void shouldHaveThirst() {
        Organic underTest = new Organic("Noodles");
        int thirst = underTest.getThirst();
        assertEquals(20, thirst);
    }

}