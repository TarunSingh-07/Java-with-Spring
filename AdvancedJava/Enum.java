// Enum is a special class that represents a group of constants (unchangeable variables, like final variables).

package AdvancedJava;

enum Status {
    Running, Pending, Failed, Success      //If you've scenarion where you want to use set of constants then you can use enum. 
}

public class Enum {
    public static void main(String[] a) {
        
        Status s = Status.Pending;
        System.out.println(s);

        //Print all the values of the enum
        Status [] ss = Status.values();   //values() method returns an array containing all of the values of the enum in the order they are declared. 
        for(Status s1 : ss) {
            System.out.println(s1 + " : " + s1.ordinal());   //ordinal() method returns the position of the enum constant in the enum declaration, where the initial constant is assigned an ordinal of zero.
        }
    }
}
