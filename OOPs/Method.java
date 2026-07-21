package OOPs;
// class Computer {

//     public void playMusic() {
//         System.out.println("Music Playing");
//     }

//     public String getMeAPen(int cost) {
//         if(cost >= 10)
//              return "Pen";
//         else
//             return "Nothing";

//     }
// }


// public class Method {
//     public static void main(String[] args) 
//     {
//         Computer obj = new Computer();
//         obj.playMusic();
//         String str =  obj.getMeAPen(2);
//         System.out.println(str);
//     }
// }

// Method Overloading
class Calculator{
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2){
        return n1+n2;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class Method{
    public static void main(String [] args){
        Calculator cal = new Calculator();
        int r1 = cal.add(3, 4);
        System.out.println(r1);
    }
}
