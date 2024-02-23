import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
public class Calculator extends Frame implements ActionListener
{
JTextField t1,t2,t3; 
JLabel l1,l2,l3; 
JButton b1,b2,b3,b4;
Frame f1=new Frame(); 
Calculator()
{
f1.setLayout(new GridLayout(5,2)); 
setBackground(Color.lightGray);
l1=new JLabel("Enter the First number :"); 
f1.add(l1);
t1=new JTextField(10); 
f1.add(t1);
l2=new JLabel("Enter the Second number :"); 
f1.add(l2);
t2=new JTextField(10); 
f1.add(t2);
l3=new JLabel("Result"); 
f1.add(l3);
t3=new JTextField(10); 
f1.add(t3);
b1=new JButton("ADD"); 
f1.add(b1); 
b1.addActionListener(this); 
b2=new JButton("SUB"); 
f1.add(b2); 
b2.addActionListener(this); 
b3=new JButton("MUL"); 
f1.add(b3); 
b3.addActionListener(this); 
b4=new JButton("DIVISION"); 
f1.add(b4); 
b4.addActionListener(this);
f1.setVisible(true); 
f1.setSize(300,400); 
t1.setBackground(Color.yellow); 
t2.setBackground(Color.yellow); 
t3.setBackground(Color.yellow);
}
public void actionPerformed(ActionEvent ae)
{
try
{
if(ae.getSource()==b1)
{
int x=Integer.parseInt(t1.getText()); 
int y=Integer.parseInt(t2.getText()); 
int sum=x+y;
t3.setText(" "+sum);
}
if(ae.getSource()==b2)
{
int x=Integer.parseInt(t1.getText()); 
int y=Integer.parseInt(t2.getText()); 
int sub=x-y;
t3.setText(" "+sub);
}
if(ae.getSource()==b3)
{
int x=Integer.parseInt(t1.getText()); 
int y=Integer.parseInt(t2.getText()); 
int mul=x*y;
t3.setText(" "+mul);
}
if(ae.getSource()==b4)
{
int x=Integer.parseInt(t1.getText()); 
int y=Integer.parseInt(t2.getText()); 
int div=x%y;
t3.setText(" "+div);
}
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,e);
} 
}
public static void main(String args[])
{
Calculator c=new Calculator();
}
}