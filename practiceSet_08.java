package OOPS_Concept_in_Java;

import java.util.Scanner;


// 1. Create a class named as 'Employee' with following properties and methods :
//  salary (property) (int)
//  getSalary (method returning int)
//  name (property) (String)
//  getName (method returning String)
//  setName (method changing name)
class Employee {
    int salary;

    public int getSalary() {
        return salary;
    }

    String name;

    public String getName() {
        return name;
    }

    public String setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name :  ");
        name = sc.nextLine();
        return name;
    }

    public String setName0(String n) {
        name = n;
        return name;
    }
}

// 2. Create a class Cellphone with methods to print "ringing", "vibrating", etc... :
class Cellphone {
    public void ring() {
        System.out.println("Your Phone is Ringing.");
    }
    public void vibrate() {
        System.out.println("Your Phone is Vibrating.");
    }
    public void silent() {
        System.out.println("Your Phone is neither Ringing nor Vibrating.");
    }
}

// 3. Create a class Square with a method to initialize its side, calculating area, perimeter, etc... :
class Square {
    int side;
    public int setSide() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square :  ");
        side = sc.nextInt();
        return side;
    }
    public int calculateArea() {
        return side * side;
    }
    public int calculatePerimeter() {
        return side * 4;
    }
}

// 4. Create a class Rectangle & repeat No. 3 :
class Rectangle {
    Scanner sc = new Scanner(System.in);
    int l, b;
    public int setLength() {
        System.out.print("Enter the Length of the Rectangle :  ");
        l = sc.nextInt();
        return l;
    }
    public int setBreadth() {
        System.out.print("Enter the Breadth of the Rectangle :  ");
        b = sc.nextInt();
        return b;
    }
    public int calculateArea() {
        return l * b;
    }
    public int calculatePerimeter() {
        return (l + b) * 2;
    }
}

// 5. Create a class TommyVercetti for Rockstar Games capable of hitting(print hitting...), running, firing, etc... :
class TommyVercetti {
    public void hit() {
        System.out.println("\tHitting the Enemies.");
    }
    public void run() {
        System.out.println("\tRunning from the Cops.");
    }
    public void fire() {
        System.out.println("\tFiring on the Cops.");
    }
}

// 6. Repeat No. 4 for a circle :
class Circle {
    Scanner sc = new Scanner(System.in);
    int radius;
    public int setRadius() {
        System.out.print("Enter the Radius :  ");
        radius = sc.nextInt();
        return radius;
    }
    public double calculateArea() {
        return (double) Math.round(Math.PI * radius * radius * 100) / 100;
    }
    public double calculatePerimeter() {
        return (double) Math.round(2 * Math.PI * radius * 100) / 100;
    }
}

public class practiceSet_08 {
    public static void main(String[] args) {
//        1.
        Employee sourav = new Employee();
        sourav.salary = 25;
        System.out.println("\nSalary of the employee is :  " + sourav.getSalary());
        sourav.name = "Sourav Routray";
        System.out.println("Name of the employee is :  " + sourav.getName());
        System.out.println("\nChanging the employee name by taking user input :");
        System.out.println("Changed name is :  " + sourav.setName());
        System.out.println("\nChanging the employee name using argument and parameter :");
        System.out.println("Changed name is :  " + sourav.setName0("John Abraham"));

//        2.
        Cellphone s21 = new Cellphone();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your phone is at which state :  ");
        System.out.println("\tPress 1 for Ring");
        System.out.println("\tPress 2 for Vibrate");
        System.out.println("\tPress 3 for Silent");
        System.out.print("\tChoose an Option :  ");
        int st = sc.nextInt();
        if(st == 1)
            s21.ring();
        else if (st == 2)
            s21.vibrate();
        else if(st == 3)
            s21.silent();
        else
            System.out.println("INVALID OPTION");

//        3.
        Square sq = new Square();
        System.out.println("\nIn the Square :");
        System.out.println("\tLength of each side is :  " + sq.setSide());
        System.out.println("\tArea is :  " + sq.calculateArea());
        System.out.println("\tPerimeter is :  " + sq.calculatePerimeter());

//        4.
        Rectangle rect = new Rectangle();
        System.out.println("\nIn the Rectangle :");
        System.out.println("\tLength is :  " + rect.setLength());
        System.out.println("\tBreadth is :  " + rect.setBreadth());
        System.out.println("\tArea is :  " + rect.calculateArea());
        System.out.println("\tPerimeter is :  " + rect.calculatePerimeter());

//        5.
        TommyVercetti player = new TommyVercetti();
        System.out.println("\nPlayer is :");
        player.hit();
        player.run();
        player.fire();

//        6.
        Circle cr = new Circle();
        System.out.println("\nIn the Circle :");
        System.out.println("\tRadius is :  " + cr.setRadius());
        System.out.println("\tArea is :  " + cr.calculateArea());
        System.out.println("\tPerimeter is :  " + cr.calculatePerimeter());
    }
}