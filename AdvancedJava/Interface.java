package AdvancedJava;


interface Alex {

    int age = 44;
    String area = "Mumbai";

    void show();    // All in interface are by default public, static and final.
    void config();  // Because of this, we cannot create an object of the interface. We can only create an object of the class that implements the interface.
}

class B implements Alex {
    public void show() {
        System.out.println("Show me");
    }
    public void config() {
        System.out.println("Congigure");
    }
}

public class Interface {
    public static void main(String[] args) {
        Alex obj;           // We can't create obj of Alex because it is an interface. We can only create an object of the class that implements the interface.
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(Alex.age);
        System.out.println(Alex.area);

    }
}