// Factorial of large integers

import java.math.BigInteger;
import java.util.Scanner;

public class bigInteger  {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = read.nextInt();

        BigInteger factorial = BigInteger.ONE;    // just like int factorial = 1
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.printf("%d! = %d",n,factorial);
    }
}

