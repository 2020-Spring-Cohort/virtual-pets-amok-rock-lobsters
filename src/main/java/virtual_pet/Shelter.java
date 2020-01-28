package virtual_pet;


import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shelter {
    // take in pets, feed, play etc
    public HashMap<String, VirtualPet> shelterRoster = new HashMap<>();

    public void dropOff(VirtualPet newAnimal) {
        this.shelterRoster.put(newAnimal.getName(), newAnimal);


    }
    public void remove(String petName) {
        this.shelterRoster.remove(petName);



    }

    public String statusCheck() {
        String status = "";
        for (VirtualPet pet : shelterRoster.values()) {
            status += pet.toString() + "\n";
        }
        return status;
    }

    public Map<String, VirtualPet> getShelterRoster() {
        return shelterRoster;
    }


    public Object get(String name) {
        return null;
    }
}
