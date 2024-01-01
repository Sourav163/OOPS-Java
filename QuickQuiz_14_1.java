package OOPS_Concept_in_Java;

// Write a java program that allows you to keep accessing an array until a valid index is given by the user.

import java.util.Arrays;
import java.util.Scanner;

public class QuickQuiz_14_1 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 40, 50, 100};
        System.out.println("\nArray =  " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        boolean boolCheck = true;
        while(boolCheck) {
            try {
                System.out.print("\nEnter the index :  ");
                int index = sc.nextInt();
                try {
                    int check = arr[index];
                    boolCheck = false;
                    System.out.println("\nIndex is Valid :)");
                }
                catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("\nInvalid Index :(");
                    System.out.println("Exception Level-2");
                }
            }
            catch(Exception e) {
                System.out.println("Exception Level-1");
            }
        }
    }
}
