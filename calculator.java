//DAY 2 Program 2
// Calculator
import java.util.Scanner;
public class calculator {
    public static void main(String[] args)
    {
     Scanner ent = new Scanner(System.in);
     // entering two variables:
        System.out.println("Enter number one: ");
        int a = ent.nextInt();
        System.out.println("Enter second number:");
        int b = ent.nextInt();
        int sum = a+b;
        int difference = a-b;
        int product = a*b;
        int division = a/b;
        int mod = a%b;

        System.out.println("\nSum:"+sum);
        System.out.println("Difference:"+difference);
        System.out.println("Product:"+product);
        System.out.println("Division:"+division);
        System.out.println("Remainder:"+mod);
    }

}
