import java.io.Console;
class TestConsole
{
public static void main(String ar[])
{
Console c=System.console();
System.out.print("Enter Your Name:");
String user=c.readLine();
System.out.print("Enter Password:");
char pass[]=c.readPassword();
String pass1=String.valueOf(pass);
System.out.print("User Name is="+user);
System.out.print("Password id="+pass);
}
}