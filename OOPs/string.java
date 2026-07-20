public class string {
    public static void main(String[] args) {

        // String name = new String("Rohit");
        // System.out.println("Hello " + name);
        // System.out.println(name.charAt(1));
        // System.out.println(name.concat(" Amit"));

        // String s1 = "Abdul";
        // String s2 = "Abdul";
        // System.out.println(s1 == s2);

        //String Buffer

        StringBuffer sb = new StringBuffer("Arjun");
        sb.append(" Kanungo");

        sb.insert(6, "Java ");

        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}

// String Buffer is Thread safe & String Builder is not.