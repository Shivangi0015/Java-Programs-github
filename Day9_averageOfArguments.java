// program to print average of n Arguments


public class Day9_averageOfArguments
{
    static double Average(int a, int b, int... n) {

        int sum = a + b;
        for (int element : n)
        {
            sum = sum + element;
        }
        return (double) sum / (2 + n.length);
    }

    public static void main(String[] args) {
        System.out.println("Average of numbers is: " + Average(6, 7, 8));
    }
}
