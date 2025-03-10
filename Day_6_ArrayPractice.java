//1. Array of 5 float numbers
//2.checking if given no. is present in an array

//import java.util.Scanner;
//public class Day_6_ArrayPractice {
//    public static void main( String s[])
//    {
//        float sum=0;
//
//        Scanner read = new Scanner(System.in);
//        System.out.println("Enter the 5 elements of array");
//
//        int a;
//        float [] arr = new float[5];
//        for(a=0;a<5;a++)
//        {
//            arr[a] = read.nextFloat();
//        }
//    //displaying elements
//        for(a=0;a<5;a++)
//        {
//            System.out.print(arr[a]+" +\t");
//            sum = sum + arr[a];
//        }
//
//        System.out.printf("\nSum = %f",sum);
//    }
//}

//Program 2

import java.util.Scanner;
public class Day_6_ArrayPractice {
    public static void main( String[] args)
    {
        int []arr= {1, 2, 3, 4, 5};        // given array

        Scanner read = new Scanner(System.in);
        System.out.println("Enter element to be searched: ");
        int f = read.nextInt();         // element to be searched

        int a;
        for( a=0; a<=arr.length ;a++)
        {
            if(f==arr[a])
            {
                System.out.printf("Element found at index %d", a);
                break;
            }

            if(f!=arr[a])
            {
                System.out.println("Element not in the array");
                break;

            }
        }
    }
}


