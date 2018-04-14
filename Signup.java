package LoginSys;

import java.awt.*;

import javax.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

@SuppressWarnings("unused")
public class Signup {

	public JFrame frame;
	private JTextField textField;
	private JTextField txtgmailcom;
	private JPasswordField textField_2;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setResizable(false);
		frame.setBounds(100, 100, 1200, 650);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Signup.class.getResource("/image/system.jpg")));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSignUpHere = new JLabel("Sign Up Here!!");
		lblSignUpHere.setForeground(Color.RED);
		lblSignUpHere.setFont(new Font("Arial", Font.BOLD, 40));
		lblSignUpHere.setBounds(478, 50, 328, 50);
		frame.getContentPane().add(lblSignUpHere);
		
		JLabel lblName = new JLabel("Username :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblName.setBounds(185, 209, 200, 50);
		frame.getContentPane().add(lblName);
		
		JLabel lblNewLabel = new JLabel("E-mail :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(185, 279, 200, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPassword.setBounds(185, 350, 200, 50);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(467, 214, 253, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtgmailcom = new JTextField();
		txtgmailcom.setBackground(Color.LIGHT_GRAY);
		txtgmailcom.setBounds(467, 294, 253, 33);
		frame.getContentPane().add(txtgmailcom);
		txtgmailcom.setColumns(10);
		
		textField_2 = new JPasswordField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setBounds(467, 365, 253, 33);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(833, 160, 270, 277);
		Image img = new ImageIcon(this.getClass().getResource("/c.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				String email = txtgmailcom.getText();
				String pass = textField_2.getText();
				String rpass =textField_1.getText();
				if(name !=null && email.contains("@")&&email.contains(".com")&& pass!=null && pass.length()>=5 && rpass.equals(pass)) {
					
					
					try {
						Connection con = Conh2.getConnection();
					    
					  PreparedStatement stmt=con.prepareStatement("insert into SIGNUP1 values(?,?,?)");
					    stmt.setString(1,name );
					    stmt.setString(2, email);
					    stmt.setString(3, pass);
					    stmt.executeUpdate();
					       con.close();
				
					       JOptionPane.showMessageDialog(null,"You have regisstered succesfully !!!welcome");
					       frame.setVisible(false);
							new LoginSystem().frame.setVisible(true);
					}
					catch(Exception e)
					{
						System.out.println(e);
						JOptionPane.showMessageDialog(null,"Username already exist");
						textField.setText("");
					}
					
					
					
				} else {
					

				JOptionPane.showMessageDialog(null,"Enter your E-mail or password correctly");
				textField_2.setText("");
				textField_1.setText("");
				txtgmailcom.setText("");
				textField.requestFocus();
				}
				
				
			}
			
		});
				
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setBounds(472, 523, 98, 33);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new LoginSystem().frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(622, 523, 98, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblReenterPassword = new JLabel("Re-Enter password :");
		lblReenterPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblReenterPassword.setBounds(185, 427, 270, 50);
		frame.getContentPane().add(lblReenterPassword);
		
		textField_1 = new JPasswordField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(467, 435, 253, 33);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
	}
}
