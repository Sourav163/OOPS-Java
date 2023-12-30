package OOPS_Concept_in_Java;

// 1. Create an abstract class Pen with methods write() and refill() as abstract methods :
abstract class Pen {
    abstract void write();
    abstract void refill();
}

// 2. Use the Pen class from No.1 to create a concrete class FountainPen with additional method changeNib() :
class FountainPen extends Pen {
    public void write() {
        System.out.println("Fountain pen can write as well as pen.");
    }
    public void refill() {
        System.out.println("Fountain pen can be refilled as well as pen.");
    }
    public void changeNib() {
        System.out.println("Fountain pen's nib can be changed unlikely pen's.");
    }
}

// 3. Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class and implements BasicAnimal interface with eat() and sleep() methods :
class Monkey {
    public void jump() {
        System.out.println("Monkey can jump.");
    }
    public void bite() {
        System.out.println("Monkey can bite.");
    }
}

interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Human can eat.");
    }
    public void sleep() {
        System.out.println("Human can sleep.");
    }
}

// 4. Create a class Telephone with ring(), lift() and disconnect() methods as abstract methods. Create another class SmartTelephone and demonstrate polymorphism :
class Telephone {
    public void ring() {
        System.out.println("Telephone is ringing.");
    }
    public void lift() {
        System.out.println("Telephone is lifting.");
    }
    public void disconnect() {
        System.out.println("Telephone is disconnecting.");
    }
}

class smartTelephone extends Telephone {
    public void showName() {
        System.out.println("SmartTelephone showing name.");
    }
}

// 6. Create an interface TvRemote and use it to inherit another interface SmartTvRemote :
interface TvRemote {
    void channel();
}

interface SmartTvRemote extends TvRemote {
    void internet();
}

// 7. Create a class Tv which implements TvRemote interface from No.6 :
class Tv implements TvRemote {
    public void channel() {
        System.out.println("TvRemote can control TV channels.");
    }
}


public class practiceSet_11 {
    public static void main(String[] args) {
//        4.
//        Telephone t = new smartTelephone();
//        t.ring();
//        t.lift();
//        t.disconnect();
//        t.showName(); --> Not Allowed (Polymorphism)

//        5. Demonstrate polymorphism using Monkey class from No.3 :
//        Monkey m = new Human();
//        m.jump();
//        m.bite();
//        m.eat();
//        m.sleep();
    }
}
