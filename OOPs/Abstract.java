package OOPs;

// If you have abstract methods in a class, then the class must be declared as abstract.

abstract class Car {
    public abstract void drive();   // Abstract method (does not have a body)
    public abstract void fly();     // Every abstract class must have at least one abstract method. 
                                    // If a class does not have any abstract method, then it can be declared as an abstract class.

    public void playMusic(){
        System.out.println("play music");
    }
}
// We have to implement all the abstract methods of the abstract class Car.
// Otherwise, we will get a compilation error. (Example: if we don't implement fly() in WagonR, we will get a compilation error.)
// So, to avoid that, WagonR must also be abstract if it doesn't implement all abstract methods.
// But we cannot create an object of an abstract class like WagonR.
abstract class WagonR extends Car {

    //either
    // public void fly(){
    //     System.out.println("Flying...");  // 
    // }

    public void drive(){
        System.out.println("Driving...");
    }
}
// We can create an object of the subclass UpdatedWagonR and assign it to a reference of the abstract class Car because we cannot create an object of the abstract class Car.
class UpdatedWagonR extends WagonR {
    //or
    public void fly(){
        System.out.println("Flying...");
    }
}

public class Abstract {
    public static void main(String[] args){
        Car obj = new UpdatedWagonR();   // Create an object of the subclass UpdatedWagonR and assign it to a reference of the abstract class Car because we cannot create an object of the abstract class Car.
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

// We can't create objects of abstract classes. 
// We can only create objects of concrete subclasses that extend the abstract class and implement all its abstract methods.