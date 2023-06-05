//to check is year leap or not
import java.util.*;
class LeapYear
{
  public static void main(String arg[])
   {  
        int year;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter a year:");
	year=s.nextInt();
    if((year % 400==0) || (year % 4==0 && year % 100!=0))
       {
	 System.out.print(year+" is leap year");
	}
    else
	{
	  System.out.print(year+" is not a leap year ");
	}
    }
/