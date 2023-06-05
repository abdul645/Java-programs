import java.util.*;
class ReverseByUser
{
  public static void main(String arg[])
   {
     int num,rem,rev=0;
     System.out.print("Enter a number=");
     Scanner s=new Scanner(System.in);
     num=s.nextInt();
  while(num!=0)
    {
      rem=num % 10; 
      rev=rev * 10+rem; 
      num=num / 10;  
    }
	System.out.print(rev);
   }
}