//Day 5 PROGRAM 5
// fibonacci series

import java.util.Scanner;
public class Day_5_fibonacciSeries_whileLoop {
    public static void main(String[] args)
    {
        int a=0,b=1,c=0;

        Scanner read = new Scanner(System.in);
        System.out.println("Enter any number within/upto which fibonacci will be printed: ");

        int num = read.nextInt();

        while(c<=num)
        {
            System.out.print("\t"+c);// swapping a and b and c
            a = b;
            b = c;

            c = a+b;

        }

    }

}
