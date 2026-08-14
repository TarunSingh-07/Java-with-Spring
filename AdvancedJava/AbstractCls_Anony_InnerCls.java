package AdvancedJava;

// abstract class A {
//     public abstract void show();
// }

// class B extends A {

//     public void show() {
//         System.out.println("in B Show");   //Here we use this only once, So whynot we create an Anonymous inner class instead
//     }

// }

// public class AbstractCls_Anony_InnerCls {
//     public static void main(String a[]) {
//         A obj = new B();
//         obj.show();

//     }
// }

abstract class A {
    public abstract void show();
}

public class AbstractCls_Anony_InnerCls {
    public static void main(String a[]) {
        A obj = new A()
        {
            public void show() {                //So if you want to implement the interface or the abstract class only once then you can use anonymous in a class.
                System.out.println("in B Show");  
            }
        };
        obj.show();

    }
}
