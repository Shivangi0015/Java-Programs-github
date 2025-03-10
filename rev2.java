// the student passes when the percentage is more than 40%
// and when in every subject the marks are more than 33%

import java.util.Scanner ;
public class rev2 {
    public static void main(String[] args)
    {
              // average of sub 1,2,3
        Scanner read = new Scanner(System.in);
        System.out.println("Enter English marks: ");
        float sub1 = read.nextFloat();
        System.out.println("Enter Maths marks: ");
        float sub2 = read.nextFloat();
        System.out.println("Enter Science marks: ");
        float sub3 = read.nextFloat();

        float sum = sub1 + sub2 + sub3;
        float percentage = sum / 3;

        if (sub1 > 33 && sub2 > 33 && sub3 > 33 && percentage > 40)
        {
            System.out.println("The student has passed");
        }
        else
        {
            System.out.println("The student has failed");
        }
    }
}

