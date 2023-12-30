package OOPS_Concept_in_Java;

class Student2 {
    private int id;
    private String name;
    private int salary;
    public void setName(String n) {
        name = n;
    }
    public void setId(int i) {
        id = i;
    }
    public Student2() {
        id = 104;
        name = "Sourav Routray";
    }
    public Student2(int i, String n) {
        id = i;
        name = n;
    }
    public Student2(int i, String n, int s) {
        id = i;
        name = n;
        salary = s;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
}

public class quickQuiz_9_2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println();

        Student2 s2 = new Student2(170, "Routray Sourav");
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println();

        Student2 s3 = new Student2(3, "Mr. Sourav", 50);
        System.out.println(s3.getId());
        System.out.println(s3.getName());
        System.out.println(s3.getSalary());
    }
}
