// Day 5 PROGRAM 2
// count digits of a number

import java.util.Scanner;
public class Day_5_count_numbers_whileLoop {
    public static void main( String[] args)
    {
        int digits = 0;
        Scanner read = new Scanner( System.in);
        System.out.print("Enter the number: ");
        int num = read.nextInt();           // Enter the number

        //Counting the digits of the number

        while(num!=0)
        {
            num= num/10;
            digits= digits + 1;
        }
        System.out.println("Total digits: "+ digits);
    }
}
