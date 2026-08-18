package AdvancedJava;

public class Exception_handling {
    public static void main(String[] args) {
        // int i = 4;   // Corrected the value of i to 4 to avoid division by zero error. Here also 0 and Byee will be printed as the output.
        int i = 0;      // Here we are trying to divide 18 by 0, which will throw an ArithmeticException. The try-catch block will catch this exception and print "Something went wrong...".
        int j = 0;

        try {
            j = 18/i;
        }
        catch(Exception e) {
            System.out.println("Something went wrong...");
        }

        System.out.println(j);
        System.out.println("Byee");
    }
}
