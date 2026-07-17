package OOPs;

class Calculator 
{
    public int add(int a, int b) 
    {
        int r = a+b;
        return r;
    }
}

public class class_n_obj 
{
    public static void main(String[] args)
    {
        int num1 = 4;
        int num2 = 6;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);
        System.out.println(result);

    }
}
