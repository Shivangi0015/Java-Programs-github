// If else
// switch statement

import java.util.Scanner;
public class Day_4_conditionals {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = read.nextInt();
        System.out.println("Let's see if you are eligible for driving license");

        if (age < 16) {
            System.out.println("OOPS,You are not eligible for Learning License");
        } else if (age == 16 || age == 17) {
            System.out.println("Yay,You are eligible for Learning License");
        } else {
            System.out.println("Yay,You are eligible for Driving License");
        }
    }
}
    // SWITCH STATEMENT
    // switch statement

