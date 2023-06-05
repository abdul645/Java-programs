import java.util.*;
class CircleArea
{
  public static void main(String arg[])
   {
     int r;
     float pi=22/7f,area;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter radius of circle=");
     r=s.nextInt();
     area=(22*r*r)/7;
     System.out.print("Area is ="+area);

   }
}
