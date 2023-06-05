import java.util.*;
class GreaterBtwTwoNumber
{
  public static void main(String arg[])
    {
	int n1,n2;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter two number=");
	n1=s.nextInt();
	n2=s.nextInt();
     if(n1>n2)
	{
	  System.out.print("Greater number is ="+n1);
	}
      else
	{
	  System.out.print("Greater number is="+n2);
	}
     }
}