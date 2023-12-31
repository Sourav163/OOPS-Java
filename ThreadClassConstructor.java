package OOPS_Concept_in_Java;

class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("This is MyThread-1");
    }
}

class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }

    public void run() {
        System.out.println("This is MyThread-2");
    }
}

class MyThread3 implements Runnable {
    public void run() {
        System.out.println("This is MyThread-3");
    }
}

class MyThread4 implements Runnable {
    public void run() {
        System.out.println("This is MyThread-4");
    }
}

public class ThreadClassConstructor {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1("Sourav");
        th1.start();
        System.out.println("ID(MyThread1) =  " + th1.threadId());
        System.out.println("Name(MyThread1) =  " + th1.getName());

        MyThread2 th2 = new MyThread2("Romu");
        th2.start();
        System.out.println("ID(MyThread1) =  " + th2.threadId());
        System.out.println("Name(MyThread1) =  " + th2.getName());

        MyThread3 myThr3 = new MyThread3();
        Thread th3 = new Thread(myThr3, "Sourav");
        th3.start();
        System.out.println("ID(MyThread1) =  " + th3.threadId());
        System.out.println("Name(MyThread1) =  " + th3.getName());

        MyThread4 myThr4 = new MyThread4();
        Thread th4 = new Thread(myThr4, "Romu");
        th4.start();
        System.out.println("ID(MyThread1) =  " + th4.threadId());
        System.out.println("Name(MyThread1) =  " + th4.getName());
    }
}
