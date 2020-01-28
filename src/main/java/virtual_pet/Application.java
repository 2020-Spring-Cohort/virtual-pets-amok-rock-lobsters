package virtual_pet;

import java.util.*;

public class Application{
    public static void main(String[] args) {
        System.out.println("Welcome to Virtual Pets! Enter Start to begin.");
        Scanner input = new Scanner(System.in);
        String start = input.next();

        Shelter shelterRoster = new Shelter();
        Robotic pet1 = new Robotic("KittyMeowMeow");
        shelterRoster.dropOff(pet1);
        Robotic pet2 = new Robotic("Gizmo");
        shelterRoster.dropOff(pet2);
        Organic pet3 = new Organic("SlobberDog");
        shelterRoster.dropOff(pet3);
        Organic pet4 = new Organic("Fido");
        shelterRoster.dropOff(pet4);


        System.out.println("Would you like to drop off an Animal?");
        String response = input.next();
        // change this to a while LOOP, set it to true. Check out the reference code to see examples of the true value.
        if (response.equalsIgnoreCase("yes")) {

            System.out.println("Is your animal Organic or Robotic");
            String newStateOfBeing = input.nextLine();
            input.nextLine();

            System.out.println("What is the Name of the Animal?");

            String newAnimal = input.nextLine();
            VirtualPet petToAdd;
            if (newStateOfBeing.equals("Robotic")) {

                petToAdd = new Robotic(newAnimal);
            } else {
                petToAdd = new Organic(newAnimal);
            }

            shelterRoster.dropOff(petToAdd);
            for (String name : shelterRoster.getShelterRoster().keySet()){
                VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                System.out.println(name + "-" + vPet.getPetType());
            }

        } else if (response.equalsIgnoreCase("No")) {
            System.out.println("Would you like to adopt a pet?");
            for (String name : shelterRoster.getShelterRoster().keySet()){
                VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                System.out.println(name + "-" + vPet.getPetType());
                System.out.println("Do you want to at least feed or play with the above animal?They are very lonely and hungry");
                String interactQuestion = input.nextLine();

            }




        }


    }
}




