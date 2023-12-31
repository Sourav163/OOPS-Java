package OOPS_Concept_in_Java;

import java.security.cert.TrustAnchor;

class MyThread5 extends Thread {
    public MyThread5(String name) {
        super(name);
    }

    public void run() {
        while(true)
            System.out.println("I am " + this.getName());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread5 th1 = new MyThread5("Sourav-1");
        MyThread5 th2 = new MyThread5("Sourav-2");
        MyThread5 th3 = new MyThread5("Sourav-3");
        MyThread5 th4 = new MyThread5("Sourav-4");
        MyThread5 th5 = new MyThread5("Sourav-5 (Most Important)");
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.NORM_PRIORITY);
        th4.setPriority(Thread.NORM_PRIORITY);
        th5.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
