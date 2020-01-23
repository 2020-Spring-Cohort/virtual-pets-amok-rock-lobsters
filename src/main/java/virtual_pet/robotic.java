package virtual_pet;

public class robotic {
    static String name;

    public static void main(String[] args) {
        robotic dog = new robotic();
        robotic.name = "Gizmo";
        robotic cat = new robotic();
        robotic.name = "KatTron3000";
    }
    private int getCharge() {
        return 20;
    }
}