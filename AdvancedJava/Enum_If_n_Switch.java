package AdvancedJava;

enum Status1 {
    Running, Pending, Failed, Success;
}

public class Enum_If_n_Switch {
    public static void main(String[] args) {
        Status v = Status.Failed;
        System.out.println(v.getClass().getSuperclass());


        // Using switch statement to check the value of enum
        switch(v) {
            case Running:
                System.out.println("Good");
                break;
            case Failed:
                System.out.println("Here we failed");
                break;
            case Pending:
                System.out.println("We need to hurry");
                break;
            default:
                System.out.println("Done");
        }

        // using if-else statement
        if (v == Status.Running) {
            System.out.println("Good");
        }
        else if(v == Status.Failed) {
            System.out.println("Here we failed");
        }
        else if(v == Status.Pending) {
            System.out.println("We need to hurry");
        }
        else {
            System.out.println("Done");
        }
    }

}
