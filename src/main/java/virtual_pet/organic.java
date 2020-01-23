package virtual_pet;

public class organic extends VirtualPet {
    static String name

    public organic(String name) {
        super(name);
    }
    public int getHunger() {

        return 20;
    }
    public int getHealth() {
        return 20;
    }

    public String getName(){return name;}
    int getboredom; = 20;


    static {

        organic cat = new organic();
        organic.name = "Lauren";
        organic dog = new organic();
        organic.name = "Fido";
    }
}