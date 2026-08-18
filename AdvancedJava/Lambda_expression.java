package AdvancedJava;


// Here it is using anonymous inner class to implement the add() method of the interface.
//     int add(int i, int j);
// }

// public class Lambda_expression {
//     public static void main(String[] args) {
//         Addition obj = new Addition() {
//             public int add(int i, int j) {
//                 return i+j;
//             }
//         };

//         int result = obj.add(5, 6);
//         System.out.println(result);

//     }
    
// }


// Using Lambda Expression

// Lambda expression works only with functional Interface.
interface Addition {
    int add(int i, int j);
}

public class Lambda_expression {
    public static void main(String[] args) {
        Addition obj = (i, j) -> i+j;

        int result = obj.add(5, 6);
        System.out.println(result);
    }
}
// Lambda expression = () -> { // body of the method }
