package virtual_pet;

public class Robotic extends VirtualPet {
    // how robotic objects are effected

    private int charge = 20;


    public Robotic(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Robotic{" +
                "charge=" + charge +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                ", filth=" + filth +
                ", boredom=" + boredom +
                ", cageCleanliness=" + cageCleanliness +
                '}';
    }

    public int getCharge() {
        return 20;
    }
}