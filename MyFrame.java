import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame
{
	MyFrame()
	{
		setTitle("Registration Form");
		JLabel lb = new JLabel("Registration Form");   
		add(lb);   
		lb.setBounds(240,0,120,50);
		
		JLabel l1 = new JLabel("Name: ");
		add(l1);
		l1.setBounds(150,60,80,30);
		
		JTextField N = new JTextField(20); 
		add(N);
		N.setBounds(240, 60, 190, 30);
		
		JLabel l2 = new JLabel("Password: ");
		add(l2);
		l2.setBounds(150, 90, 80, 30);
		
		JPasswordField P = new JPasswordField(20); 
		add(P);
		P.setBounds(240, 90, 190, 30);
		
		JLabel l3 = new JLabel("E-mail Id: ");
		add(l3);
		l3.setBounds(150, 120, 80, 30);
		
		JTextField E = new JTextField(20);
		add(E);
		E.setBounds(240, 120, 190, 30);
		
		JLabel l4 = new JLabel("Gender: ");
		add(l4);
		l4.setBounds(150, 150, 80, 30);
 
        JRadioButton b1 = new JRadioButton("Male");
        add(b1);
        b1.setBounds(240, 150, 80, 30); 
    	ButtonGroup bg=new ButtonGroup();
    	bg.add(b1);
        JRadioButton b2 = new JRadioButton("Female");
        add(b2);
        b2.setBounds(330, 150, 80, 30);
        bg.add(b2);
        
        
        JLabel l5 = new JLabel("Contact#: ");
		add(l5);
		l5.setBounds(150, 180, 80, 30);
		
		JTextField C = new JTextField(20); 
		add(C);
		C.setBounds(240, 180, 190, 30);
        
		
		JLabel l6 = new JLabel("Education Qualification");   
		add(l6);   
		l6.setBounds(230, 240, 200, 30); 
		
		JLabel l7 = new JLabel("Degree: ");
		add(l7);
		l7.setBounds(150, 300, 80, 30);
		
		String Deg[] = {"--select Group--","BSc","BCom","BTech","BE"};
		JComboBox CB = new JComboBox(Deg);
		add(CB);
		CB.setBounds(240, 300, 190, 30);
		
		JLabel l8 = new JLabel("Course: ");
		add(l8);
		l8.setBounds(150, 340, 80, 30);
		
		String Eng[] = {"--select Group--","Computer","Mechanical","Chemical","Electrical"};
		JComboBox c1 = new JComboBox(Eng);
		add(c1); 
		c1.setBounds(240, 340, 190, 30);
		
		JLabel l9= new JLabel("Hobbies: ");
		add(l9);
		l9.setBounds(150, 370, 80, 30);
		
		JCheckBox jcb= new JCheckBox("Playing Chess");
		add(jcb);
		jcb.setBounds(240, 370, 100, 30);
		
		JCheckBox jcb1 =new JCheckBox("Reading Books");
		add(jcb1);
		jcb1.setBounds(240, 400, 100, 30);
		
		JCheckBox jcb2 =new JCheckBox("Singing");
		add(jcb2);
		jcb2.setBounds(240, 430, 120, 30);
		
		JLabel l10 = new JLabel("Address");   
		add(l10);   
		l10.setBounds(260, 460, 80, 30); 
		
		JTextField A = new JTextField(20); 
		add(A);
		A.setBounds(150, 490, 300, 100);
		
		JLabel l11 = new JLabel("Attach Resume: ");   
		add(l11);
		l11.setBounds(150, 500, 80, 30);
//		
//		JButton b=new JButton("Click Here");   
//	    add(b); 
//	    b.setBounds(250, 500, 80, 30);
//	    
//		JLabel l12 = new JLabel("No File Choosen ");   
//		add(l12);
//		l12.setBounds(300, 500, 80, 30);
	    
	    JButton S=new JButton("SUBMIT");   
	    add(S);
	    S.setBounds(250, 650, 80, 30);
	    
	    setVisible(true);
	    setSize(600, 1000);  
		setLayout(null);
	}	
public static void main(String[]args)
{
	new MyFrame();
}
}
