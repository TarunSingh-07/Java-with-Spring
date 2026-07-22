package OOPs;

class Aa {
    public void show() {
        System.out.println("in A show");
    }
}

class Bb extends Aa {
    public void show() {
        System.out.println("in B show");
    }
}

class Cc extends Aa {
    public void show() {
        System.out.println("in C show");
    }
}

public class Dynamic_Meth {
    public static void main(String[] args) {

        // Aa obj = new Bb();
        // obj.show();
        Aa obj = new Aa();
        obj.show();

        obj = new Bb();
        obj.show();

        obj = new Cc();
        obj.show();
    }
}