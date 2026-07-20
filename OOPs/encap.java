// class Human {
//     private int age = 11;
//     private String name = "David";


//     public int getAge() {
//         return age;
//     }
//     public String getName() {
//         return name;
//     }

// }

class Human {
    private int age ;
    private String name ;

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
       age = a;
    }
    public String getName() {  
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class encap {

    public static void main(String[] args) {

        // Human obj = new Human();
        // System.out.println(obj.getName() + " : " + obj.getAge());
        
        Human obj = new Human();
        obj.setAge(12);
        obj.setName("Vardhan");
        System.out.println(obj.getName() + ": " + obj.getAge());

    }
}
