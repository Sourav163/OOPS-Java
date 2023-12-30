package OOPS_Concept_in_Java;

// 1. Create a class Cylinder and use getters and setters to set its radius and height :
class Cylinder {
    private int radius, height;
    public void setRadius(int r) {
        radius = r;
    }
    public void setHeight(int h) {
        height = h;
    }
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
}

// 2. Use No. 1 to calculate the surface area and volume of the cylinder :
class Cylinder0 {
    private int radius, height;
    public void setRadius(int r) {
        radius = r;
    }
    public void setHeight(int h) {
        height = h;
    }
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
    public double getSurfaceArea() {
        return (double) Math.round(2 * Math.PI * radius * (radius + height) * 100) / 100;
    }
    public double getVolume() {
        return (double) Math.round(Math.PI * radius * radius * height * 100) / 100;
    }
}

// 3. Use a constructor and repeat No. 1 :
class Cylinder1 {
    private int radius, height;
    public Cylinder1(int r, int h) {
        radius = r;
        height = h;
    }
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
}

// 4. Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters :
class Rectangle0 {
    private int length, breadth;
    public Rectangle0() {
        length = 8;
        breadth = 10;
    }
    public Rectangle0(int l, int b) {
        length = l;
        breadth = b;
    }
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
}

// 5. Repeat No. 1 for a sphere :
class Sphere {
    private int radius;
    public void setRadius(int r) {
        radius = r;
    }
    public int getRadius() {
        return radius;
    }
}


public class practiceSet_09 {
    public static void main(String[] args) {
//        1.
        Cylinder cyl = new Cylinder();
        cyl.setRadius(10);
        cyl.setHeight(20);
        System.out.println("\nRadius of the Cylinder is :  " + cyl.getRadius());
        System.out.println("Height of the Cylinder is :  " + cyl.getHeight());

//        2.
        Cylinder0 cyl0 = new Cylinder0();
        cyl0.setRadius(10);
        cyl0.setHeight(20);
        System.out.println("\nRadius of the Cylinder is :  " + cyl0.getRadius());
        System.out.println("Height of the Cylinder is :  " + cyl0.getHeight());
        System.out.println("Surface Area of the Cylinder is :  " + cyl0.getSurfaceArea());
        System.out.println("Volume of the Cylinder is :  " + cyl0.getVolume());

//        3.
        Cylinder1 cyl1 = new Cylinder1(10, 20);
        System.out.println("\nRadius of the Cylinder is :  " + cyl1.getRadius());
        System.out.println("Height of the Cylinder is :  " + cyl1.getHeight());

//        4.
        Rectangle0 rect0 = new Rectangle0();
        System.out.println("\nUsing Constructor with no arguments :");
        System.out.println("\tLength of the rectangle is :  " + rect0.getLength());
        System.out.println("\tBreadth of the rectangle is :  " + rect0.getBreadth());
        Rectangle0 rect1 = new Rectangle0(4, 5);
        System.out.println("Overloading Constructor with 2 arguments :");
        System.out.println("\tLength of the rectangle is :  " + rect1.getLength());
        System.out.println("\tBreadth of the rectangle is :  " + rect1.getBreadth());

//        5.
        Sphere sp = new Sphere();
        sp.setRadius(10);
        System.out.println("\nRadius of the Sphere is :  " + sp.getRadius());
    }
}
