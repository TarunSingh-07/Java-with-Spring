package AdvancedJava;

class AI {

    int age;

    public void show() {
        System.out.println("in show");
    }

    class B {
        public void config() {
            System.out.println("in config");
        }
    }

}

public class InnerClass {
    public static void main(String[] a) {

        AI obj = new AI();
        obj.show();

        AI.B obj1 = obj.new B();
        obj1.config();
    }

}
