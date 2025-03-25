public class Parsing {
    public static void main(String[] args) {
        String s = "90";
        String n = "78";
        int a = Integer.parseInt(s); // converts one data type to another (but it must be valid i.e, hello cannot be converted into an integer)
        int b = Integer.parseInt(n);
        int c = a + b;
        System.out.println(c);
    }
}

