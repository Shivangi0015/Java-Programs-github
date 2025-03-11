
//VarArgs
public class Day7_VarArgs {

    static int add(int a,int b,int ...arr)        // 2 compulsory arguments
    {
        int sum=a+b;    // sum=0 if no compulsory arguments are used
        for(int element:arr)
        {
            sum=sum+element;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("\nThis is VarArgs program");
        System.out.println("Sum of integers: "+ add(4,5,5,6));
    }
}
