import java.awt.*;
class Form
{
Frame f;
Label lfirst,llast,lDOB,lfather,lmother,lmail,lphone;
TextField tfirst,tlast,tDOB,tfather,tmother;
Checkbox chshow;
Button bsubmit;
Form()
{
f=new Frame();
f.setTitle("Login Form");
f.setSize(700,500);
f.setLayout(null);
f.setLocationRelativeTo(null);
f.setVisible(true);
 
lfirst=new Label("First Name:");
lfirst.setBounds(20,30,100,30);
f.add(lfirst);

tfirst=new TextField();
tfirst.setBounds(130,30,100,25);
f.add(tfirst);

llast=new Label("Last Name:");
llast.setBounds(20,60,100,30);
f.add(llast);

tlast=new TextField();
tlast.setBounds(130,60,100,25);
f.add(tlast);

lDOB=new Label("DOB:");
lDOB.setBounds(20,90,100,30);
f.add(lDOB);

tDOB=new TextField();
tDOB.setBounds(130,90,100,25);
f.add(tDOB);

lfather=new Label("Father's Name:");
lfather.setBounds(20,120,100,30);
f.add(lfather);

tfather=new TextField();
tfather.setBounds(130,120,100,25);
f.add(tfather);




}
public static void main(String ar[])
{
new Form();
}
}
