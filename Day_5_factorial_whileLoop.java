//Day 5 PROGRAM 5
// fibonacci series

import java.util.Scanner;
public class Day_5_factorial_whileLoop
{
    public static void main(String[] args)
    {
        int fact=1,a=1;

        Scanner read = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = read.nextInt();

        while(a<=num)
        {
            fact = fact *a;
            a++;
        }
        System.out.format("Factorial of %d is: %d",num,fact);   // format is same as printf
    }

}