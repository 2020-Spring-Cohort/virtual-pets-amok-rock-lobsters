package virtual_pet;

public abstract class VirtualPet {
    public String name;
    public boolean isAlive = true;
    public int filth = 20;
    public int boredom = 20;
    public int cageCleanliness = 20;


    public VirtualPet(String name) {

        this.name = name;
    }
    public abstract void tick();

    public String getName() {
        return name;
    }

    public int getBoredom() {
        return 20;
    }

    public int getFilth() {
        return 20;
    }

    public int getCageCleanliness() {
        return 20;
    }

    public int getHealth() {
        return 20;
    }

    public int lifePoints() {
        return 20;
    }

    public abstract String getPetType();
}
