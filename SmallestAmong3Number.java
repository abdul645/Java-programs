//wap to check smallest among three number
import java.util.*;
class SmallestAmong3Number
{
  public static void main(String arg[])
    {
	int n1,n2,n3;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter Three number:");
	n1=s.nextInt();
	n2=s.nextInt();
	n3=s.nextInt();
    if(n1<n2 && n1<n3)
	{
	  System.out.print(n1+" is the smallest number");
	}
    else if(n2 < n1 && n2 < n3)
	{
	  System.out.print(n2+" is the smallest number");
	}
    else
	{
	  System.out.print(n3+" is the smallest number");
	}
     }
}