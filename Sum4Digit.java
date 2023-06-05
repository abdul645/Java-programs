import java.util.*;
class Sum4Digit
{
  public static void main(String arg[])
   {
    int num=5678;
    int rem;
    int sum=0;
 while(num>0)
    {
      rem=num%10;
      sum=sum+rem;
      num=num/10;
     }
 System.out.print(sum);
    }
}