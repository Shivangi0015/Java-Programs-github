
import java.util.Scanner;
public class Day_2_average {

    public static void main( String[] args)
    {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter marks of English:");
        float sub1 = read.nextFloat();

        System.out.println("Enter marks of Maths:");
        float sub2 = read.nextFloat();

        System.out.println("Enter marks of Physics:");
        float sub3 = read.nextFloat();

        System.out.println("Enter marks of Chemistry:");
        float sub4 = read.nextFloat();

        System.out.println("Enter marks of Biology:");
        float sub5 = read.nextFloat();

        float sum = sub1 +sub2 +sub3 + sub4 +sub5;
        float average = sum/5;
        System.out.format("Average : "+average);
    }
}
