//to print sum all even and odd digit of a number d
import java.util.*;
class Sumevenodddigit
{
  public static void main(String arg[])
    {
	int num,rem,even_sum=0,odd_sum=0;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter a number=");
	num=s.nextInt();
   while(num>0)
	{
	  rem=num % 10;
          
            if(rem%2==0)
		{
		   even_sum=even_sum + rem;
		}
	    else
		{
		  odd_sum=odd_sum + rem;
		}
	    num=num/10;
	 }
	    System.out.print("Sum of even numberis ="+even_sum+"\n");
	    System.out.print("Sum of odd numberis ="+odd_sum);
      }
}