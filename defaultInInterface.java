package OOPS_Concept_in_Java;

interface Camera {
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

interface Network {
    void data();
    void wifi();
}

class CellPhone0 {
    public CellPhone0() {
        System.out.println("Switching On/Off.");
    }
    public void playMusic() {
        System.out.println("Playing Music...");
    }
}

class SmartPhone0 extends CellPhone0 implements Camera, Network {
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

public class defaultInInterface {
    public static void main(String[] args) {
        SmartPhone0 s0 = new SmartPhone0();
        s0.clickToAction();
        s0.capturePhoto();
        s0.recordVideo();
        s0.data();
        s0.wifi();
        s0.playMusic();
    }
}
