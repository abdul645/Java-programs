import java.util.Scanner;
class TestScanner
{
public static void main(String arg[])
{
int a,b;
Scanner s1=new Scanner(System.in);
System.out.print("Enter a number+=");
a=s1.nextInt();
b=a*a;
System.out.print("the Square is="+ b);
}
}