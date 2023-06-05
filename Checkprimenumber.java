// to check given number is prime or not
import java.util.*;
class Checkprimenumber
{
  public static void main(String arg[])
   {
     int num,temp=0,i;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter a number=");
     num=s.nextInt();
for(i=2;i<=num-1;i++)
     {
    if(num%i==0)
      {
        temp=temp+1;
      }
     }
  if(temp==0)
      {
        System.out.print(num+" is a prime number");
      }
  else
      {
        System.out.print(num+" is not a prime number");
      }
   }
}