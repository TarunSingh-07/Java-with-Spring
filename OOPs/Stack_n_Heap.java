package OOPs;
class Calculator{
    int num;
    public int add(int n1, int n2){
        return n1+n2;
    }
}

public class Stack_n_Heap {
     public static void main(String [] args){
        Calculator cal = new Calculator();
        int r1 = cal.add(3, 4);
        System.out.println(r1);
    }
}

// Stack = LIFO
// Heap = 