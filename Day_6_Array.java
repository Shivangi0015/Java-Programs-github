// Array by user

import java.util.Scanner;
public class Day_6_Array {
    public static void main( String[] args)
    {
        // size of array
        int n;
        System.out.print("Enter size of array: ");
        Scanner read = new Scanner(System.in);
        n = read.nextInt();

       int arr[] = new int[n]; // declaration and initialization
        // can also be written as : int []arr = new int[n]

        System.out.println("Enter array elements: ");

        // inserting array elements
        for (int a=0;a<=arr.length-1;a++)       // we can also write n-1 instead of arr.length-1
        {
             arr[a]= read.nextInt();
        }

        // Displaying elements
        System.out.println("elements are: ");
        for (int a=0;a<=arr.length-1;a++)
        {
            System.out.println(arr[a]);
        }

        // Displaying elements in reverse
        System.out.println("Reverse array: ");
        for (int a=arr.length-1;a>=0;a--)
        {
            System.out.println(arr[a]);
        }

        // printing LENGTH of array
        System.out.println("Length of array is : " + arr.length);

        // Displaying elements using for each array
        System.out.println("Displaying elements using for each array");
        for(int element:arr)
        {
            System.out.println(element);
        }
    }
}
