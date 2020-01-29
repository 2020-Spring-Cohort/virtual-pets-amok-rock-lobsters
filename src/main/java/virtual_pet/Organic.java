package virtual_pet;

public class Organic extends VirtualPet {
    private int hunger = 20;
    private int health = 20;
    private int thirst = 20;

    public Organic(String name) {
        super(name);
    }



//    @Override
    public void tick() {
        hunger -= 4;
        health -= 2;
        thirst -= 2;
        boredom -= 4;
        filth -= 3;
        cageCleanliness -=2;
    }

    @Override
    public String getPetType() {
        return "Organic";
    }

    public int getThirst() {
        return thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public int getHealth() {
        return health;
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

    public void feedAllPets() {
        hunger += 8;
    }

    public void takeToDoctor(){
        health += 10;
    }
    public void waterPet(){
        thirst +=5;
    }

    public void feedPet(){
        hunger += 8;
    }

}
