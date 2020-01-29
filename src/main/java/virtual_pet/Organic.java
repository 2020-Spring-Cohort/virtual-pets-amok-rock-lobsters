package virtual_pet;

public class Organic extends VirtualPet {
    private int hunger = 20;
    private int health = 20;
    private int thirst = 20;

    public Organic(String name) {
        super(name);
    }

    @Override
    public void tick() {
        hunger -= 4;
        health -= 2;
        filth -= 3;
        thirst -= 2;
    }

    @Override
    public String getPetType() {
        return "Organic";
    }

    public int getThirst() {
        return 20;
    }

    public int getHunger() {
        return hunger;
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

    public void feedPet() {
        hunger += 8;
    }

}
