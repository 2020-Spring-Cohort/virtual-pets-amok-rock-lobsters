package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        VirtualPet shoeShiner = new VirtualPet("Roger", 2000);
        VirtualPet shoeShinerExecutive = new VirtualPet("Bill", 200000);

        Shelter shelterRoster = new Shelter();
        shelterRoster.dropOff(shoeShiner);
        shelterRoster.dropOff(shoeShinerExecutive);
        System.out.println("Here your Virtual Pets!:");
        System.out.println(shelterRoster.retrieveShelterList();

        System.out.println("Dropping off a pet?  What is their name?");
        Scanner input = new Scanner(System.in);
        String enployeeName = input.nextLine();
        System.out.println("Is your pet Organic? Robotic?");
        int salary = input.nextInt();
        input.nextLine();
        shelterRoster.dropOff(new VirtualPet(petName, salary));

        System.out.println("Here are the pets we have:");
        for(VirtualPet employee :shelterRoster.retrieveShelterList()){
            System.out.println(employee);
        }
        shelterRoster.payAllVirtualPets();
        for(VirtualPet employee :shelterRoster.retrieveShelterList()){
            System.out.println(employee);
        }
//        System.out.println(shelterRoster.retrieveShelterList());

    }
}
