/*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        Which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/

package OOPS_Concept_in_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

class MaxInputException extends Exception {
    public String getMessage() {
        return "Exception :  Number is greater than 100000, exceeds calculating limit :(";
    }
}

class InvalidOperationException extends Exception {
    public String getMessage() {
        return "Exception :  You have entered invalid operation :(";
    }
}

class MaxMultiplierReachedException extends Exception {
    public String getMessage() {
        return "Exception :  Number is greater than 7000, exceeds Multiplication limit :(";
    }
}

public class Exercise_06 {
    public static void main(String[] args) {
        System.out.println("Simple Calculator having only Operations :  +, -, *, /");

        Scanner sc = new Scanner(System.in);
        boolean numBool = true;

        while(numBool) {
            try {
                System.out.print("Enter Your 1st Number :  ");
                int num1 = sc.nextInt();
                if(num1 > 100000) {
                    try {
                        throw new MaxInputException();
                    }
                    catch(MaxInputException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.print("Enter Your 2nd Number :  ");
                int num2 = sc.nextInt();
                if(num2 > 100000) {
                    try {
                        throw new MaxInputException();
                    }
                    catch(MaxInputException e) {
                        System.out.println(e.getMessage());
                    }
                }

                boolean oprBool = true;
                while(oprBool) {
                    System.out.print("Enter The Operation :  ");
                    String opr = sc.nextLine();
                    switch (opr) {
                        case "+":
                            System.out.println("Addition :  " + num1 + " + " + num2 + " = " + (num1+num2));
                            oprBool = false;
                            break;
                        case "-":
                            System.out.println("Subtraction :  " + num1 + " - " + num2 + " = " + (num1-num2));
                            oprBool = false;
                            break;
                        case "*":
                            try {
                                if(num1 > 7000 || num2 > 7000)
                                    throw new MaxMultiplierReachedException();
                            }
                            catch(Exception e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("Multiplication :  " + num1 + " * " + num2 + " = " + (num1*num2));
                            oprBool = false;
                            break;
                        case "/":
                            try {
                                System.out.println("Division :  " + num1 + " / " + num2 + " = " + (Math.round((double) num1 / num2 * 100) / 100.0));
                                oprBool = false;
                            }
                            catch(ArithmeticException e) {
                                System.out.println("Exception :  Can't be divided by 0 :(");
                            }
                            break;
                        default:
                            try {
                                throw new InvalidOperationException();
                            }
                            catch(InvalidOperationException e) {
                                System.out.println(e.getMessage());
                            }
                    }
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Exception :  You have entered invalid number :(");
            }
            numBool = false;
        }
    }
}
