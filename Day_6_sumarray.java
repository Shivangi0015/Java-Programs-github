//WAP to add two matrices of order 2x3
// summing two arrays

import java.util.Scanner;
public class Day_6_sumarray {
    public static void main( String[] args)
    {
        Scanner read = new Scanner(System.in);
        int [][]arr= new int[2][3];    // array 1
        int [][]arr2= new int[2][3];   // array 2
        int [][]sumarr=new int[2][3];  // sum array

       //  input elements of array 1
        System.out.println("Enter elements of array 1");
        for(int a=0; a<arr.length;a++)
        {
            for(int b=0; b<arr[a].length; b++)
            {
                arr[a][b] = read.nextInt();
            }
        }

        //  input elements of array 2
        System.out.println("Enter elements of array 2");
        for(int a=0; a<arr.length;a++)
        {
            for(int b=0; b<arr[a].length; b++)
            {
                arr2[a][b] = read.nextInt();
            }
        }

        // sum array
        for(int a=0; a<arr.length;a++)
        {
            for(int b=0; b<arr[a].length; b++)
            {
                sumarr[a][b] = arr2[a][b] +arr[a][b];
            }
        }

        // displaying sum array
        System.out.println("Summing both arrays");
        for(int a=0; a<arr.length;a++)
        {
            for(int b=0; b<arr[a].length; b++)
            {
                System.out.print(sumarr[a][b]+"\t");
            }
            System.out.println();
        }


//        for(int[] element:arr)
//        {
//            arr[][] = read.nextInt();
//        }



    }
}
