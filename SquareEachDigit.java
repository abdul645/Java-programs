//to print square of each digit of a number
import java.util.*;
class SquareEachDigit
{
  public static void main(String arg[])
   {
     int num,square,rem,rev=0;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter a number=");
     num=s.nextInt();
 while(num!=0)
   {
	rem=num % 10; 
	square=rem*rem; 
	System.out.print("Square is ="+square+ "\n");
	num=num / 10;
    }
  }
}
	
     