package OOPS_Concept_in_Java;

class Hello {
    int a;
    public Hello(int a) {
//        a = a; --> Confusing.
//        hi.a = a; --> Not Possible Here.
        this.a = a; // --> So, we use 'this' keyword as an object reference.
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Hello hi = new Hello(10);
        System.out.println(hi.a);
        hi.a = 5;
        System.out.println(hi.a);
    }
}
