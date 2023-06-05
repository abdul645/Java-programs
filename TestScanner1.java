//using Scanner class

import java.util.*;
class TestScanner1
{
 public static void main(String arg[])
  {
    Scanner s=new Scanner(System.in);
    int a,b;
    System.out.print("Enter a number=");
    a=s.nextInt();
    b=a*a;
    System.out.print("The square is="+b);
   }
}