import java.awt.*;
import javax.swing.*;
public class UserPass extends JFrame
{
  UserPass()
{
JLabel l1 = new JLabel("username: ");
l1.setBounds(50,50,100,50);
add(l1);
JTextField jtf = new JTextField(20); //creating JTextField.
jtf.setBounds(150,50,100,50);
add(jtf); //adding JTextField to frame.
JLabel l2 = new JLabel("Password: ");
l2.setBounds(50,100,100,50);
add(l2);
JTextField jt = new JTextField(20); //creating JTextField.
jt.setBounds(150,100,100,50);
add(jt);
JButton b1 =new JButton("Login");
b1.setBounds(50,200,100,100);
add(b1);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 400);
setVisible(true);
}
public static void main(String[] args)
{
new UserPass();
}
}