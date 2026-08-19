package AdvancedJava;

public class Exception_handling {
    public static void main(String[] args) {
        // int i = 4;   // Corrected the value of i to 4 to avoid division by zero error. Here also 0 and Byee will be printed as the output.
        int i = 2;      // Here we are trying to divide 18 by 0, which will throw an ArithmeticException. The try-catch block will catch this exception and print "Something went wrong...".
        int j = 0;

        String str = null;
        int nums[] = new int[5];

        try {
            j = 18/i;
            System.out.println((str.length()));
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e) {                        // This catch block will handle the ArithmeticException that occurs when dividing by zero.
            System.out.println("Cannot divide by zero" );
        }
        catch(ArrayIndexOutOfBoundsException e) {             // This catch block will handle the ArrayIndexOutOfBoundsException that occurs when trying to access an index that is out of bounds of the array.
            System.out.println("Stay in you're limit");
        }
        catch(Exception e) {                                  // This catch block will handle any other exceptions that are not specifically caught by the previous catch blocks.
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("Byee");
    }
}
