// to check number is single,two,three,four digit number
import java.util.*;
class Check1234DigitNumber
{
   public static void main(String arg[])
	{ 
	  int num;
	  Scanner s=new Scanner(System.in);
	  System.out.print("Enter a number=");
 	  num=s.nextInt();
   if(num>=0 && num<=9)
     {
       System.out.print(num+ "=is the one digit number");
     }
       else if(num>=10 && num<=99)
	  {
	     System.out.print(num+"=is the two digit number");
	  }
       else if(num>=100 && num<=999)
	 {
	     System.out.print(num+"=is the three digit number");
	 }
       else if(num>=1000 && num<=9999)
	 {
	     System.out.print(num+"=is the four digit number");
	 }
    else
      {
       System.out.print(num+"=is more than four digit number");
      }
   }
}