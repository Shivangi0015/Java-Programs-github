// DAY 3
// can vote or not using if else
import java.util.Scanner;
class Practice
 {
    public static void main(String[] args )
    {
         Scanner ent = new Scanner(System.in);
         System.out.print("\nEnter the age: ");
         int age = ent.nextInt();  // age

         System.out.println("Enter name of the person: ");
         String name = ent.next();    // name

         System.out.println("Name:"+name);

         if(age >=18){
             System.out.println("The person can vote ");
         }
         else {
             System.out.println("The person cannot vote");
         }
         }
    }


