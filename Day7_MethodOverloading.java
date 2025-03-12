// prime numbers within given range

import java.util.Scanner;
public class Day7_MethodOverloading {

    static void display()
    {
        System.out.println("Hello, Welcome to java");
    }
    static void display(int a,int b)
    {
        //swaps incorrect range
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("The range is not appropriate");
            System.out.printf("Corrected range is: (%d, %d)\n", a, b);
        }

        for(int num=a;num<=b;num++)
        {
            int fact=1;
            for(int d=2;d<=b;d++)
            {
                if(num%d==0) {
                    fact++;
                }
            }
            if(fact==2 && fact<3)     // 1,the number and extra factor
            {
                System.out.println(num);
            }
        }
    }
  public static void main(String[] args)
  {
      Scanner read = new Scanner(System.in);
      System.out.println("Enter the starting and Ending no. :\n");

      int start = read.nextInt();
      int end = read.nextInt();

      display();

      System.out.printf("Prime numbers between %d and %d are:\n",start,end );
      display(start,end);     //prime no. method called
  }
}
