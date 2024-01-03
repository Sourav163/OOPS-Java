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
        return "\nException :  Number is greater than 100000, exceeds calculating limit :(";
    }
}

class InvalidOperationException extends Exception {
    public String getMessage() {
        return "\nException :  You have entered invalid operation :(";
    }
}

class MaxMultiplierReachedException extends Exception {
    public String getMessage() {
        return "\nException :  Number is greater than 7000, exceeds Multiplication limit :(";
    }
}

public class Exercise_06 {
    public static void main(String[] args) {
        System.out.println("\nSimple Calculator having only Operations :  +, -, *, /");

        boolean numBool = true;
        int countOprInput = 0;

        while(numBool) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("\nEnter Two Numbers :");

                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if(num1 > 100000 || num2 > 100000)
                    throw new MaxInputException();

                numBool = false;
                boolean oprBool = true;
                while(oprBool) {
                    System.out.print("Enter The Operation :  ");

                    if(countOprInput == 0)
                        sc.nextLine();
                    String opr = sc.nextLine();

                    switch (opr) {
                        case "+":
                            System.out.println("\nAddition :  " + num1 + " + " + num2 + " = " + (num1+num2));
                            oprBool = false;
                            break;
                        case "-":
                            System.out.println("\nSubtraction :  " + num1 + " - " + num2 + " = " + (num1-num2));
                            oprBool = false;
                            break;
                        case "*":
                            if(num1 > 7000 || num2 > 7000)
                                throw new MaxMultiplierReachedException();

                            System.out.println("\nMultiplication :  " + num1 + " * " + num2 + " = " + (num1*num2));
                            oprBool = false;
                            break;
                        case "/":
                            if(num2 == 0)
                                throw new ArithmeticException();

                            System.out.println("\nDivision :  " + num1 + " / " + num2 + " = " + (Math.round((double) num1 / num2 * 100) / 100.0));
                            oprBool = false;
                            break;
                        default:
                            countOprInput++;
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
                System.out.println("\nException :  You have entered invalid number :(");
            }
            catch(MaxInputException e) {
                System.out.println(e.getMessage());
            }
            catch(MaxMultiplierReachedException e) {
                System.out.println(e.getMessage());
                numBool = true;
            }
            catch(ArithmeticException e) {
                System.out.println("\nException :  Can't be divided by 0 :(");
                numBool = true;
            }
        }
    }
}
