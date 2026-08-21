package AdvancedJava;

public class Exception_throw {
    public static void main(String[] args) {
        int i = 20;      // Here we are trying to divide 18 by 0, which will throw an ArithmeticException. The try-catch block will catch this exception and print "Something went wrong...".
        int j = 0;

        String str = null;
        int nums[] = new int[5];

        try {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("I dont want to print zero");    // Throw keyword is used to ecplicitly throw the exception and the catch block will catch this exception.
        }
        catch(ArithmeticException e) {
            j= 18/1;
            System.out.println("That's the deafault output" + e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("Byee");
        
    }
}
