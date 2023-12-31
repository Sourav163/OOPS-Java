package OOPS_Concept_in_Java;

class MyThread0 extends Thread {
    public MyThread0(String name) {
        super(name);
    }

    public void run() {
        while(true)
            System.out.println("I am " + this.getName());
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread0 th0 = new MyThread0("Sourav");
        MyThread0 th1 = new MyThread0("Routray");
        th0.start();
        try {
            th0.join();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        th1.start();
    }
}
