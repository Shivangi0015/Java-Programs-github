// Day 5 PROGRAM 4
// Reverse of a number

import java.util.Scanner;
public class Day_5_ReverseOfNumber_whileLoop {
    public static void main( String[] args)
    {
        int rem =0, reverse =0;
        Scanner read = new Scanner( System.in);
        System.out.println("\nThe number should not exceed 10 digits");
        System.out.print("Enter any number: ");
        int num = read.nextInt();     // Enter number

        while(num!=0)
        {
            rem = num%10;
            num =num/10;
            reverse= (reverse*10)+rem;
        }
          System.out.println("Reverse :"+ reverse);
    }
}
