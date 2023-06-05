//by command line only one argument can print

class SquareByCLA
 {
  public static void main(String arg[])
   {
    int a,b;
    a=Integer.parseInt(arg[0]);
    b=a*a;
    System.out.print("The square is ="+b);
     
    }
 }