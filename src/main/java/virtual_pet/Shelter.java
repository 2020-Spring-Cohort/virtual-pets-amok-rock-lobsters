package virtual_pet;


import java.util.HashMap;
import java.util.Map;

public class Shelter {

    private Map<String, VirtualPet> shelterRoster = new HashMap<>();

    public void dropOff(VirtualPet newAnimal) {
        this.shelterRoster.put(newAnimal.getName(), newAnimal);


    }
}
