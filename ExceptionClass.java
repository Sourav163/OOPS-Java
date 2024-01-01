package OOPS_Concept_in_Java;

class MyException extends Exception {
    public String getMessage() {
//        return super.getMessage();
        return "I am getMessage()";
    }

    public String toString() {
//        return super.toString();
        return "I am toString()";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        try {
            throw new MyException();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Catch Finished");
        }
        System.out.println("End of Program");
    }
}
