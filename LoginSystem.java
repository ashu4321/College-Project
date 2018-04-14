package LoginSys;

import java.awt.EventQueue;
import LoginSys.cdb;
import java.awt.Image;
import java.awt.Toolkit;

import LoginSys.Conh2;
import LoginSys.Database;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginSystem
{
	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	boolean flag;
    String dbUsername, dbPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 24));
		frame.getContentPane().setBackground(new Color(245,245,245));
		frame.setBounds(100, 100,500, 400);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginSystem.class.getResource("/image/system.jpg")));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(93, 202, 84, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(93, 244, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(237, 200, 136, 20);
		textField.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(237, 242, 136, 20);
		textField_1.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				
				String puname = textField.getText();
				String ppaswd = textField_1.getText();
				
				if(puname.equals("Admin")||puname.equals("admin") && ppaswd.equals("12345")) {
					new Adminpage().setVisible(true);
					frame.setVisible(false);
					
				}
				
				else{
					try{
			            Connection con = Conh2.getConnection();
			            PreparedStatement stmt=con.prepareStatement("select UNAME,PASS from SIGNUP1");
			            stmt.execute();
			            ResultSet rs = stmt.getResultSet();

			            while(rs.next()){
			                dbUsername = rs.getString("uname");
			                dbPassword = rs.getString("pass");

			                if(dbUsername.equals(puname) && dbPassword.equals(ppaswd)){
			                	
			                	new home(dbUsername).frame.setVisible(true);
			                	frame.setVisible(false);
			                	
			                	flag = true;
			                	
			                }
			                
			            
			            }}
			            catch(Exception e)
						{
			            	JOptionPane.showMessageDialog(null,e);
						}
			        
				if(!flag)
				{
					JOptionPane.showMessageDialog(null,"wrong  username and password");
				}
				else{
				
					}}
			
			
			}});
		btnLogin.setBounds(76, 292, 82, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnSignUp = new JButton("Sign up ");
		btnSignUp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				new Signup().frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		btnSignUp.setBounds(327, 292, 82, 23);
		frame.getContentPane().add(btnSignUp);
		
		JLabel lblUserLogin = new JLabel("User Login");
		lblUserLogin.setBounds(180, 138, 161, 29);
		lblUserLogin.setFont(new Font("Arial", Font.BOLD, 25));
		frame.getContentPane().add(lblUserLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		btnReset.setBounds(198, 292, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 494, 108);
		Image img = new ImageIcon(this.getClass().getResource("/abc.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(Color.WHITE);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Create Database");
	    btnNewButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent arg0)
	      {
	    	  new cdb().setVisible(true);
	    	  frame.setVisible(false);
	    	 
	    
	    
	    
	     
	      }
	    });
	    btnNewButton.setBounds(165, 328, 153, 23);
	    this.frame.getContentPane().add(btnNewButton);
	  	}

	
}
