package OOPS_Concept_in_Java;

class Base0 {
    public Base0() {
        System.out.println("I am a Base0 Constructor.");
    }
    public Base0(int x) {
        System.out.println("I am a Base0 Constructor Overloaded with :  " + x);
    }
}

class Derived0 extends Base0 {
    public Derived0() {
//        super(10);
        System.out.println("I am a Derived0 Constructor.");
    }
    public Derived0(int x, int y) {
        super(x);
        System.out.println("I am a Derived0 Constructor Overloaded with :  " + y);
    }
}

class ChildOfDerived0 extends Derived0 {
    public ChildOfDerived0() {
        System.out.println("I am a ChildOfDerived0 Constructor.");
    }
    public ChildOfDerived0(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a ChildOfDerived0 Constructor Overloaded with :  " + z);
    }
}

public class constructorsInInheritance {
    public static void main(String[] args) {
        ChildOfDerived0 ch = new ChildOfDerived0();
        System.out.println();
        ChildOfDerived0 ch0 = new ChildOfDerived0(10, 20, 25);
    }
}
