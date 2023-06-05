//wap to check smallest among three number
import java.util.*;
class LargestAmong3Number
{
  public static void main(String arg[])
    {
	int n1,n2,n3;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter Three number:");
	n1=s.nextInt();
	n2=s.nextInt();
	n3=s.nextInt();
    if(n1>n2 && n1>n3)
	{
	  System.out.print(n1+" is the largest number");
	}
    else if(n2 > n1 && n2 > n3)
	{
	  System.out.print(n2+" is the largest number");
	}
    else
	{
	  System.out.print(n3+" is the largest number");
	}
     }
}