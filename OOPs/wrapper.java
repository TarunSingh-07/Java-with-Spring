package OOPs;

public class wrapper {
    public static void main(String[] a) {
        int num = 9;
        Integer num1 = num; // autoboxing

        int num2 = num1; //auto-unboxing

        System.out.println(num2);

        String str = "15";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}
