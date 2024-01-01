package OOPS_Concept_in_Java;

import java.util.Arrays;
import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20};
        System.out.println("\nArray =  " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("\nEnter an index of array :  ");
            int i = sc.nextInt();
            int numerator = arr[i];
            try {
                System.out.print("Enter a number :  ");
                int denominator = sc.nextInt();
                System.out.println("\nint(" + numerator + "/" + denominator + ") = " + numerator / denominator);
            }
            catch(ArithmeticException e) {
                System.out.println("\nCan't be divisible by 0.");
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("\nInvalid array index.");
        }
    }
}
