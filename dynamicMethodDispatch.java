package OOPS_Concept_in_Java;

class Phone  {
    public void showTime() {
        System.out.println("Showing Time on Phone :)");
    }
    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
    public void playMusic() {
        System.out.println("Playing Music on SmartPhone :)");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Phone p = new Phone(); // Allowed
        SmartPhone s = new SmartPhone(); // Allowed

        Phone ps = new SmartPhone(); // Also Allowed
//        SmartPhone sp = new Phone(); // Not Allowed

        ps.showTime();
        ps.on(); // Object Method will be executed.
//        ps.playMusic(); // Not Allowed
    }
}