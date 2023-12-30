// You have to create a package named com.sourav.shape.
// This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere.
// These classes should use inheritance to properly manage the code.
// Include methods like volume, surface area and getters/setters for dimensions.

package OOPS_Concept_in_Java;

class Rectangle5 {
  public int length, breadth;
  public double surfaceArea;

  public void setLength(int length) {
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  public void setBreadth(int breadth) {
    this.breadth = breadth;
  }

  public int getBreadth() {
    return breadth;
  }

  public void setSurfaceArea() {
    this.surfaceArea = length * breadth;
  }

  public double getSurfaceArea() {
    return surfaceArea;
  }
}

class Square5 {
  public int side;
  public double surfaceArea;

  public void setSide(int side) {
    this.side = side;
  }

  public int getSide() {
    return side;
  }

  public void setSurfaceArea() {
    this.surfaceArea = side * side;
  }

  public double getSurfaceArea() {
    return surfaceArea;
  }
}

class Circle5 {
  public int radius;
  public double surfaceArea;

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setSurfaceArea() {
    this.surfaceArea = Math.PI * radius * radius;
  }

  public double getSurfaceArea() {
    return surfaceArea;
  }
}

class Cylinder5 {
  public int radius, height;
  public double surfaceArea, volume;

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getHeight() {
    return height;
  }

  public void setSurfaceArea() {
    this.surfaceArea = 2 * Math.PI * radius * (radius + height);
  }

  public double getSurfaceArea() {
    return surfaceArea;
  }

  public void setVolume() {
    this.volume = Math.PI * radius * radius * height;
  }

  public double getVolume() {
    return volume;
  }
}

class Sphere5 {
  public int radius;
  public double surfaceArea, volume;

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setSurfaceArea() {
    this.surfaceArea = 4 * Math.PI * radius * radius;
  }

  public double getSurfaceArea() {
    return surfaceArea;
  }

  public void setVolume() {
    this.volume = (double) 4 / 3 * Math.PI * radius * radius * radius;
  }

  public double getVolume() {
    return volume;
  }
}

public class Exercise_05 {
  public static void main(String[] args) {
    Rectangle5 rect = new Rectangle5();
    System.out.println("Rectangle :");
    rect.setLength(5);
    System.out.println("\t Length =  " + rect.getLength());
    rect.setBreadth(8);
    System.out.println("\t Breadth =  " + rect.getBreadth());
    rect.setSurfaceArea();
    System.out.println("\t Surface Area =  " + rect.getSurfaceArea());

    Square5 sq = new Square5();
    System.out.println("\n Square :");
    sq.setSide(5);
    System.out.println("\t Side =  " + sq.getSide());
    sq.setSurfaceArea();
    System.out.println("\t Surface Area =  " + sq.getSurfaceArea());

    Circle5 cr = new Circle5();
    System.out.println("\n Circle :");
    cr.setRadius(5);
    System.out.println("\t Radius =  " + cr.getRadius());
    cr.setSurfaceArea();
    System.out.println("\t Surface Area =  " + cr.getSurfaceArea());

    Cylinder5 cyl = new Cylinder5();
    System.out.println("\n Cylinder :");
    cyl.setRadius(5);
    System.out.println("\t Radius =  " + cyl.getRadius());
    cyl.setHeight(8);
    System.out.println("\t Height =  " + cyl.getHeight());
    cyl.setSurfaceArea();
    System.out.println("\t Surface Area =  " + cyl.getSurfaceArea());
    cyl.setVolume();
    System.out.println("\t Volume =  " + cyl.getVolume());

    Sphere5 sp = new Sphere5();
    System.out.println("\n Sphere :");
    sp.setRadius(10);
    System.out.println("\t Radius =  " + sp.getRadius());
    sp.setSurfaceArea();
    System.out.println("\t Surface Area =  " + sp.getSurfaceArea());
    sp.setVolume();
    System.out.println("\t Volume =  " + sp.getVolume());
  }
}