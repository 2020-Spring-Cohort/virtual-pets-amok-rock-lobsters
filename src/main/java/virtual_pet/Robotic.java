package virtual_pet;

public class Robotic extends VirtualPet {
    // how robotic objects are effected

    private int charge = 20;


    public Robotic(String name) {
        super(name);
    }

//    @Override
    public void tick() {
        charge -= 2;
        boredom -= 4;
        filth -= 3;
        cageCleanliness -=2;
    }

    @Override
    public String getPetType() {
        return "Robotic";
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
        return charge;
    }
    public void chargePet(){
        charge +=6;
    }
}