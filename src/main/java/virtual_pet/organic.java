package virtual_pet;

public class organic {
    static String name;
    public String getName(){return name;}

    static {

        organic cat = new organic();
        organic.name = "Lauren";
        organic dog = new organic();
        organic.name = "Fido";
    }
}