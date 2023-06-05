//to print fibonacci series
import java.util.*;
class Fibonacci
{
 public static void main(String arg[])
  {
      int num,i,a=0,b=1,c;
      Scanner s=new Scanner(System.in);
      System.out.print("Enetr a number=");
      num=s.nextInt();
      System.out.print(a+" "+b);

for(i=1;i<=num;i++)
    {
	c=a+b;
	System.out.print(" "+c);
	a=b;
	b=c;
     }
  }
}