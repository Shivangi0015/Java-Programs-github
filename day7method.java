import java.util.Scanner;
public class day7method {


   int sum(int x, int y)  // Class  METHOD -sum
    {
        int a = x;
        int b =y;
        int add = x+y;
        System.out.println("sum: "+add);
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("\nNOTE- If the method is not static you'll have to make its object\n");
        day7method obj = new day7method();  // Class object

        // Taking inputs
        Scanner read = new Scanner(System.in);  //Scanner

        System.out.print("Enter First number: ");
        int x = read.nextInt();                  //First number
        System.out.print("Enter Second number: ");
        int y = read.nextInt();                 //Second number

        int c = obj.sum(x,y); // method called
    }
}
