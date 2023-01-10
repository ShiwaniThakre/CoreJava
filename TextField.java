import java.awt.*;
import javax.swing.*;
public class TextField extends JFrame
{
public TextField()
{
JLabel l1 = new JLabel("username");
add(l1);
JTextField jtf = new JTextField(20); //creating JTextField.
add(jtf); //adding JTextField to frame.
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(400, 400);
setVisible(true);
}
public static void main(String[] args)
{
new TextField();
}
}


