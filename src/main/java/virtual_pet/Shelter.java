package virtual_pet;

import java.util.HashMap;

public class Shelter {
    //write code to clean cage and raise filth level
    public void shouldBeClean() {
        VirtualPet underTest = new VirtualPet("Noodles");
        int result = underTest.getFilth();
    }


    //print out levels of filth, hunger, boredom
    private int cageClean = 20;
    private HashMap<String, VirtualPet> pets = new HashMap<>();

    public void addPet(VirtualPet pet) {
        pets.put(pet.getName(), pet);
    }

    public int getCageClean() {
        return cageClean;
    }
}
