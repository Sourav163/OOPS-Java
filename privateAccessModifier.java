package OOPS_Concept_in_Java;

class Student0 {
    private int id;
    private String name;
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setId(int i) {
        id = i;
    }
    public int getId() {
        return id;
    }
}

public class privateAccessModifier {
    public static void main(String[] args) {
        Student0 s0 = new Student0();
//        s0.id = 104;
//        s0.name = "Sourav Routray"; > private access modifier has access only to its class
        s0.setId(104);
        System.out.println("Student ID :  " + s0.getId());
        s0.setName("Sourav Routray");
        System.out.println("Student Name :  " + s0.getName());
    }
}
