// this program gives us average of marks in an array using for each loop

import java.util.Scanner;
public class Day_6_array2 {
    public static void main( String[] args)
    {
        int []arr = new int[6];

        System.out.println("Enter marks of 6 students in physics: ");
        Scanner read = new Scanner(System.in);

        int a,average,sum=0;
        // Inserting array elements
        for(a=0; a<arr.length;a++)
        {
            arr[a] = read.nextInt();
        }

        //Displaying array elements
//        for(a=0; a<arr.length;a++)
//        {
//            System.out.print(arr[a]+"\t");
//            sum = sum + arr[a];
//
//        }
//        average=sum/arr.length;
//
//        System.out.println("Average :" + average);


        // displaying average using for each loop
        for( int element:arr)
        {
            sum = sum + element;
        }
        System.out.println("average using for each loop: "+sum/arr.length);
    }
}
