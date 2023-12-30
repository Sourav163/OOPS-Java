package OOPS_Concept_in_Java;

class Base {
    public Base() {
        System.out.println("\nIn Base Constructor :");
    }
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base {
    public Derived() {
        System.out.println("\nIn Derived Constructor :");
    }
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(10);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setX(20);
        System.out.println(d.getX());
        d.setY(25);
        System.out.println(d.getY());
    }
}
