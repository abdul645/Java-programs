// to calculate factorial of a number
import java.util.*;
class Factorial
{
  public static void main(String arg[])
   {
	int num,i,fact=1;
	System.out.print("Enetr a number=");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
  for(i=1;i<=num;i++)      //or for(i=num;i>=1;i--)
	{
	  fact=fact*i;
	}
    System.out.print(fact);
    }
}
	