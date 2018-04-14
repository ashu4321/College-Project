package LoginSys;

import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Font;

import javax.swing.JPasswordField;

import LoginSys.LoginSystem;

public class cdb extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Pane;
	public JFrame frame;
	private JTextField txtcdb;
	private JPasswordField txtpas;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cdb frame = new cdb();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	String dname,dpas;
	
	public  cdb() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Pane = new JPanel();
		Pane.setBackground(new Color(51, 204, 255));
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(null);
		
		
		txtcdb = new JTextField();
		txtcdb.setBounds(191, 63, 126, 25);
		Pane.add(txtcdb);
		txtcdb.setColumns(10);
		
		JButton btnNewButton = new JButton("click to create database");
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(129, 170, 161, 23);
		Pane.add(btnNewButton);
		
		JLabel lblEnterDatabaseName = DefaultComponentFactory.getInstance().createLabel("Enter Database Name:-");
		lblEnterDatabaseName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterDatabaseName.setBackground(new Color(128, 0, 128));
		lblEnterDatabaseName.setBounds(28, 60, 153, 31);
		Pane.add(lblEnterDatabaseName);
		
		JLabel lblDatabaseCreation = DefaultComponentFactory.getInstance().createTitle("Database Creation");
		lblDatabaseCreation.setFont(new Font("Franklin Gothic Book", Font.BOLD, 11));
		lblDatabaseCreation.setBounds(168, 11, 153, 14);
		Pane.add(lblDatabaseCreation);
		
		JLabel lblEnterPassword = DefaultComponentFactory.getInstance().createLabel("Enter Password:-");
		lblEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterPassword.setBounds(64, 102, 103, 42);
		Pane.add(lblEnterPassword);
		
		txtpas = new JPasswordField();
		txtpas.setBounds(191, 110, 126, 25);
		Pane.add(txtpas);

		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dname=txtcdb.getText();
				dpas=txtcdb.getText();
			String n=	String.valueOf(dname);
			String p=String.valueOf(dpas);
		if( n.equals(p) && dpas.length()<=4) {
			
			JOptionPane.showMessageDialog(frame,"Database and password cannot be same or name and password must be greater then 4 ");
			
			
		}
		else{
		
			new Conh2(dname);
			new Database(dname,dpas);
		
			
				new LoginSystem();
				 
				Database.main(null);
				txtcdb.setText("");
				txtpas.setText("");
				
               
			}
			}});}
		
		
		
		
	
		}
	

	

