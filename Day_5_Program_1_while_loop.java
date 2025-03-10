// Day 5 Program 1 While loop
// print powers of 2 till 128

import java.util.Scanner;
public class Day_5_Program_1_while_loop {
    public static void main(String[] args) {
        int a = 2;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the last number: ");
        int num = read.nextInt();

        while (a <= num)
        {
            System.out.println(a);
            a = a * 2;
        }

    }
}