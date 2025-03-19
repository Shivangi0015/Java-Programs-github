// FACTORIAL through recursion


import java.util.Scanner;

public class Day8recursion {
    static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fact(num - 1);   //num * (num-1)*(num-2)*(num-3)....
                                               //fact(5) = 5*fact(4)*fact(3)*fact(2)*fact(1);
                                               //fact(1) will return 1 ;
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any number less than 32: ");
        int n = read.nextInt();

        if (n > 31) {
            System.out.println("Invalid input. Factorial is not defined for numbers greater than 31.");
        } else {
            System.out.printf("%d! = %d ", n, fact(n));
        }
    }
}
