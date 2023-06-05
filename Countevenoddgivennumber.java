// to find number is even or odd of a given number 
import java.util.*;
class Countevenoddgivennumber
{
  public static void main(String arg[])
   {
     	int num,rem,even_count=0,odd_count=0;
     	Scanner s=new Scanner(System.in);
     	System.out.print("Enter a number=");
     	num=s.nextInt();
   while(num>0)
        {  
          rem=num % 10; 
      if(rem % 2==0)
          {
            even_count++;
          }      
       else
          {
            odd_count++;
          }
       num=num/10;
        }
    
     System.out.print("Number of even number is="+even_count+ "\n");
     System.out.print("Number of odd number is="+odd_count);
  }

}
   