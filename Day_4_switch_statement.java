// switch statement

import java.util.Scanner;
public class Day_4_switch_statement {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = read.nextInt();
        System.out.println("Let's see if you are eligible for driving license");

        switch (age) {

            case 14:
            {
                System.out.println("OOPS,You are not eligible for Learning License");
                break;
            }
            case 16, 17:
            {
                System.out.println("Yay,You are eligible for Learning License");
                break;
            }

            case 18, 19:
            {
                System.out.println("Yay,You are eligible for Driving License");
                break;
            }

            default:
            {
                System.out.println("Age not specified");
            }
        }
    }
}
