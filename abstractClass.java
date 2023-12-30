package OOPS_Concept_in_Java;

abstract class Android {
    public Android() {
        System.out.println("\nConstructor(Android)");
    }
    abstract public void on();
    public void greet() {
        System.out.println("\t\tHello, Chief :)");
    }
    abstract public void off();
}

class Samsung extends Android {
    public Samsung() {
        System.out.println("\nConstructor(Samsung)");
    }
    @Override
    public void on() {
        System.out.println("\tAndroid v13.0\tSamsung Galaxy S21 FE 5G");
    }
    @Override
    public void off() {
        System.out.println("\tSamsung :)");
    }
}

abstract class Nokia extends Android {
    public Nokia() {
        System.out.println("\nConstructor(Nokia)");
    }
    @Override
    public void on() {
        System.out.println("\tNokia :)");
    }
}

public class abstractClass {
    public static void main(String[] args) {
//        Android a = new Android(); --> Not Allowed
        Samsung s = new Samsung(); // Allowed
        s.on();
        s.greet();
        s.off();
//        Nokia n = new Nokia(); --> Not Allowed
        Android as = new Samsung(); // Allowed
        as.on();
        as.greet();
        as.off();
//        Android an = new Nokia(); --> Not Allowed
    }
}
