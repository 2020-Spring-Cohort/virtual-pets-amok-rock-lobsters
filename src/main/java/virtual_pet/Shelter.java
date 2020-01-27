package virtual_pet;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shelter {
// take in pets, feed, play etc
    public Map<String, VirtualPet> shelterRoster = new HashMap<>();

    public void dropOff(VirtualPet newAnimal) {
        this.shelterRoster.put(newAnimal.getName(), newAnimal);


    }

    public String statusCheck() {
        String status = "";
        for (VirtualPet pet:shelterRoster.values()){
            status += pet.toString() + "\n";
        }
        return status;
    }


}
