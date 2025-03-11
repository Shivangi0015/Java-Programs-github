
// method overloading
public class Day7method3 {

    static void tell()
    {
        System.out.println("Hi User.");
    }

    static void tell(String a)
    {
        System.out.println("Hello, I am an overloaded method");
    }

    static void add(int a,int b)
    {
        System.out.println("sum:"+(a+b));
    }

    static void add(int a,int b,int c)
    {
        System.out.println("sum:"+(a+b+c));
    }


    public static void main(String[] s)
    {
        System.out.println("\nFollowing are some overloaded methods:");
        tell();
        tell("hi");
        add(5,7);
        add(1,2,3);
    }
}
