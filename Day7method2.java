import java.util.Scanner;

public class Day7method2 {
    // Even number identification method
    void even(int a, int b) {
        // Check if a is greater than b and swap if necessary
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("The range is not appropriate");
            System.out.printf("Corrected range is: (%d, %d)\n", a, b);
        }

        // Print even numbers in the corrected range
        System.out.printf("Even numbers between the range are: ");
        for (int c = a; c <= b; c++) {
            if (c % 2 == 0) {
                System.out.printf(c + "\t");
            }
        }
        System.out.println();  // For a newline after printing all even numbers
    }

    public static void main(String[] s) {
        Day7method2 ob = new Day7method2();
        System.out.print("Enter the range i.e. start and end integer: \n");
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int y = read.nextInt();

        ob.even(x, y);  // method called
    }
}
