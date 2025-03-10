// Day 3 program 2
// WAP to calculate percentage of a given student in board exams of 5 subjects
import java.util.Scanner;
class Day_3_program_2 {
    public static void main( String[] args)
    {
       Scanner data = new Scanner(System.in);
        System.out.println("Enter English marks: ");
        float eng = data.nextFloat();

        System.out.println("Enter Maths marks: ");
        float maths = data.nextFloat();

        System.out.println("Enter Chemistry Marks: ");
        float chem = data.nextFloat();

        System.out.println("Enter Physics marks: ");
        float phy =  data.nextFloat();

        System.out.println("Enter biology marks: ");
        float bio =  data.nextFloat();

        float sum = eng+ phy+ maths+ bio+ chem;
        float average = (sum/5);

        System.out.println("Percentage :"+average+"%");
    }
}
