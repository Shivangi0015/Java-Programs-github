// sum of n numbers using recursion

import java.util.Scanner;
public class Day9recursion_sum
{
    int sum( int num )         //method
    {
        if (num==0)
        {
        return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else {
            return num + sum(num - 1);         // recursion
        }
    }

    public static void main( String[] args)
    {
        Day9recursion_sum obj = new Day9recursion_sum();   // class object

        Scanner read = new Scanner(System.in);
        System.out.println("Enter any to number to print sum of numbers upto it : ");
        int n = read.nextInt();                    // user input

        System.out.printf("Sum of no.s upto %d is: %d",n,obj.sum(n));   // method called

    }
}
