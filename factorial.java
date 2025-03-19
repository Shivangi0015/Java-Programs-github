// Factorial

import java.util.Scanner;
public class factorial{

    public static void main(String[] args)
    {
        System.out.println("\nFactorial program");
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any number less than 32: ");
        int num = read.nextInt();

        if (num > 31) {
            System.out.println("Invalid input. Factorial is not defined for numbers greater than 31.");
        }

        else {
            int fact = 1;

            for (int a = 1; a <= num; a++) {
                fact = fact * a;
            }

            System.out.printf("Factorial of %d is %d\n", num, fact);
        }
    }
}
