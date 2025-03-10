public class rev3 {
    public static void main( String[] s)
    {
        int[] marks ={2,3,4,5,6};  //array 1
        System.out.println("length of array 1: "+marks.length);

        int [] marks2 ={2,3,6,5,7};  // array 2
        System.out.println("length of array 2: "+marks2.length);

  // SUM ARRAY
        int []sum = new int[5];
        for (int a=0; a<marks.length; a++)
        {
            sum[a] = marks[a]+marks2[a];
        }

//    Displaying elements of sum array
        for (int element : sum)
        {
            System.out.println(element);
        }

    }
}