package OOPS_Concept_in_Java;

class Student1 {
    private int id;
    private String name;
    public void setName(String n) {
        name = n;
    }
    public void setId(int i) {
        id = i;
    }
    public Student1() {
        id = 104;
        name = "Sourav Routray";
    }
    public Student1(int i, String n) {
        id = i;
        name = n;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println(s1.getId());
        System.out.println(s1.getName());

        Student1 s2 = new Student1(170, "Routray Sourav");
        System.out.println(s2.getId());
        System.out.println(s2.getName());
    }
}
