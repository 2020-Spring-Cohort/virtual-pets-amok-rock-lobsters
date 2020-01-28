package virtual_pet;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Virtual Pets!\n");
        Scanner input = new Scanner(System.in);

        Shelter shelterRoster = new Shelter();
        Robotic pet1 = new Robotic("KittyMeowMeow");
        shelterRoster.dropOff(pet1);
        Robotic pet2 = new Robotic("Gizmo");
        shelterRoster.dropOff(pet2);
        Organic pet3 = new Organic("SlobberDog");
        shelterRoster.dropOff(pet3);
        Organic pet4 = new Organic("Fido");
        shelterRoster.dropOff(pet4);


        System.out.println("Would you like to: \nDrop off an Animal, type drop, \nAdopt a Pet, type adopt, \nVisit pet ,type visit?");
        String response = input.nextLine();
        // change this to a while LOOP, set it to true. Check out the reference code to see examples of the true value.
        if (response.equalsIgnoreCase("drop")) {


            System.out.println("Is your animal Organic or Robotic");
            String newStateOfBeing = input.nextLine();
            input.nextLine();

            System.out.println("What is the Name of the Animal?");

            String newAnimal = input.nextLine();
            VirtualPet petToAdd;
            if (newStateOfBeing.equalsIgnoreCase("Robotic")) {

                petToAdd = new Robotic(newAnimal);
            } else {
                petToAdd = new Organic(newAnimal);
            }

            shelterRoster.dropOff(petToAdd);
            for (String name : shelterRoster.getShelterRoster().keySet()) {
                VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                System.out.println(name + "-" + vPet.getPetType());
            }

        }


        if (response.equalsIgnoreCase("adopt")) {
            String interactQuestion = "";
            while (!interactQuestion.equalsIgnoreCase("Quit")) {
                System.out.println("Here are our avaliable pets");


                for (String name : shelterRoster.getShelterRoster().keySet()) {
                    VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                    System.out.println(name + "-" + vPet.getPetType());
                }
                System.out.println("Which pet would you like to Adopt?");

                 interactQuestion = input.nextLine();
                shelterRoster.remove(interactQuestion);


            }
            if (response.equalsIgnoreCase("Visit")) {

                System.out.println("Here are our pets you can visit" );
                System.out.println(shelterRoster);
                System.out.println("\n what would like to do on your visit?");
                System.out.println("\n Feed \n Play \n Charge \n Water");


            }
        }
    }
}




