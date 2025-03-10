import java.util.Scanner;
public class Day_6_2Darray_byUser {
    public static void main( String[] args)
    {
        int r,c,a,b;

        Scanner read = new Scanner(System.in);

        System.out.println("Enter no. of rows: ");
        a = read.nextInt();
        System.out.println("Enter no. of columns: ");
        b = read.nextInt();

        int [][]arr = new int[a][b];

        // Input Array Elements
        System.out.println("Enter Array elements: ");
        for(r=0;r<arr.length;r++)
        {
            for(c=0;c<arr[r].length;c++)
            {
                arr[r][c] = read.nextInt();
            }
        }

        // Displaying Array elements
        System.out.println("Array elements are : ");
        for(r=0;r<a;r++)       // out of bounds exception par yaha galti aa sakti hai so be careful
        {
            for(c=0;c<b;c++)    // out of bounds exception par yaha galti aa sakti hai so be careful
            {
                System.out.format("%d ",arr[r][c]);
            }
            System.out.print("\n");
        }

//Display using another method
//        System.out.println("ARRAY:");
//
//        for(r=0;r<arr.length;r++)  // out of bounds exception par yaha galti aa sakti hai so be careful
//        {
//            for(c=0;c<arr[r].length;c++)  // out of bounds exception par yaha galti aa sakti hai so be careful
//            {
//                System.out.format("%d ",arr[r][c]);
//            }
//            System.out.print("\n");
//        }

    }
}
