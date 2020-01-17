package virtual_pet;

public class VirtualPet {

    public static void main(String[] args){
        System.out.println("Welcome to Virtual Pets!");
    }



    private String name;

    public VirtualPet(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return 20;
    }

    public int getBoredom() {
        return 20;
    }

    public int getHealth() {
        return 20;
    }

    public int getFilth() {
        return 20;
    }
}
