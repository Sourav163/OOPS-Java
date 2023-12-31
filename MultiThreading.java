package OOPS_Concept_in_Java;

class Thread1 extends Thread {
    public void run() {
        while(true)
            System.out.println("Thread-1 is Running");
    }
    public void act() {
        while(true)
            System.out.println("Cooking");
    }
}

class Thread2 extends Thread {
    public void run() {
        while(true)
            System.out.println("Thread-2 is Running");
    }
    public void act() {
        while(true)
            System.out.println("Chatting");
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();
        th1.act();
        th2.act();
    }
}
