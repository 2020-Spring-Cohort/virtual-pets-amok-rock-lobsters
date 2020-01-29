package virtual_pet;

import java.util.*;

public class Application {
    public static void main(String[] args) {
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


        System.out.println("Welcome to the Pet Shelter!\n" +
                "To begin. enter [start]\n" +
                "To exit, enter [exit]");
        String mainMenuChoice = input.nextLine();
        if (mainMenuChoice.equalsIgnoreCase("start")) {

            while (shelterRoster.allPetsAlive()) {
                System.out.println("What would you like to do?\n" +
                        "To drop off a pet, enter [drop]\n" +
                        "To adopt a pet, enter [adopt]\n" +
                        "To visit a pet in the shelter,enter [visit]");

                String response = input.nextLine();
                // change this to a while LOOP, set it to true. Check out the reference code to see examples of the true value.


                if (response.equalsIgnoreCase("drop")) {


                    System.out.println("Is your animal organic or robotic?");
                    String petType = input.nextLine();
                    response.equalsIgnoreCase(petType);

                    System.out.println("What is the name of the pet?");

                    String newAnimal = input.nextLine();
                    VirtualPet petToAdd;
                    if (petType.equalsIgnoreCase("Robotic")) {

                        petToAdd = new Robotic(newAnimal);
                    } else {
                        petToAdd = new Organic(newAnimal);
                    }

                    shelterRoster.dropOff(petToAdd);
                    for (String name : shelterRoster.getShelterRoster().keySet()) {
                        VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                        System.out.println(name + "-" + vPet.getPetType());
                    }
                    System.out.println("Thank you for the new pet!!");

                }


                if (response.equalsIgnoreCase("adopt")) {
//            String interactQuestion = "";
//            while (!interactQuestion.equalsIgnoreCase("Quit")) {
                    System.out.println("Here are our available pets");


                    for (String name : shelterRoster.getShelterRoster().keySet()) {
                        VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                        System.out.println(name + "-" + vPet.getPetType());
                    }
                    System.out.println("Which pet would you like to adopt?");

                    String response2 = input.nextLine();
                    shelterRoster.remove(response2);
                    System.out.println("Congratulations! You've just adopted " + response2 + "!");


                }
                if (response.equalsIgnoreCase("Visit")) {

                    System.out.println("Here are the pets currently in the shelter!");
                    for (String name : shelterRoster.getShelterRoster().keySet()) {
                        VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                        System.out.println(name + "-" + vPet.getPetType());
                    }
                    System.out.println("There are a lot of things to do at the shelter! What do you want to do next?\n" +
                            "1. Feed organic pet\n" +
                            "2. Charge robotic pet\n" +
                            "3. Give water\n" +
                            "4. Play\n" +
                            "5. Take to the doctor\n" +
                            "6. Clean cage\n" +
                            "7. Wash pet\n" +
                            "8. Check pets' status");
                    int interactMenuChoice = input.nextInt();
                    switch(interactMenuChoice){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            for (String name : shelterRoster.getShelterRoster().keySet()) {
                                VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                                System.out.println(name + "-" + vPet);
                            }
                    }

                }
            }
        } else {
            System.exit(0);
        }
    }
}






