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
                System.out.println("\nWhat would you like to do?\n" +
                        "To drop off a pet, enter [drop]\n" +
                        "To adopt a pet, enter [adopt]\n" +
                        "To visit a pet in the shelter,enter [visit]");

                String response = input.next();


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
                        System.out.println(name + "-" + vPet);
                    }
                    System.out.println("There are a lot of things to do at the shelter! What do you want to do next?\n" +
                            "1. Feed all organic pets\n" +
                            "2. Feed one organic pet\n" +
                            "3. Charge all robotic pets\n" +
                            "4. Charge one robotic pet\n" +
                            "5. Play with all pets\n" +
                            "6. Take all organic pets to the doctor\n" +
                            "7. Give water to organic pets\n" +
                            "8. Clean all pet cages\n" +
                            "9. Wash all pets\n" +
                            "10. Check pets' status");
                    int interactMenuChoice = input.nextInt();
                    switch (interactMenuChoice) {
                        case 1:
                            shelterRoster.feedAllPets();
                            shelterRoster.tickAllPets();
                            System.out.println("Nom nom nom. All the pets are fed!");
                            break;

                        case 2:
                            System.out.println("Enter the name of the pet you would like to feed.");
                            for (String name : shelterRoster.getShelterRoster().keySet()) {
                                VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                                System.out.println(name + "-" + vPet);
                            }
                            String petToFeed = input.nextLine();
                            input.nextLine();
                            VirtualPet aPet = shelterRoster.getShelterRoster().get(petToFeed);
                            if (aPet instanceof Organic) {
                                Organic pet = ((Organic) shelterRoster.getShelterRoster().get(petToFeed));
                                pet.feedPet();
                            }
                            System.out.println("Your pet is full!!");
                            shelterRoster.tickAllPets();
                            break;


                        case 3:
                            shelterRoster.chargeAllPets();
                            shelterRoster.tickAllPets();
                            System.out.println("Sweet! All the robotic pets are charged!");
                            break;

                        case 4:
                            System.out.println("Enter the name of the pet you would like to charge");
                            String petToCharge = input.nextLine();
                            input.nextLine();
                            VirtualPet bPet = shelterRoster.getShelterRoster().get(petToCharge);
                            if (bPet instanceof Robotic) {
                                Robotic pet = ((Robotic) shelterRoster.getShelterRoster().get(petToCharge));
                                pet.chargePet();
                            }

                            for (String name : shelterRoster.getShelterRoster().keySet()) {
                                VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                                System.out.println(name + "-" + vPet);
                            }
                            System.out.println("Your pet is charged!");
                            shelterRoster.tickAllPets();
                            break;

                        case 5:
                            shelterRoster.playWithAllPets();
                            shelterRoster.tickAllPets();
                            System.out.println("The pets are exhausted now!");
                            break;

                        case 6: shelterRoster.takePetsToDoctor();
                            shelterRoster.tickAllPets();
                            System.out.println("All your pets are healthy!!");
                            break;

                        case 7:
                            shelterRoster.waterAllPets();
                            shelterRoster.tickAllPets();
                            System.out.println("The pets are no longer thirsty!");
                            break;

                        case 8:
                            shelterRoster.cleanAllCages();
                            shelterRoster.tickAllPets();
                            System.out.println("All cages have been cleaned!");
                            break;

                        case 9:
                            shelterRoster.washAllPets();
                            shelterRoster.tickAllPets();
                            System.out.println("Your pets really stunk, glad you washed them!");
                            break;

                        case 10:
                            for (String name : shelterRoster.getShelterRoster().keySet()) {
                                VirtualPet vPet = shelterRoster.getShelterRoster().get(name);
                                System.out.println(name + "-" + vPet);
                            }
                            break;
                    }
                }
            }
        } else {
            System.exit(0);
        }

    }
}







