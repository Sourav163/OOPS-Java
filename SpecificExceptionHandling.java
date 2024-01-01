package OOPS_Concept_in_Java;

import java.util.*;

public class SpecificExceptionHandling {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20};
        System.out.println("\nArray =  " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter an index of array :  ");
        int i = sc.nextInt();
        System.out.print("Enter a number :  ");
        int n = sc.nextInt();

        try {
            System.out.println("\nint(" + arr[i] + "/" + n + ") = " + arr[i] / n);
        }
        catch(ArithmeticException e) {
            System.out.println("\nArithmeticException Occurred");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("\nArrayIndexOutOfBoundsException Occurred");
        }
        catch(Exception e) {
            System.out.println("\nSome Other Exception Occurred -->  " + e);
        }
        System.out.println("\nEnd of Program");
    }
}
