package virtual_pet;

public class Organic extends VirtualPet {
    // how are organic objects affected

    private int hunger = 20;
    private int health = 20;
    private int thirst = 20;



    public Organic(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Organic{" +
                "hunger=" + hunger +
                ", health=" + health +
                ", thirst=" + thirst +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                ", filth=" + filth +
                ", boredom=" + boredom +
                ", cageCleanliness=" + cageCleanliness +
                '}';
    }
}