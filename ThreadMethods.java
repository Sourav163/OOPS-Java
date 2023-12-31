package OOPS_Concept_in_Java;

class MyThread0 extends Thread {
    public MyThread0(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while(i < 100) {
            System.out.println("I am " + this.getName());
            i++;
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyThread00 extends Thread {
    public MyThread00(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while(i < 80) {
            System.out.println("I am " + this.getName());
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyThread0 th0 = new MyThread0("Sourav");
        MyThread00 th00 = new MyThread00("Routray");
        th0.start();
//        try {
//            th0.join();
//        }
//        catch(Exception e) {
//            System.out.println(e);
//        }
        th00.start();
    }
}
