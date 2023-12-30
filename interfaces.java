package OOPS_Concept_in_Java;

abstract class Cycle {
    public void property() {
        System.out.println("A Cycle has 2 Wheels.");
    }
    abstract public void pedal();
}

interface Bicycle {
    int speed = 10;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle {
    void blowHornK3g();
    void blowHornMhn(); // These are 'public' By default.
}

class AvonCycle extends Cycle implements Bicycle, HornBicycle {
    int speed0;
    public void pedal() {
        System.out.println("It has Pedals. So, it is a Bicycle");
    }
    public AvonCycle() {
        System.out.println("The initial speed of the bicycle is :  " + speed);
    }
    @Override
    public void applyBrake(int decrement) {
        speed0 = speed - decrement;
        System.out.println("The speed after applying break :  " + speed0);
    }
    @Override
    public void speedUp(int increment) {
        speed0 += increment;
        System.out.println("The speed after speeding up :  " + speed0);
    }
    public void blowHornK3g() {
        System.out.println("Kabhi Khushi Kabhi Gham, pee pee pee pee");
    }
    public void blowHornMhn() {
        System.out.println("Main Hoon Na, po po po po");
    }
}

public class interfaces {
    public static void main(String[] args) {
        AvonCycle a = new AvonCycle();
        a.property();
        a.pedal();
        a.applyBrake(7);
        a.speedUp(5);
        a.blowHornK3g();
        a.blowHornMhn();
//        Bicycle ba = new AvonCycle(); // Allowed
    }
}
