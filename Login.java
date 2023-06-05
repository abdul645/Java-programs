import java.awt.*;
class Login 
{
Frame f;
Label luser,lpass,ldate;
TextField tuser,tpass,tdate;
Checkbox Chshow;
Button blogin,bsignup,bchnpass,bforget;
Login()
{
f=new Frame();
f.setTitle("Login Form");
f.setSize(800,500);
f.setLayout(null);
f.setVisible(true);
f.setLocationRelativeTo(null);

luser=new Label("User Name :");
luser.setBounds(20,40,100,30);
f.add(luser);

tuser=new TextField();
tuser.setBounds(140,40,100,25);
f.add(tuser);

lpass=new Label("Password :");
lpass.setBounds(20,80,100,30);
f.add(lpass);

tpass=new TextField();
tpass.setBounds(140,80,100,25);
tpass.setEchoChar('*');
f.add(tpass);
 
Chshow=new Checkbox("Show Password");
Chshow.setBounds(140,100,100,30);
f.add(Chshow);

ldate=new Label("Date of Birth:");
ldate.setBounds(20,140,100,30);
f.add(ldate);

tdate=new TextField();
tdate.setBounds(140,140,30,20);
f.add(tdate);

tdate=new TextField();
tdate.setBounds(180,140,40,20);
f.add(tdate);

tdate=new TextField();
tdate.setBounds(230,140,40,20);
f.add(tdate);

blogin=new Button("Login");
blogin.setBounds(30,180,100,30);
f.add(blogin);

bsignup=new Button("Signup");
bsignup.setBounds(150,180,100,30);
f.add(bsignup);

bforget=new Button("Forget Password");
bforget.setBounds(270,180,100,30);
f.add(bforget);

bchnpass=new Button("Change Password");
bchnpass.setBounds(30,240,110,30);
f.add(bchnpass);
}
public static void main(String ar[])
{
new Login();
}
}

