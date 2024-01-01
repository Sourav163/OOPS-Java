package OOPS_Concept_in_Java;
import java.util.Scanner;

class NegativeRadiusException extends Exception {
    public String getMessage() {
        return "Circle radius can't be negative";
    }

    public String toString() {
        return "Circle radius can't be negative";
    }
}

public class Keyword_throw_throws {
    static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    static double calculateArea(int radius) throws NegativeRadiusException {
        if(radius < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
//            System.out.println(divide(5, 0));
            System.out.print("Enter the circle radius :  ");
            int r = sc.nextInt();
            System.out.println("Area of the Circle =  " + calculateArea(r));
        }
        catch(NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Exception");
        }

    }
}
