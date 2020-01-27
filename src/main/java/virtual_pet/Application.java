package virtual_pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
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

        System.out.println(shelterRoster);

        System.out.println("Would you like to Add an Animal?");
        String response = input.next();
        // change this to a while LOOP, set it to true. Check out the reference code to see examples of the true value.
        if (response.equals("yes")) {

            System.out.println("Is your animal Organic or Robotic");
            String newStateOfBeing = input.nextLine();
            input.nextLine();

            System.out.println("What is the Name of the Animal?");

            String newAnimal = input.nextLine();
            VirtualPet petToAdd;
            if (newStateOfBeing.equals("Robotic")){

                petToAdd = new Robotic(newAnimal);
            }
            else {
                petToAdd = new Organic(newAnimal);
            }
            shelterRoster.dropOff(petToAdd);
            System.out.println(shelterRoster.statusCheck());



        } else if (response.equals("No")) {
            System.out.println("Why are you even here?");
        }


    }
}




