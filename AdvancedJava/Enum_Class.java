package AdvancedJava;

enum Laptop {
    Macbook(2000), XPS(2200), Thinkpad, Dell(1800);

    private int price;

    private Laptop(){
        price = 500;
    }
    
    private Laptop(int price) {
        this.price = price;
        System.out.println("In laptop" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

}

public class Enum_Class {
    public static void main(String[] args) {
        // Laptop lap = Laptop.XPS;
        // System.out.println(lap);

        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
