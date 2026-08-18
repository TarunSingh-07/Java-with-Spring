package AdvancedJava;

interface Joker {
    void show(int i);
}

public class Functional_interface {
    public static void main(String[] args) {
        Joker obj = (int r) -> System.out.println("Circus" + ": " + r);
        // Joker obj = r -> System.out.println("Circus" + ": " + r);  // We can also write it like this, as the type of the parameter can be inferred from the context.

        obj.show(5);                                                      
    }                                                                       
}

// It is a lambda expression that implements the show() method of the Joker interface. The lambda expression takes an integer parameter r and prints "Circus: " followed by the value of r.
// Lambda expression = () -> { // body of the method }
