package OOPS_Concept_in_Java;

class Circle0 {
    private int radius;
    public void setRadius(int r) {
        radius = r;
    }
    public int getRadius() {
        return radius;
    }
}

public class quickQuiz_9_1 {
    public static void main(String[] args) {
        Circle0 cr = new Circle0();
        cr.setRadius(10);
        System.out.println("Circle Radius is :  " + cr.getRadius());
    }
}
