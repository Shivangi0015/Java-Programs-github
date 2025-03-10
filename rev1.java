// this is a comment

import java.util.Scanner;
public class rev1 {
    public static void main( String[] args)
    {
        // Java Intro
       System.out.println("\nJava is made up of functions and classes");
       System.out.println("Java = Functions + Classes");
       System.out.println("Classes ---->Pascal naming convention");
       System.out.println("Functions ----> Camelcase naming convention\n");

       // Adding three numbers
       Scanner read = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = read.nextInt();         //num1
        System.out.println("Enter Second number:");
        int num2 = read.nextInt();         //num2
        System.out.println("Enter third number:");
        int num3 = read.nextInt();         //num3

        int result = num1+num2+num3;

        System.out.printf("Sum = %d ",result);


        //Boolean Data Type
        boolean val = result>=10;
        System.out.println(val); // if result>10 prints true else false

        // checking if entered number is integer
        System.out.println("Enter any number ");
        boolean check = read.hasNextInt();  // enters and processes if no. is integer
        System.out.print("Checking whether you gave integer input: ");
        System.out.println(check);


    }
}
