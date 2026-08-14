// need of Interface in java
package AdvancedJava;

interface Computer {
    void code();
}
class Laptop implements Computer {
    public void code() {
        System.out.println("Code, Compile, Run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code. compile, run: Faster");
    }
}
// Developer class is dependent on Computer interface. It is not dependent on Laptop or Desktop class. So if we want to add another class like Tablet, we don't need to change the Developer class. We can just create a new class Tablet that implements Computer interface and the Developer class will work with it without any changes.
class Developer {
    public void devApp(Computer box) {
        box.code();
    }
}

public class Interface_2 {
   public static void main(String[] args) {
    Computer lap = new Laptop();  // It is interface reference variable.
       Computer desk = new Desktop();

       Developer Eq = new Developer();
       Eq.devApp(lap);
   }
}
