//dynamic array

import java.util.Scanner;
public class tt1 {
    public static void main(String[]args)
    {
        int size,i;

        Scanner r = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        size = r.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the elements:");
        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Entered element:");

        for (i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }
    }

}