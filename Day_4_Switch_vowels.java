import java.util.Scanner;
public class Day_4_Switch_vowels {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char alph = read.next().charAt(0);       // For Character input
        System.out.println("Let's check for vowel or consonant");

        switch (alph) {

            case 'a','e','i','o','u','A','E','I','O','U':    // case 1
            {
                System.out.println("This is a vowel");
                break;
            }
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
                 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y',
                 'Z':        // case 2
            {
                System.out.println("This is a consonant");
                break;
            }

            default:       // DEFAULT CASE
            {
                System.out.println("This is not a character");
            }
        }
    }
}

