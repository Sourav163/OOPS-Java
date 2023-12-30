package OOPS_Concept_in_Java;

class Student {
    int roll;
    String name;
    int salary;

    public void printDetails() {
        System.out.println(roll);
        System.out.println(name);
    }

    public int getSalary() {
        return salary;
    }
}

public class creatingOwnClass {
    public static void main(String[] args) {
        System.out.println("Created own class named 'Student' :");

        Student romu = new Student();
        romu.roll = 2102170;
        romu.name = "Sourav Routray";
        romu.salary = 12;

        Student disha = new Student();
        disha.roll = 2305102;
        disha.name = "Truptisudha Pradhan";
        disha.salary = 15;

        // Printing Attributes Using Class Objects:
        System.out.println(romu.roll);
        System.out.println(romu.name);
        System.out.println(romu.salary);
        System.out.println(disha.roll);
        System.out.println(disha.name);
        System.out.println(disha.salary);

        // Printing Attributes Using Class Methods:
        romu.printDetails();
        disha.printDetails();

        int romuSalary = romu.getSalary();
        int dishaSalary = disha.getSalary();
        System.out.println(romuSalary);
        System.out.println(dishaSalary);
    }
}
