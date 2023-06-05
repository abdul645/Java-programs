import java.util.*;
class Reverse
{
  public static void main(String arg[])
   {
     int num=4321,rem,rev=0;
   while(num!=0)
      { 
         rem=num%10;
         rev=rev*10+rem;
         num=num/10;
      }
       System.out.println(rev);
   }
}

