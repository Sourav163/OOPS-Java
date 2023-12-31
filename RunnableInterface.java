package OOPS_Concept_in_Java;

class RunnableThread1 implements Runnable {
    public void run() {
        while(true)
            System.out.println("I am Thread-1");
    }
}

class RunnableThread2 implements Runnable {
    public void run() {
        while(true)
            System.out.println("I am Thread-2");
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        RunnableThread1 bullet1 = new RunnableThread1();
        Thread gun1 = new Thread(bullet1);

        RunnableThread2 bullet2 = new RunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
