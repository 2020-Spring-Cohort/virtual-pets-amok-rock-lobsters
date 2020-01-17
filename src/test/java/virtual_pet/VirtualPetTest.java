package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet(){
        VirtualPet underTest = new VirtualPet("Noodles");
    }

    @Test
    public void shouldBeAbleToNamePet(){
        VirtualPet underTest = new VirtualPet("Noodles");
        String expected = underTest.getName();
        assertEquals(expected, "Noodles");
    }

    @Test
    public void shouldBeAbleToFeedPet(){
        VirtualPet underTest = new VirtualPet("Noodles");
        int result = underTest.getHunger();
        assertEquals(20, result);
    }

    @Test
    public void shouldBeAbleToPlayWithPet(){
        VirtualPet underTest = new VirtualPet("Noodles");
        int result = underTest.getBoredom();
        assertEquals(20, result);
    }

    @Test
    public void shouldBeAbleToTakeToDr(){
        VirtualPet underTest = new VirtualPet("Noodles");
        int result = underTest.getHealth();
        assertEquals(20, result);
    }

    @Test
    public void shouldBeAbleToCleanCage(){
        VirtualPet underTest = new VirtualPet("Noodles");
        int result = underTest.getFilth();
        assertEquals(20, result);
    }


}
