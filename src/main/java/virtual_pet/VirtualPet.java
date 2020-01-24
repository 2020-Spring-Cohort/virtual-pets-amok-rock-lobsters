package virtual_pet;

public class VirtualPet {
    public boolean isAlive ;
    public String name;
    public int filth;
    public int boredom;
    public  int cageCleanliness;



    public VirtualPet(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBoredom() {
        return 20;
    }

    public int getFilth() {
        return 20;
    }

    public int getCageCleanliness() {return 20;}

    public  int getHealth() {return 20;}

    public  int getHunger() {return 20;}



    public boolean isAlive() {
        return isAlive;
    }

}
