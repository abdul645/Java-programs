// to check number is armstrong or not
import java.util.*;
class Armstrong
{
  public static void main(String arg[])
   {
     int num,t1=num,length=0;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter a number=");
     num=s.nextInt();
 while(t1!=0)
     {
       
       length=length+1;
       t1=t1/10;
      }
           int t2=num;
           int arm=0,rem;
    while(t2!=0)
	{
	  int i,multi=1;
	  rem=num % 10;
	for(i=1;i<=length;i++)
	  {
	     multi=multi*rem;
	  }
             arm=arm+multi;
             t2=t2/10;
	}
      if(arm==0) 
          {
		System.out.print(num+" is armstrong number");
	   }
       else
	  {
		System.out.print(num+" is not a armstrong numer");
	   }
    }
} 