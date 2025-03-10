// Printing Maximum number in an array
// ye program maine khud banaya

import java.util.Scanner;
public class Day_6_MaxNoInArray {

    public static void main(String[] args)
    {
        System.out.println("Enter size of array: ");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();     // size of array

        int []arr = new int[n];

        // input array elements
        System.out.println("Enter elements of array");
        for(int a=0; a<arr.length; a++)
        {
            arr[a]=read.nextInt();
        }

        System.out.println("Array is :");
        int max=arr[0];
        //Displaying array
        for(int a=0; a<arr.length-1; a++)    // ye array ek index kam tak chalegi DSA me padha tha  kyunki last element ko khud se to compare karenge nahi
        {
            System.out.print(arr[a] + "\t");  //

            for(int b=1;b<arr.length;b++)    // this loop is for comparing numbers
            {

                if(max<arr[b])
                    {
                        max=arr[b];
                    }
            }
        }


        System.out.println("\nMaximum number in the array is "+ max);

    }
}
