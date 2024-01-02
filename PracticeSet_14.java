package OOPS_Concept_in_Java;

import java.util.Arrays;
import java.util.Scanner;

class IllegalArgumentExceptionThread extends Thread {
    public void run() {
        try {
            Thread.sleep(-6);
        }
        catch (Exception e) {
            System.out.println("HeHe");
        }
    }
}

class ArrayIndexOutOfBounds5Exception extends Exception {
    public String getMessage() {
        return "Message :  You have exceeded the limit";
    }

    public String toString() {
        return "Exception :  ArrayIndexOutOfBoundsException occurred 5 times, no further";
    }
}

public class PracticeSet_14 {
    public static void main(String[] args) {
        // 1. Demonstrate 3 Types of Errors - Syntax/Compilation, Logical, Runtime :
//        Syntax / Compilation Error :
//        int a = 10  // Error :  no semicolon!
//        b = 10;  // Error :  'b' not declared!

//        Logical Error :
//        WAP to print all the even numbers from 1 to 10 :
//        System.out.println("All the even numbers from 1 to 10 :");
//        for(int i = 1; i <= 10; i++)
//            if(i % 2 != 0)
//                System.out.println(i);  // Prints odd numbers instead of even numbers.

//        Runtime Error / Exception :
//        System.out.println(100/0);  // Not divisible by 0.

        // 2. Display :  "HaHa" - ArithmeticException & "HeHe" - IllegalArgumentException :
//        try {
//            IllegalArgumentExceptionThread th = new IllegalArgumentExceptionThread();
//            th.start();
//            System.out.println(100/0);
//        }
//        catch(ArithmeticException e) {
//            System.out.println("HaHa");
//        }

        // 3. Keep access an array until a valid index is given. Display "Error" after 5 retries :
//        int[] arr3 = {5, 10, 20, 40, 50, 100};
//        System.out.println("\nArray =  " + Arrays.toString(arr3));
//        Scanner sc3 = new Scanner(System.in);
//        int intCheck3 = 0;
//        while(intCheck3 < 5) {
//            try {
//                System.out.print("\nEnter the index :  ");
//                int index = sc3.nextInt();
//                try {
//                    int check3 = arr3[index];
//                    intCheck3 = 5;
//                    System.out.println("\nIndex is Valid :)");
//                }
//                catch(ArrayIndexOutOfBoundsException e) {
//                    intCheck3++;
//                    if(intCheck3 == 5) {
//                        System.out.println("\nError");
//                        break;
//                    }
//                    else {
//                        System.out.println("\nInvalid Index :(");
//                    }
//                }
//            }
//            catch(Exception e) {
//                System.out.println("Exception Level-1");
//            }
//        }

        // 4. Same as Q3 but, after 5 retries throw a custom Exception :
//        int[] arr4 = {5, 10, 20, 40, 50, 100};
//        System.out.println("\nArray =  " + Arrays.toString(arr4));
//        Scanner sc4 = new Scanner(System.in);
//        int intCheck4 = 0;
//        while(intCheck4 < 5) {
//            try {
//                System.out.print("\nEnter the index :  ");
//                int index = sc4.nextInt();
//                try {
//                    int check4 = arr4[index];
//                    intCheck4 = 5;
//                    System.out.println("\nIndex is Valid :)");
//                }
//                catch(ArrayIndexOutOfBoundsException e) {
//                    intCheck4++;
//                    if(intCheck4 == 5) {
//                        try {
//                            throw new ArrayIndexOutOfBounds5Exception();
//                        }
//                        catch(ArrayIndexOutOfBounds5Exception e5) {
//                            System.out.println(e5.getMessage());
//                            System.out.println(e5.toString());
//                        }
//                    }
//                    else {
//                        System.out.println("\nInvalid Index :(");
//                    }
//                }
//            }
//            catch(Exception e) {
//                System.out.println("Exception Level-1");
//            }
//        }

        // 5. Same as Q4 but, wrap in a method which throws the custom Exception :
        int[] arr5 = {5, 10, 20, 40, 50, 100};
        System.out.println("\nArray =  " + Arrays.toString(arr5));
        Scanner sc5 = new Scanner(System.in);
        int intCheck5 = 0;
        while(intCheck5 < 5) {
            try {
                System.out.print("\nEnter the index :  ");
                int index = sc5.nextInt();
                try {
                    int check5 = arr5[index];
                    intCheck5 = 5;
                    System.out.println("\nIndex is Valid :)");
                }
                catch(ArrayIndexOutOfBoundsException e) {
                    intCheck5++;
                    if(intCheck5 == 5) {

                    }
                    else {
                        System.out.println("\nInvalid Index :(");
                    }
                }
            }
            catch(Exception e) {
                System.out.println("Exception Level-1");
            }
        }
    }
}
