package OOPS_Concept_in_Java;

public class ErrorsDemo {
    public static void main(String[] args) {
//        Syntax / Compilation Error :
//        int a = 10  // Error :  no semicolon!
//        b = 10;  // Error :  'b' not declared!

//        Logical Error :
//        WAP to print all the even numbers from 1 to 10 :
        System.out.println("All the even numbers from 1 to 10 :");
        for(int i = 1; i <= 10; i++)
            if(i % 2 != 0)
                System.out.println(i);  // Prints odd numbers instead of even numbers.

//        Runtime Error / Exception :
//        System.out.println(100/0);  // Not divisible by 0.
    }
}
