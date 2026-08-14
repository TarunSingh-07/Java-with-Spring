package AdvancedJava;

class Aa {
    public void shows() {
        System.out.println("Show...");
    }
}

public class Anonym_InnerClass {
    public static void main(String[]args) {
        Aa obj = new Aa() 
        // Anonymous inner class - Its a class without a name. It is used to override the method of class Aa.
        {
            public void shows() {    
                System.out.println("Showinggg...");
            }
        };
        obj.shows();   // It will call the new shows() method of the anonymous inner class instead of the shows() method of the class Aa.
        
    }

}
