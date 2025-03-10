// Day 5 PROGRAM 3
// Sum of digits

import java.util.Scanner;
public class Day_5_SumOfDigits_whileLoop {
    public static void main( String[] args)
    {
        System.out.print("Enter the number: ");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();   // Enter the number

        int sum = 0;
        int rem = 0;

        while(num!=0)
        {
            rem = num % 10;
            num = num/10;
            sum = sum+rem;
        }

        System.out.printf("Sum of Digits: %d ",sum);
    }

}
