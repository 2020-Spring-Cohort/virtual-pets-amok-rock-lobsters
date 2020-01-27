package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoboticTest {

    @Test
    //get hunger level, *write code to feed pet*
    public void shouldHaveCharge() {
        Robotic underTest = new Robotic("Noodles");
        int charge = underTest.getCharge();
        assertEquals(20, charge);
    }

}