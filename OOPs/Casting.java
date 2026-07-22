package OOPs;

class AA {
    public void show1() {
        System.out.println("in A show");
    }
}
class BB extends AA{
    public void show2() {
        System.out.println("in B show");
    }
}

public class Casting {
    public static void main(String[] args) {
        // double d = 4.5;
        // int i = (int) d;
        // System.out.println(i);

        //Upcasting
        AA obj = new BB();
        obj.show1();

        //Downcasting
        BB obj1 = (BB) obj;
        obj1.show2();
    }
}
