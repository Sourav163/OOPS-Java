package OOPS_Concept_in_Java;

// 1. Create a class Circle and use inheritance to create another class Cylinder from it.
class Circle1 {
    public void radius() {
        System.out.println("\t- Has radius.");
    }
    public void area() {
        System.out.println("\t- Has area.");
    }
}

class Cylinder2 extends Circle1 {
    public void height() {
        System.out.println("\t- Has height.");
    }
    public void volume() {
        System.out.println("\t- Has volume.");
    }
}

// 2. Create a class Rectangle and use inheritance to create another class cuboid. Try to keep it as close to real world scenario as possible.
class Rectangle1 {
    public void length() {
        System.out.println("\t- Has length.");
    }
    public void breadth() {
        System.out.println("\t- Has breadth.");
    }
    public void area() {
        System.out.println("\t- Has area.");
    }
}

class Cuboid extends Rectangle1 {
    public void height() {
        System.out.println("\t- Has height.");
    }
    public void volume() {
        System.out.println("\t- Has volume.");
    }
}

// 3. Create methods for area and volume in No. 1 :
class Circle2 {
    public int radius;
    private double area;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return area;
    }
    public void setArea() {
        this.area = (double) Math.round(Math.PI * radius * radius * 100) / 100;
    }
}

class Cylinder3 extends Circle2 {
    private int height;
    private double surfaceArea, volume;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getSurfaceArea() {
        return surfaceArea;
    }
    public void setSurfaceArea() {
        surfaceArea = (double) Math.round(2 * Math.PI * radius * (radius + height) * 100) / 100;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume() {
        volume = (double) Math.round(Math.PI * radius * radius * height * 100) / 100;
    }
}

// 4. Create methods for area and volume in No. 2. Also create getters and setters.
class Rectangle2 {
    public int length, breadth;
    private int area;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea() {
        return area;
    }
    public void setArea() {
        this.area = length * breadth;
    }
}

class Cuboid0 extends Rectangle2 {
    private int height, surfaceArea, volume;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getSurfaceArea() {
        return surfaceArea;
    }
    public void setSurfaceArea() {
        this.surfaceArea = 2 * (length * breadth + breadth * height + height * length);
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume() {
        this.volume = length * breadth * height;
    }
}

// 5. What is the constructor execution order for the following inheritance hierarchy :
//  Base --> Derived1 --> Derived2
//  Derived2 obj = new Derived2();
// Which constructor(s) will be executed & in what order ?
//      Ans. -  Constructor(Base) >>> Constructor(Derived1) >>> Constructor(Derived2)
// Proof :
class Base1 {
    public Base1() {
        System.out.println("I am the constructor of Base1.");
    }
}
class Derived1 extends Base1 {
    public Derived1() {
        System.out.println("I am the constructor of Derived1.");
    }
}
class Derived2 extends Derived1 {
    public Derived2() {
        System.out.println("I am the constructor of Derived2.");
    }
}

public class practiceSet_10 {
    public static void main(String[] args) {
//        1.
//        Circle1 cr1 = new Circle1();
//        System.out.println("\nCircle :");
//        cr1.radius();
//        cr1.area();
//        Cylinder2 cyl2 = new Cylinder2();
//        System.out.println("\nCylinder :");
//        cyl2.radius();
//        cyl2.height();
//        cyl2.area();
//        cyl2.volume();

//        2.
//        Rectangle1 rect1 = new Rectangle1();
//        System.out.println("\nRectangle :");
//        rect1.length();
//        rect1.breadth();
//        rect1.area();
//        Cuboid cb = new Cuboid();
//        System.out.println("\nCuboid :");
//        cb.length();
//        cb.breadth();
//        cb.height();
//        cb.area();
//        cb.volume();

//        3.
//        Circle2 cr2 = new Circle2();
//        cr2.setRadius(10);
//        System.out.println("Circle Radius is :  " + cr2.getRadius());
//        cr2.setArea();
//        System.out.println("\tCircle Area is to be :  " + cr2.getArea());
//        Cylinder3 cyl3 = new Cylinder3();
//        cyl3.setRadius(10);
//        System.out.println("Cylinder Radius is :  " + cyl3.getRadius());
//        cyl3.setHeight(20);
//        System.out.println("Cylinder Height is :  " + cyl3.getHeight());
//        cyl3.setSurfaceArea();
//        System.out.println("\tCylinder SurfaceArea is to be :  " + cyl3.getSurfaceArea());
//        cyl3.setVolume();
//        System.out.println("\tCylinder Volume is to be :  " + cyl3.getVolume());

//        4.
//        Rectangle2 rect2 = new Rectangle2();
//        rect2.setLength(20);
//        System.out.println("\nRectangle Length is :  " + rect2.getLength());
//        rect2.setBreadth(10);
//        System.out.println("Rectangle Breadth is :  " + rect2.getBreadth());
//        rect2.setArea();
//        System.out.println("\tRectangle Area is to be :  " + rect2.getArea());
//        Cuboid0 cb0 = new Cuboid0();
//        cb0.setLength(20);
//        System.out.println("\nCuboid Length is :  " + cb0.getLength());
//        cb0.setBreadth(10);
//        System.out.println("Cuboid Breadth is :  " + cb0.getBreadth());
//        cb0.setHeight(5);
//        System.out.println("Cuboid Height is :  " + cb0.getHeight());
//        cb0.setSurfaceArea();
//        System.out.println("\tCuboid SurfaceArea is to be :  " + cb0.getSurfaceArea());
//        cb0.setVolume();
//        System.out.println("\tCuboid Volume is to be :  " + cb0.getVolume());

//        5.
        Derived2 obj = new Derived2();
    }
}
