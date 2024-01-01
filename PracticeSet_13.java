package OOPS_Concept_in_Java;

// 1. Write a program to print "Good Morning" and "Welcome" continuously on the screen in java using threads.
class GoodMorning1 extends Thread {
    public void run() {
        while(true)
            System.out.println("Good Morning");
    }
}
class Welcome1 extends Thread {
    public void run() {
        while(true)
            System.out.println("Welcome");
    }
}

// 2. Add a sleep method in Welcome Thread of Question 1 to delay its execution for 200 ms.
class GoodMorning2 extends Thread {
    public void run() {
        while(true)
            System.out.println("Good Morning");
    }
}
class Welcome2 extends Thread {
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while(true)
            System.out.println("Welcome");
    }
}

// 3. Demonstrate getPriority() and setPriority() methods in java threads.
class DemonstratePriority extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
}

// 4. How do you get state of a given thread in java.  --> Thread.getState()
class ThreadState extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
}

// 5. How do you get reference to the current thread in java.  --> Thread.currentThread()
class ThreadReference extends Thread {
    public ThreadReference(String name) {
        super(name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class PracticeSet_13 {
    public static void main(String[] args) throws InterruptedException {
//        1.
//        GoodMorning1 gm1 = new GoodMorning1();
//        Welcome1 w1 = new Welcome1();
//        gm1.start();
//        w1.start();

//        2.
//        GoodMorning2 gm2 = new GoodMorning2();
//        Welcome2 w2 = new Welcome2();
//        gm2.start();
//        w2.start();

//        3.
//        DemonstratePriority dp = new DemonstratePriority();
//        dp.setPriority(10);
//        System.out.println("getPriority(Thread) =  " + dp.getPriority());

//        4.
//        ThreadState ts = new ThreadState();
//        System.out.println("State of the Thread before start =  " + ts.getState());
//        ts.start();
//        System.out.println("State of the Thread after start =  " + ts.getState());
//        ts.join();
//        System.out.println("State of the Thread after join =  " + ts.getState());

//        5.
        ThreadReference tr1 = new ThreadReference("Sourav");
        ThreadReference tr2 = new ThreadReference("Routray");
        tr1.start();
        tr2.start();
    }
}
