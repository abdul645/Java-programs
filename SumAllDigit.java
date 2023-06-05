//to print sum of all digit of a number
import java.util.*;
class SumAllDigit
{
  public static void main(String arg[])
   {
	int num,rem,sum=0;
	System.out.print("Enter a number=");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
    while(num!=0)
	{
	  rem=num % 10;
	  sum=sum+rem;
	  num=num/10;
	}
	System.out.print(sum);
     }
}
