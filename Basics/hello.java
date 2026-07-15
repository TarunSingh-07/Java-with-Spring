class hello {
    public static void main(String args[]) {
        int num1 = 3;
        int num2 = 4;
        int result = num1+num2;
        System.out.println(result);
        System.out.println("Hello world");

        byte by = 127; // 0 - 127
        short sh = 558;
        long l = 5854l;
        float f = 5.6f;
        double d = 5.8;
        boolean b = true;

        int num3 = 10_00_00_000;
        System.out.println(num3);

        char ch = 'a';
        ch++;
        System.out.println(ch);

        // Type conversion
        byte e = 127;
        System.out.println(b);
        int g = e;
        System.out.println(g);

        int h = 257;
        byte i = (byte) h;
        System.out.println(i);

        float j = 5.6f;
        int k = (int) j;
        System.out.println(k);

        // type promotion
        byte m = 10;
        byte n = 20;

        int result1 = m*n;
        System.out.println(result1);
        
    }
}

