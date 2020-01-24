package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Welcome to Virtual Pets! Enter Start to begin.");
        Scanner input = new Scanner(System.in);
        Shelter shelterRoster = new Shelter();



        shelterRoster.put("KittyMeowMeow", "Robotic");
        shelterRoster.put("SlobberDog", "Organic");
        shelterRoster.put("Gizmo", "Robotic");
        shelterRoster.put("Fido", "Organic");

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
            shelterRoster.put(newAnimal, newStateOfBeing);

            System.out.println(shelterRoster.values());

        } else if (response.equals("No")) {
            System.out.println("Why are you even here?");
        }


    }
}



}
