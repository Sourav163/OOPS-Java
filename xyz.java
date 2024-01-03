package OOPS_Concept_in_Java;

import java.util.Arrays;

public class xyz {
    public static void main(String[] args) {
        int num = 1234; // the integer to convert
        String str = Integer.toString(num); // convert the integer to a string
        char[] chars = str.toCharArray(); // convert the string to an array of characters
        int[] digits = new int[chars.length]; // create an array of integers with the same length as the character array
        for (int i = 0; i < chars.length; i++) {
            digits[i] = Character.getNumericValue(chars[i]); // convert each character to its numeric value and store it in the integer array
        }
    }
}
