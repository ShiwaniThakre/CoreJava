import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Userpage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userpage window = new Userpage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Userpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1148, 772);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 45));
		lblNewLabel.setBounds(226, 265, 247, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("MV Boli", Font.BOLD, 45));
		lblPassword.setBounds(226, 386, 247, 62);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(545, 281, 290, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(545, 395, 290, 53);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Segoe Script", Font.BOLD, 25));
		btnNewButton.setBounds(971, 63, 104, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setForeground(new Color(128, 64, 0));
		btnNewButton_1.setFont(new Font("Segoe Script", Font.BOLD, 28));
		btnNewButton_1.setBounds(415, 532, 149, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sonali\\Downloads\\cleaning-gb22340f68_1920.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1177, 779);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(301, 122, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
