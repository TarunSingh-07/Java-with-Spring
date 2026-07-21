// Static variable are shared by diffrent objects
// And if you want to refer to a static variable, you can use a class name.

package OOPs;

class Mobile{

// These are instance variable
    String brand;
    int price;
    static String name;

//if you created a variable inside a method that's LOCAL VARIABLE.
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
// you can use a static variable inside a static method, but you cannot use a non-static variable inside a static method.
// But if you have object reference, then you can use it
    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class staticMeth {
// main() is static so JVM can start program execution without creating an object of the class.
    public static void main(String[] args) {
        // System.out.println("Hello");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.name = "MacBook";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.name = "SmartPhone";
        obj2.price = 1000;

        // cannot make a static reference

// Imp :  you cannot call a non-static method with the help of a class name.
// Now if Java allowed: Mobile.show();
// Java would get confused: Which brand should it print? Apple or Samsung ? There is no object specified. That's why Java gives an error.
       
        // Mobile.show();

        obj1.show();
        obj2.show();

// So you can call a static method directly with the help of a class name.
        Mobile.show1(obj1);

    }
}
