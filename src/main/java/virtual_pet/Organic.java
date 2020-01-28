package virtual_pet;

public class Organic extends VirtualPet {
    private int hunger = 20;
    private int health = 20;
    private int thirst = 20;

    public Organic(String name) {
        super(name);
    }

    @Override
    public String getPetType() {
        return "Organic";
    }

    public int getThirst() { return 20; }

    public  int getHunger() {return 20;}


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