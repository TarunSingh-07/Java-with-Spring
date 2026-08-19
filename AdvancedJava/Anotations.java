package AdvancedJava;

class Air {
    public void show() {
        System.out.println("in Air show");
    }
}
class Water extends Air {
    @Override                       // It is an annotation that indicates that the method is intended to override a method in a superclass. It helps to catch errors at compile time if the method does not actually override a method in the superclass.
    public void show() {
        System.out.println("in Water show");
    }
}

public class Anotations {
    public static void main(String[] args) {
       Water obj = new Water();
       obj.show();
    }
}
