// Method used for printing table

import java.util.Scanner;
public class mutiplication_table_of_n {


    static void table(int x)
    {

        for(int a=1;a<=10;a++)
        {
            int fact = a*x;
            System.out.printf("%d X %d = %d\n",x,a,fact);
        }
    }

    public static void main( String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter any number for its table: ");
        int num = read.nextInt();
        table(num);
    }

}
