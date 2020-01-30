package virtual_pet;


import java.util.HashMap;
import java.util.Map;

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

    public void tickAllPets() {
        for (VirtualPet pet : shelterRoster.values()) {
            pet.tick();
        }
    }

    public Map<String, VirtualPet> getShelterRoster() {
        return shelterRoster;
    }


//    public Object get(String name) {
//        return null;
//    }

    public boolean allPetsAlive() {
        return true;
    }

    public void playWithAllPets() {
        for (VirtualPet pet : shelterRoster.values()) {
            pet.play();
        }
    }

    public void feedAllPets() {
        for (VirtualPet pet : shelterRoster.values()) {
            if (pet instanceof Organic)
                ((Organic) pet).feedAllPets();
        }
    }

    public void feedPet(String petToFeed) {
        shelterRoster.get(petToFeed);
    }


    public void cleanAllCages() {
        for (VirtualPet pet : shelterRoster.values()) {
            pet.clean();
        }
    }

    public void washAllPets() {
        for (VirtualPet pet : shelterRoster.values()) {
            pet.wash();
        }
    }

    public void chargeAllPets() {
        for (VirtualPet pet : shelterRoster.values()) {
            if (pet instanceof Robotic)
                ((Robotic) pet).chargePet();
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : shelterRoster.values()) {
            if (pet instanceof Organic)
                ((Organic) pet).waterPet();
        }
    }

    public void takePetsToDoctor() {
        for (VirtualPet pet : shelterRoster.values()) {
            if (pet instanceof Organic)
                ((Organic) pet).takeToDoctor();
        }
    }
}