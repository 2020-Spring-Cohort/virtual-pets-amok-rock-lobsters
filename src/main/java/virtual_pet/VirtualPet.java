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
    {


    }

    public String getName() {
        return name;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getFilth() {
        return filth;
    }

    public int getCageCleanliness() {
        return cageCleanliness;
    }

    public boolean isAlive(){
        return true;}

   public void play(){
        boredom += 5;
   }
   public void clean(){
        cageCleanliness +=10;
   }
   public void wash(){
        filth +=4;
   }



    public abstract String getPetType();
}
