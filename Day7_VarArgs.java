
//VarArgs
public class Day7_VarArgs {

    static int add(int ...arr)
    {
        int sum=0;
        for(int element:arr)
        {
            sum=sum+element;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("\nThis is VarArgs program");
        System.out.println("Sum of integers: "+add(4,5,5,6));
    }
}
