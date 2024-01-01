package OOPS_Concept_in_Java;

public class FinallyBlock {

    public static int greet() {
        try {
            int a = 10;
            int b = 10;
            return a/b;
        }
        catch(Exception e) {
            System.out.println("Exception");
        }
        finally {
            System.out.println("Cleaning Cache...\nEnd of greet()");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Return value = " + greet());

        int a = 10;
        int b = 5;
        System.out.println("\nI am initially, a = " + a + ", b = " + b);
        while(true) {
            try {
                System.out.println(a/b);
                b--;
            }
            catch(Exception e) {
                System.out.println("Exception Occurred.");
                break;
            }
            finally {
                System.out.println("I am finally, a = " + a + ", b = " + b);
            }
        }

        try {
            System.out.println("\n50/3 = " + 50/3);
        }
        finally {
            System.out.println("try...finally :  Valid");
        }
    }
}
