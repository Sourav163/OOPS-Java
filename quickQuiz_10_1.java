package OOPS_Concept_in_Java;

class Animal {
    public Animal() {
        System.out.println("\nAnimal :");
    }
    public void animalProperty() {
        System.out.println("\t- Has four legs.");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("\nDog :");
    }
    public void dogProperty() {
        System.out.println("\t- Barks.");
    }
}

public class quickQuiz_10_1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.animalProperty();
        d.dogProperty();
    }
}
