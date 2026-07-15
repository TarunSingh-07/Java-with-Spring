public class Demo {
    public static void main(String[] args) {
        int x = 18;

        if(x > 10 && x <= 20){   
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        // Ternary example

        int n = 5;
        int result = 0;

        // normal conditional use
        // if(n%2 == 0)
        //     result = 10;
        // else 
        //     result = 20;

        result = n%2 == 0 ? 10 : 20;
        System.out.println(result);

        // switch case
        int t = 1;

        switch(t){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid number");
        }
     
    }
}