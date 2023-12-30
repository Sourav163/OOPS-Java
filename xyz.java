package OOPS_Concept_in_Java;

import java.util.Arrays;

public class xyz {
    public static void main(String[] args) {
        String[] bookNames = {
                "1984",
                "Brave New World",
                "Fahrenheit 451",
                "The Catcher in the Rye",
                "To Kill a Mockingbird",
                "The Great Gatsby",
                "The Hobbit",
                "Pride and Prejudice",
                "The Lord of the Rings",
                "The Hunger Games",
                "The Da Vinci Code",
                "The Chronicles of Narnia",
                "Moby-Dick",
                "War and Peace",
                "One Hundred Years of Solitude",
                "The Shining",
                "The Hitchhiker's Guide to the Galaxy",
                "The Grapes of Wrath",
                "Sapiens: A Brief History of Humankind"
        };
        Arrays.sort(bookNames);
        System.out.println("\nAvailable Books :");
        int i = 1;
        for (String book: bookNames) {
            System.out.println("\t" + i + ". " + book);
            i+=1;
        }
    }
}
