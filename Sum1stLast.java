import java.util.*;
class Sum1stLast
{
 public static void main(String arr[])
  { 
    int num,firstdigit,lastdigit,sum;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number=");
    num=s.nextInt();
    lastdigit=num % 10;
    firstdigit=num;
 while(firstdigit>=10)
     {
       firstdigit=firstdigit/10;
       
      }
     System.out.println("firstdigit="+firstdigit);
     System.out.println("lastdigit="+lastdigit);
    // sum=firstdigit + lastdigit;
     System.out.println("sum is="+(firstdigit+lastdigit));
   }
}
    