//WAP to calculate the age of a person and display it in the form of year, month and days

import javax.xml.transform.Source;
import java.util.Scanner;
public class clg_class {
    public static void main( String[] args)
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int year = read.nextInt();

        System.out.println("Enter your month of birth: ");
        int month = read.nextInt();

        System.out.println("Enter your day of birth: ");
        int day = read.nextInt();

        // today
        System.out.println("Enter the current year: ");
        int tyear = read.nextInt();

        System.out.println("Enter the current month: ");
        int tmonth = read.nextInt();

        System.out.println("Enter the current day: ");
        int tday = read.nextInt();

        int age_year,age_month, age_day;

        if(month<tmonth)
        {
            age_year = (tyear - year)-1;
            System.out.println("years:"+age_year);
        }
        else
        {
            age_year = (tyear - year);
            System.out.println("years:"+age_year);
        }
//month
        if(month<tmonth)
        {
            age_month = ( 12-month)+(tmonth-1);
            System.out.println("month:"+age_month);
        }
        else if (month>=tmonth)
        {
            age_month = tmonth - month;
            System.out.println("month:"+age_month);
        }
        else
        {
            age_month = ( 12-month)+(tmonth-1);
            System.out.println("month:"+age_month);
        }
//day
        if(day>tday)
        {
            age_day = day-tday;
            System.out.println("days:"+ age_day);
        }
        else if (tday>=day)
        {
            age_day = tday-day;
            System.out.println("days:"+ age_day);
        }
        else {
            age_day = day-tday;
            System.out.println("days:"+ age_day);

        }

        System.out.printf("\nAge: %d years %d months %d days",age_year,age_month,age_day);
    }

}
