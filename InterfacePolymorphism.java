package OOPS_Concept_in_Java;

interface Camera0 {
    void capturePhoto();
    void recordVideo();
    private void sayCheese() {
        System.out.println("Say Cheese :)");
    }
    default void clickToAction() {
        System.out.println("Hint :  Click the Shutter Button to Capture/Record.");
        sayCheese();
    }
}

interface Network0 {
    void data();
    void wifi();
}

class CellPhone1 {
    public CellPhone1() {
        System.out.println("Switching On/Off.");
    }
    public void playMusic() {
        System.out.println("Playing Music...");
    }
}

class SmartPhone1 extends CellPhone1 implements Camera0, Network0 {
    public void clickToAction() {
        System.out.println("Clicking the Shutter Button...");
    }
    public void capturePhoto() {
        System.out.println("Capturing the Photo...");
    }
    public void recordVideo() {
        System.out.println("Recording the Video...");
    }
    public void data() {
        System.out.println("Turning on Mobile Data...");
    }
    public void wifi() {
        System.out.println("Turning on Wi-Fi...");
    }
}

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Camera0 c = new SmartPhone1();  // It is a smartphone, but use it as a camera.
        // c.playMusic(); --> Not Allowed
        c.recordVideo();
    }
}
