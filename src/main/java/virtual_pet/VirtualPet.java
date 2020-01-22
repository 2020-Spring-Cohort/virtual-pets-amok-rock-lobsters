package virtual_pet;

public class VirtualPet {
    private int hunger;
    private String name;


    public static void main(String[] args){
        System.out.println("Welcome to Virtual Pets!");
    }


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

    @Override
    public String toString() {
        return "VirtualPet{" +
                "name='" + name + '\'' +
                '}';
    }
}
