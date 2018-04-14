package LoginSys;

import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import LoginSys.Conh2;

import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class home {

	private static final String ListSelectionModel = null;
	public JFrame frame;
	private	ButtonGroup btg=new ButtonGroup();
	
	private CardLayout cd;
	private JPanel panel_1;
	private JTextField assetid;
	private JTextArea textField_2;
	private JLabel username;
	protected JLabel textArea;

	private JLabel textField;

	private JTextArea textField_1;
	private JTextField textField_3;
	private Component table_3;
	private JTable table;
	private JTable table_2;
	private Component contentPane;
	private Component table_1;
	private JTable table_5;
	private JTable table_4;
	private JTable table_6;
	private String puname;
	String usernme="";
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				 
				try {
					home window = new home("No User");
					window.frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public home(String sm) {
		
			usernme=sm;
		
			// TODO Auto-generated catch block
			
		
		initialize();
	}
	public home(){
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(home.class.getResource("/image/c.jpg")));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		frame.setSize(1360,720);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 160, 160);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.BLUE);
		
		Image img1 = new ImageIcon(this.getClass().getResource("/server.jpg")).getImage();
		frame.getContentPane().setLayout(null);
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-149, 0, 1509, 160);
		Image img = new ImageIcon(this.getClass().getResource("/Banner.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_1, "p1");
			}
		});
		btnNewButton.setBounds(0, 159, 160, 40);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 51));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Complaint");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cd.show(panel_1, "p2");
				
			}
		});
		btnNewButton_1.setBounds(159, 159, 160, 40);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 0, 51));
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("About Us");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cd.show(panel_1, "p4");	
			}
		});
		btnNewButton_2.setBounds(477, 159, 160, 40);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBackground(new Color(0, 0, 51));
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Contact Us");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cd.show(panel_1, "p3");
				
			}
		});
		btnNewButton_3.setBounds(317, 159, 160, 40);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(0, 0, 51));
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Feedback\r\n");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_1, "t5");
			}
		});
		btnNewButton_4.setBounds(636, 159, 160, 40);
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(0, 0, 51));
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Logout");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
		   new LoginSystem().frame.setVisible(true); //return to login page//
		   frame.setVisible(false); //previous window invisible//
		  
         }
		});
		btnNewButton_6.setBounds(796, 159, 160, 40);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(new Color(0, 0, 51));
		frame.getContentPane().add(btnNewButton_6);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 204, 272, 535);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JButton btnNewButton_9 = new JButton("Details");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_1, "t8");
			}
		});
		btnNewButton_9.setBackground(new Color(211, 211, 211));
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_9.setBounds(10, 337, 252, 46);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Track Asset");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cd.show(panel_1, "t6");
			}
		});
		btnNewButton_10.setBackground(new Color(211, 211, 211));
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.setBounds(10, 79, 252, 46);
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Track Asset ID");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_1, "t7");
			}
		});
		btnNewButton_11.setBackground(new Color(211, 211, 211));
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_11.setBounds(10, 160, 252,46 );
		panel.add(btnNewButton_11);
		
		JEditorPane dtrpnTracking = new JEditorPane();
		dtrpnTracking.setBackground(new Color(0, 0, 102));
		dtrpnTracking.setText("            Tracking");
		dtrpnTracking.setFont(new Font("Tahoma", Font.BOLD, 24));
		dtrpnTracking.setForeground(Color.WHITE);
		dtrpnTracking.setBounds(0, 0, 272, 38);
		panel.add(dtrpnTracking);
		
		JEditorPane dtrpnProjectDetails = new JEditorPane();
		dtrpnProjectDetails.setText("       Project Details");
		dtrpnProjectDetails.setBackground(new Color(0, 0, 102));
		dtrpnProjectDetails.setForeground(Color.WHITE);
		dtrpnProjectDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		dtrpnProjectDetails.setBounds(0, 264, 272, 38);
		panel.add(dtrpnProjectDetails);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBackground(new Color(0, 0, 51));
		editorPane_4.setBounds(0, 515, 272, 20);
		panel.add(editorPane_4);
		
		cd=new CardLayout();
	    panel_1 = new JPanel();
		panel_1.setBounds(282, 204, 1078, 535);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(cd);
		
		//home
		
		JPanel home = new JPanel();
		home.setBackground(SystemColor.menu);
		panel_1.add(home, "p1");
		home.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(new Color(0, 0, 0));
		editorPane.setBounds(0, 624, 1204, 41);
		home.add(editorPane);
			
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 1078, 163);
		Image img6 = new ImageIcon(this.getClass().getResource("/set.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img6));
		home.add(lblNewLabel_4);
		
		JEditorPane dtrpnNxicbndasd = new JEditorPane();
		dtrpnNxicbndasd.setBackground(new Color(0, 0, 0));
		dtrpnNxicbndasd.setBounds(0, 164, 1194, 7);
		home.add(dtrpnNxicbndasd);
		
		JLabel lblNewLabel_11 = new JLabel("WELCOME");
		lblNewLabel_11.setFont(new Font("Sitka Subheading", Font.BOLD, 70));
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setBounds(386, 181, 363, 90);
		home.add(lblNewLabel_11);
		
		JLabel lbloneOfThe = new JLabel("\"One of the greatest responsibilities that i have is to manage my assets wisely so that they create value.\"");
		lbloneOfThe.setForeground(Color.WHITE);
		lbloneOfThe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbloneOfThe.setBounds(119, 325, 949, 41);
		home.add(lbloneOfThe);
		
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setForeground(new Color(255, 255, 255));
		lblNewLabel1.setBounds(0, 164, 1078, 371);
		Image img2 = new ImageIcon(this.getClass().getResource("/back.jpg")).getImage();
		lblNewLabel1.setIcon(new ImageIcon(img2));
		home.add(lblNewLabel1);
		
		
		
		//complaint p2
		
		JPanel complaint = new JPanel();
		complaint.setBackground(SystemColor.menu);
		panel_1.add(complaint, "p2");
		complaint.setLayout(null);
		
		JEditorPane dtrpnAboutUs = new JEditorPane();
		dtrpnAboutUs.setForeground(new Color(250, 250, 210));
		dtrpnAboutUs.setText("          Complaint Here!!");
		dtrpnAboutUs.setFont(new Font("Arial Black", Font.BOLD, 40));
		dtrpnAboutUs.setBackground(new Color(0, 0, 128));
		dtrpnAboutUs.setBounds(129, 0, 949, 63);
		complaint.add(dtrpnAboutUs);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(new Color(0, 0, 102));
		editorPane_1.setBounds(2, 500, 1076, 31);
		complaint.add(editorPane_1);
		
	    JLabel lblNewLabe8 = new JLabel("");
		lblNewLabe8.setBounds(601, 142, 401, 315);
		Image img22 = new ImageIcon(this.getClass().getResource("/s.jpg")).getImage();
		lblNewLabe8.setIcon(new ImageIcon(img22));
		complaint.add(lblNewLabe8);
		
		JLabel lblUsername = new JLabel("UserName :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(72, 142, 113, 25);
		complaint.add(lblUsername);
		
		
		username = new JLabel();
		username.setBackground(Color.LIGHT_GRAY);
		username.setBounds(195, 141, 329, 31);
		username.setText(usernme);
		complaint.add(username);
		
		
		JLabel lblAssetId = new JLabel("Asset ID :");
		lblAssetId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAssetId.setBounds(72, 194, 113, 25);
		complaint.add(lblAssetId);
		
		assetid = new JTextField();
		assetid.setBackground(Color.LIGHT_GRAY);
		assetid.setBounds(195, 193, 329, 31);
		complaint.add(assetid);
		assetid.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Select","Monitor", "Keyboard", "Mouse", "CPU"}));
		comboBox.setBounds(195, 246, 329, 26);
		complaint.add(comboBox);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescription.setBounds(72, 300, 113, 30);
		complaint.add(lblDescription);
		
		JTextArea description = new JTextArea();
		description.setBackground(Color.LIGHT_GRAY);
		description.setBounds(195, 305, 327, 94);
		complaint.add(description);
		
		
		
		JButton btnNewButton1 = new JButton("Submit");
		btnNewButton1.setBackground(Color.LIGHT_GRAY);
		btnNewButton1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				int count=0;
				String name = username.getText();
				String asset = assetid.getText().toUpperCase();
				String comp =description.getText();
				String combobo=(String)comboBox.getSelectedItem();
				if(name !=null && asset!=null && comp.length()>=10 && combobo!=null ) {
					
					try{
			            Connection con = Conh2.getConnection();
			            PreparedStatement stmt=con.prepareStatement("select * from COMP1 ");
			            ResultSet rs=stmt.executeQuery();
			            String aid="",atype="";
			            while(rs.next())
			            {
                             aid=rs.getString(2).toLowerCase();
                             atype=rs.getString(4);
                             if(assetid.getText().equals(aid) && combobo.equals(atype))
     			            {
     			               count++;
     			            }

			            }
			            if(count>1)
			            {
			            	JOptionPane.showMessageDialog(null, "Data already exists");
			            }
			            else
			            {
			            	PreparedStatement stmt1=con.prepareStatement("insert into COMP1 values(?,?,?,?)");
			            	stmt1.setString(1, name);
			            	stmt1.setString(2, asset);
			            	stmt1.setString(3, comp);
			            	stmt1.setString(4, combobo);
			            	stmt1.executeUpdate();
			            	JOptionPane.showMessageDialog(null," We will solve your problem soon!!");
			            }
			            
						assetid.setText(null);
						description.setText(null);
						comboBox.setSelectedItem("Select");
						assetid.requestFocus();
			            stmt.getResultSet();
		            }
			            catch(Exception e)
						{
							JOptionPane.showMessageDialog(null, e);
						}
					
				} else {

				JOptionPane.showMessageDialog(null,"Fields are empty!!!");
				assetid.setText(null);
				description.setText(null);
				assetid.requestFocus();
				}
			}
		});
		btnNewButton1.setBounds(195, 422, 130, 45);
		complaint.add(btnNewButton1);
		
		JButton btnNewButton9 = new JButton("Cancel");
		btnNewButton9.setBackground(Color.LIGHT_GRAY);
		btnNewButton9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				assetid.setText(null);
				description.setText(null);
				assetid.requestFocus();
			}
		});
		btnNewButton9.setBounds(385, 424, 130, 41);
		complaint.add(btnNewButton9);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(72, 61, 139));
		lblNewLabel_2.setBounds(2, 0, 128, 119);
		Image img4 = new ImageIcon(this.getClass().getResource("/top.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img4));
		complaint.add(lblNewLabel_2);
		
		JLabel lblAssetType = new JLabel("Asset Type :");
		lblAssetType.setBackground(Color.LIGHT_GRAY);
		lblAssetType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAssetType.setBounds(72, 247, 113, 25);
		complaint.add(lblAssetType);
		
		
		
		
		
		
		//Contactus p3
		
		JPanel contactus = new JPanel();
		panel_1.add(contactus, "p3");
		contactus.setLayout(null);
		
		JEditorPane dtrpnKnfuvnqn = new JEditorPane();
		dtrpnKnfuvnqn.setBackground(SystemColor.control);
		dtrpnKnfuvnqn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		dtrpnKnfuvnqn.setText("\"It is important for all businesses\u2014large or small\u2014to track and manage the Asset in their IT infrastructure. Organization have to perform hardware inventory audits on a regular basis to keep track of all their computer assets and other hardware devices on the network.\"\r\n");
		dtrpnKnfuvnqn.setBounds(76, 89, 893, 42);
		contactus.add(dtrpnKnfuvnqn);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(307, 172, 200, 200);
		Image img9 = new ImageIcon(this.getClass().getResource("/admin1.jpg")).getImage();
		lblNewLabel_6.setIcon(new ImageIcon(img9));
		contactus.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(64, 172, 206, 200);
		Image img8 = new ImageIcon(this.getClass().getResource("/admin2.jpg")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img8));
		contactus.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setBounds(557, 172, 200, 200);
		Image img21 = new ImageIcon(this.getClass().getResource("/admin3.jpg")).getImage();
		lblNewLabel_21.setIcon(new ImageIcon(img21));
		contactus.add(lblNewLabel_21);
		
		JLabel lblNewLabel_41 = new JLabel("");
		lblNewLabel_41.setBounds(813, 172, 200, 200);
		Image img35 = new ImageIcon(this.getClass().getResource("/admin5.jpg")).getImage();
		lblNewLabel_41.setIcon(new ImageIcon(img35));
		contactus.add(lblNewLabel_41);
		
		JEditorPane dtrpnAshuvendraKumarKumarashuvendragmailcom = new JEditorPane();
		dtrpnAshuvendraKumarKumarashuvendragmailcom.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnAshuvendraKumarKumarashuvendragmailcom.setBackground(SystemColor.control);
		dtrpnAshuvendraKumarKumarashuvendragmailcom.setText("          Ashuvendra Kumar\r\nkumarashuvendra@gmail.com\r\n              7011285324\r\n");
		dtrpnAshuvendraKumarKumarashuvendragmailcom.setBounds(74, 383, 200, 66);
		contactus.add(dtrpnAshuvendraKumarKumarashuvendragmailcom);
		
		JEditorPane dtrpnNiyatiGuptaNiyatiggmailcom = new JEditorPane();
		dtrpnNiyatiGuptaNiyatiggmailcom.setText("         Niyati Gupta\r\nniyati.g145@gmail.com\r\n         9718890252");
		dtrpnNiyatiGuptaNiyatiggmailcom.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnNiyatiGuptaNiyatiggmailcom.setBackground(SystemColor.control);
		dtrpnNiyatiGuptaNiyatiggmailcom.setBounds(317, 383, 200, 66);
		contactus.add(dtrpnNiyatiGuptaNiyatiggmailcom);
		
		JEditorPane dtrpnSaurabhpandeygmailcom = new JEditorPane();
		dtrpnSaurabhpandeygmailcom.setText("          Saurabh Pandey\r\nsaurabhpandey1324@gmail.com\r\n            8744088748");
		dtrpnSaurabhpandeygmailcom.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnSaurabhpandeygmailcom.setBackground(SystemColor.control);
		dtrpnSaurabhpandeygmailcom.setBounds(567, 383, 200, 66);
		contactus.add(dtrpnSaurabhpandeygmailcom);
		
		JEditorPane dtrpnSauravpanditgmailcom = new JEditorPane();
		dtrpnSauravpanditgmailcom.setText("        Saurav Pandit\r\nsauravpandit12@gmail.com\r\n         9540333886");
		dtrpnSauravpanditgmailcom.setFont(new Font("Tahoma", Font.BOLD, 12));
		dtrpnSauravpanditgmailcom.setBackground(SystemColor.control);
		dtrpnSauravpanditgmailcom.setBounds(823, 383, 200, 66);
		contactus.add(dtrpnSauravpanditgmailcom);
		
		JEditorPane dtrpnHeresThisPage = new JEditorPane();
		dtrpnHeresThisPage.setText("                                                                                                                               Here's this page is made specifically for the customer support inquiries :\r\n                                                                                                                                                   Thank You for using Asset Management System!!\r\n ");
		dtrpnHeresThisPage.setForeground(Color.WHITE);
		dtrpnHeresThisPage.setBackground(new Color(0, 0, 102));
		dtrpnHeresThisPage.setFont(new Font("Tahoma", Font.BOLD, 10));
		dtrpnHeresThisPage.setBounds(0, 504, 1078, 31);
		contactus.add(dtrpnHeresThisPage);
		
		JEditorPane dtrpnContactUs = new JEditorPane();
		dtrpnContactUs.setForeground(Color.WHITE);
		dtrpnContactUs.setFont(new Font("Tahoma", Font.BOLD, 45));
		dtrpnContactUs.setText("                                Contact Us");
		dtrpnContactUs.setBackground(new Color(0, 0, 102));
		dtrpnContactUs.setBounds(0, 0, 1078, 63);
		contactus.add(dtrpnContactUs);
		
		//about us 
		
		JPanel aboutus = new JPanel();
		panel_1.add(aboutus, "p4");
		aboutus.setLayout(null);
		
		JLabel lblNewLabel11 = new JLabel("");
		lblNewLabel11.setBounds(780, 241, 288, 246);
		Image img12 = new ImageIcon(this.getClass().getResource("/team.jpg")).getImage();
		lblNewLabel11.setIcon(new ImageIcon(img12));
		aboutus.add(lblNewLabel11);
		
		

		JEditorPane dtrpnassetManagementIs = new JEditorPane();
		dtrpnassetManagementIs.setBackground(SystemColor.menu);
		dtrpnassetManagementIs.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		dtrpnassetManagementIs.setText("      \"Asset management is a simple application which is used to track  the systems of the organisation. The organisation (specifically this institute) can use this application to manage assets and gather information about that.\"");
		dtrpnassetManagementIs.setBounds(85, 102, 912, 106);
		aboutus.add(dtrpnassetManagementIs);
		
		JEditorPane dtrpnAssetManagementProvides = new JEditorPane();
		dtrpnAssetManagementProvides.setText("      Asset management provides solution to handle the assets management needs. We provide Eco-Friendly solutions and services throughout the entire IT product life cycle.\r\n      Our efforts is to provide services and help after the initial sale, provide IT asset (computer and peripherals) disposition support throughout the life of the equipment with certified brand protection techniques. Typically, an asset management plan will cover more than a single asset, taking a system approach especially where a number of assets are co-dependent and are required to work together to deliver an agreed standard of service.\r\n      ");
		dtrpnAssetManagementProvides.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dtrpnAssetManagementProvides.setBackground(SystemColor.menu);
		dtrpnAssetManagementProvides.setBounds(95, 219, 675, 154);
		aboutus.add(dtrpnAssetManagementProvides);
		
		JEditorPane dtrpnObjectivesJustification = new JEditorPane();
		dtrpnObjectivesJustification.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dtrpnObjectivesJustification.setText("                   Justification - to give visibility of the costs and benefits associated with providing the agreed standard of service.\r\n                  Optimisation - to minimize the whole-life cost, including the operation, maintenance and replacement or disposal of each asset in the system.");
		dtrpnObjectivesJustification.setBackground(SystemColor.menu);
		dtrpnObjectivesJustification.setBounds(105, 406, 665, 86);
		aboutus.add(dtrpnObjectivesJustification);
		
		JLabel lblObjectives = new JLabel("Objectives :");
		lblObjectives.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblObjectives.setBounds(85, 372, 124, 38);
		aboutus.add(lblObjectives);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBackground(new Color(0, 0, 102));
		editorPane_3.setBounds(0, 504, 1078, 31);
		aboutus.add(editorPane_3);
		
		JEditorPane dtrpnAboutUs_1 = new JEditorPane();
		dtrpnAboutUs_1.setText("                                  About Us");
		dtrpnAboutUs_1.setFont(new Font("Tahoma", Font.BOLD, 46));
		dtrpnAboutUs_1.setForeground(Color.WHITE);
		dtrpnAboutUs_1.setBackground(new Color(0, 0, 102));
		dtrpnAboutUs_1.setBounds(0, 0, 1078, 63);
		aboutus.add(dtrpnAboutUs_1);
		
		//feedback
		
		JPanel feedback = new JPanel();
		panel_1.add(feedback, "t5");
		feedback.setLayout(null);
		
		JEditorPane dtrpnGiveUsYour = new JEditorPane();
		dtrpnGiveUsYour.setForeground(Color.WHITE);
		dtrpnGiveUsYour.setBackground(new Color(0, 0, 102));
		dtrpnGiveUsYour.setFont(new Font("Tahoma", Font.BOLD, 15));
		dtrpnGiveUsYour.setText("Give us your");
		dtrpnGiveUsYour.setBounds(284, 42, 105, 25);
		feedback.add(dtrpnGiveUsYour);
		
		
		
		
		JEditorPane dtrpnFeedback_1 = new JEditorPane();
		dtrpnFeedback_1.setForeground(Color.WHITE);
		dtrpnFeedback_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		dtrpnFeedback_1.setText("                          Feedback!!");
		dtrpnFeedback_1.setBounds(0, 0, 1084, 72);
		dtrpnFeedback_1.setBackground(new Color(0, 0, 102));
		feedback.add(dtrpnFeedback_1);
		
		JEditorPane dtrpnFeedback = new JEditorPane();
		dtrpnFeedback.setBounds(0, 510, 1084, 25);
		dtrpnFeedback.setForeground(SystemColor.textText);
		dtrpnFeedback.setFont(new Font("Tahoma", Font.BOLD, 50));
		dtrpnFeedback.setBackground(new Color(0, 0, 102));
		feedback.add(dtrpnFeedback);
		
		JLabel lblUsername1 = new JLabel("UserName :");
		lblUsername1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername1.setBounds(108, 100, 105, 43);
		feedback.add(lblUsername1);
		
		textField = new JLabel();
		textField.setBackground(Color.WHITE);
		textField.setText(usernme);
		textField.setBounds(238, 107, 255, 33);
		feedback.add(textField);
		
		
		
		
		
		JRadioButton radioButton = new JRadioButton("1");
		radioButton.setBackground(SystemColor.controlHighlight);
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		radioButton.setBounds(238, 162, 35, 23);
		feedback.add(radioButton);
		btg.add(radioButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("2");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton.setBackground(SystemColor.controlHighlight);
		rdbtnNewRadioButton.setBounds(294, 161, 35, 25);
		feedback.add(rdbtnNewRadioButton);
		btg.add(rdbtnNewRadioButton);
		
		JLabel lblRating = new JLabel("Rating :");
		lblRating.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRating.setBounds(108, 157, 81, 33);
		feedback.add(lblRating);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("3");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton_1.setBackground(SystemColor.controlHighlight);
		rdbtnNewRadioButton_1.setBounds(343, 162, 35, 23);
		feedback.add(rdbtnNewRadioButton_1);
		btg.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("5");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton_2.setBackground(SystemColor.controlHighlight);
		rdbtnNewRadioButton_2.setBounds(453, 162, 35, 23);
		feedback.add(rdbtnNewRadioButton_2);
		btg.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("4");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton_3.setBackground(SystemColor.controlHighlight);
		rdbtnNewRadioButton_3.setBounds(399, 162, 35, 23);
		feedback.add(rdbtnNewRadioButton_3);
		btg.add(rdbtnNewRadioButton_3);
		
		JLabel lblWhatYouLike = new JLabel("What you like most about us?");
		lblWhatYouLike.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWhatYouLike.setBounds(108, 201, 247, 33);
		feedback.add(lblWhatYouLike);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(108, 245, 385, 72);
		feedback.add(scrollPane_2);
		
		textField_1 = new JTextArea(5,5);
		scrollPane_2.setViewportView(textField_1);
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBackground(Color.WHITE);
		textField_1.setLineWrap(true);
		textField_1.setWrapStyleWord(true);
		textField_1.setColumns(10);
		
		JLabel lblSuggestionsForImprovement = new JLabel("Suggestions for improvement.");
		lblSuggestionsForImprovement.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSuggestionsForImprovement.setBounds(108, 328, 247, 33);
		feedback.add(lblSuggestionsForImprovement);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(108, 372, 385, 72);
		feedback.add(scrollPane_3);
		
		textField_2 = new JTextArea();
		scrollPane_3.setViewportView(textField_2);
		textField_2.setRows(5);
		textField_2.setBackground(Color.WHITE);
		textField_2.setColumns(10);
		
		JButton btnNewButton11 = new JButton("Submit");
		
		
		btnNewButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String uname=textField.getText();
	 		    String lwul=textField_1.getText();
	 		    String sugg=textField_2.getText();
	 		    int rad1=0;
	 		    String rad="";
	 		    if(radioButton.isSelected()){
	 		    	rad=radioButton.getText();
	 		    	
	 		    }
	 		    else if(rdbtnNewRadioButton.isSelected()){
	 		    	rad=rdbtnNewRadioButton.getText();
	 		    	
	 		    }
	 		    else if(rdbtnNewRadioButton_1.isSelected()){
	 		    	rad=rdbtnNewRadioButton_1.getText();
	 		    }
	 		   else if(rdbtnNewRadioButton_2.isSelected()){
	 		    	rad=rdbtnNewRadioButton_2.getText();
	 		    }
	 		    else{
	 		    	rad=rdbtnNewRadioButton_3.getText();
	 		    }
	 		    rad1=Integer.parseInt(rad);
	 		    
	 		    
	 		   
	 		     if(uname.trim().isEmpty() || lwul.trim().isEmpty() ||sugg.trim().isEmpty() )
	 		    {
	 		    	JOptionPane.showMessageDialog(null,"Please fill the Entire Details!!" );    
	 		    }
	 		    
	 		     
	 		   else
	 		    { //else start
	 		    	
	 		   	try {
					Connection con = Conh2.getConnection();
				  PreparedStatement stmt=con.prepareStatement("insert into FEEDBACK1 values(?,?,?,?)");
				    stmt.setString(1,uname);
				    stmt.setInt(2,rad1);
				    stmt.setString(3, lwul);
				    stmt.setString(4,sugg);
				    stmt.executeUpdate();
				    con.close();
				    JOptionPane.showMessageDialog(null, "Thanks for your Valuable Feedback!!!");
				    
					textField_2.setText("");
					textField_1.setText("");
					radioButton.setSelected(false);
					textField_1.requestFocus();
		
				       
			
				       
	 		   	       
				}
				catch(Exception t)
				{
					System.out.println(t);
					
				
				}
	 		    	
	 		     	
	 		    } //condition if 		   
	 		  
				
				
			}});
			
		btnNewButton11.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton11.setBounds(108, 460, 165, 40);
		feedback.add(btnNewButton11);
		
		JButton btnNewButton_111 = new JButton("Cancel");
		btnNewButton_111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");
				textField_1.setText("");
				textField_1.requestFocus();
	 		   }});
		btnNewButton_111.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_111.setBounds(328, 460, 165, 40);
		feedback.add(btnNewButton_111);
		
		JLabel lblNewLabel111 = new JLabel("");
		lblNewLabel111.setBounds(529, 113, 506, 422);
		Image img13 = new ImageIcon(this.getClass().getResource("/feedback.jpg")).getImage();
		lblNewLabel111.setIcon(new ImageIcon(img13));
		feedback.add(lblNewLabel111);
		
		
		
		
		
		//track asset
		
		JPanel searcha = new JPanel();
		panel_1.add(searcha, "t6");
		searcha.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setBounds(306, 193, 352, 60);
		searcha.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBackground(Color.LIGHT_GRAY);
		comboBox1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--","CL-1", "CL-2", "CL-3", "CL-4", "CL-5","CL-6"}));
		comboBox1.setBounds(306, 148, 352, 34);
		searcha.add(comboBox1);
		JButton lblNewLabel_3 = new JButton("");
		lblNewLabel_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String combobo3=(String)comboBox1.getSelectedItem();
				String aids=textField_3.getText().toUpperCase();
				
				
				try {
					Connection con = Conh2.getConnection();
				    PreparedStatement stmt=con.prepareStatement("select * from ASSET1 where ASSET_ID=?");
				    stmt.setString(1,aids);
				    
				    
				    ResultSet rs=stmt.executeQuery();
				    DefaultTableModel dtm =(DefaultTableModel)table_4.getModel();
				    
				    while (dtm.getRowCount() > 0){
		                 dtm.removeRow(0);              
		            }
				    
				    while (rs.next()) {
		                Vector row = new Vector();
		                table_4.setFont(new Font("Serif", Font.BOLD, 15));
		                row.add(rs.getString(1));   
		                row.add(rs.getString(2));
		                    row.add(rs.getString(3));    
		                    row.add(rs.getInt(4));
                            row.add(rs.getString(5));
		                dtm.addRow(row);
		                }
				    
				    if(dtm.getRowCount()==0){
		                 JOptionPane.showMessageDialog(null,"No Asset Found");
		             } 
				  con.close();
				  comboBox1.setSelectedItem("--SELECT--"); 
				  textField_3.setText(""); 
				} 
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println(e);
					
				}
				} 	
	});		
    	lblNewLabel_3.setBackground(SystemColor.menu);
		lblNewLabel_3.setBounds(668, 193, 69, 60);
		Image img7 = new ImageIcon(this.getClass().getResource("/ic.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img7));
		searcha.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(45, 273, 967, 139);
		searcha.add(panel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 957, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addGap(110))
		);
		
		table_5 = new JTable();
		scrollPane.setColumnHeaderView(table_5);
		
		table_4 = new JTable();
	
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"LAB","ASSET I.D", "ROW NO.", "ASSET NO(R TO L)", "O.S"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class,String.class, String.class, Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		 table_4.setFont(new Font("Serif", Font.BOLD, 15));
		table_4.getColumnModel().getColumn(0).setPreferredWidth(93);
		table_4.getColumnModel().getColumn(1).setPreferredWidth(78);
		table_4.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_4.getColumnModel().getColumn(3).setPreferredWidth(77);
		table_4.getColumnModel().getColumn(4).setPreferredWidth(93);
		DefaultTableCellRenderer rendar2 = new DefaultTableCellRenderer();
		
		rendar2.setHorizontalAlignment(JLabel.CENTER);
	   

	    table_4.getColumnModel().getColumn(0).setCellRenderer(rendar2); 
	    table_4.getColumnModel().getColumn(1).setCellRenderer(rendar2);
	    table_4.getColumnModel().getColumn(2).setCellRenderer(rendar2);
	    table_4.getColumnModel().getColumn(3).setCellRenderer(rendar2);
	    table_4.getColumnModel().getColumn(4).setCellRenderer(rendar2);
	    table_4.setEnabled(false);
		scrollPane.setViewportView(table_4);
			panel_2.setLayout(gl_panel_2);
		
		JEditorPane dtrpnTrackAsset = new JEditorPane();
		dtrpnTrackAsset.setBackground(new Color(0, 0, 102));
		dtrpnTrackAsset.setForeground(Color.WHITE);
		dtrpnTrackAsset.setFont(new Font("Tahoma", Font.BOLD, 48));
		dtrpnTrackAsset.setText("                             Track Asset ");
		dtrpnTrackAsset.setBounds(0, 0, 1078, 74);
		searcha.add(dtrpnTrackAsset);
		
		JEditorPane editorPane_6 = new JEditorPane();
		editorPane_6.setBackground(new Color(0, 0, 102));
		editorPane_6.setBounds(0, 504, 1078, 31);
		searcha.add(editorPane_6);
		
		
		
		//trackassetid
		JPanel searchaid = new JPanel();
		panel_1.add(searchaid, "t7");
		searchaid.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CL-1", "CL-2", "CL-3", "CL-4", "CL-5", "CL-6"}));
		comboBox_1.setBounds(76, 181, 253, 45);
		searchaid.add(comboBox_1);
		
		JLabel lblLab = new JLabel("Lab");
		lblLab.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLab.setBounds(166, 114, 43, 34);
		searchaid.add(lblLab);
		
		JLabel lblRow = new JLabel("Row");
		lblRow.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRow.setBounds(501, 114, 61, 34);
		searchaid.add(lblRow);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8"}));
		comboBox_2.setBounds(404, 181, 253, 45);
		searchaid.add(comboBox_2);
		
		JLabel lblPositionrightTo = new JLabel("Position (Right to Left)");
		lblPositionrightTo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPositionrightTo.setBounds(731, 114, 276, 34);
		searchaid.add(lblPositionrightTo);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox_3.setBounds(731, 181, 253, 45);
		searchaid.add(comboBox_3);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				
			
			
				String comboBox_=(String)comboBox_3.getSelectedItem();
				String combobo_6=(String)comboBox_2.getSelectedItem();
				String combobo_7=(String)comboBox_1.getSelectedItem();
				
				
				try {
					Connection con =Conh2.getConnection();
				    PreparedStatement stmt=con.prepareStatement("select ASSET_ID from ASSET1 where ROW=? and POSITION=?");
				    stmt.setString(1,combobo_6 );
				    stmt.setString(2, comboBox_);
				    
				    
				    ResultSet rs=stmt.executeQuery();
				    DefaultTableModel dtm =(DefaultTableModel)table_6.getModel();
				    
				    while (dtm.getRowCount() > 0){
		                 dtm.removeRow(0);              
		            }
				    
				    while (rs.next()) {
				   	 table_6.setFont(new Font("Serif", Font.BOLD, 15));
		                Vector row = new Vector();
		                    row.add(rs.getString(1));
		                   dtm.addRow(row);
		                }
				    
				    if(dtm.getRowCount()==0){
		                 JOptionPane.showMessageDialog(null,"No Asset Found");
		             }
				  con.close();
				  }
				  catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,e);
					
				}
				} 
			});
		
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSearch.setBounds(471, 262, 143, 45);
		searchaid.add(btnSearch);
		
		JEditorPane dtrpnTrackAssetId = new JEditorPane();
		dtrpnTrackAssetId.setFont(new Font("Tahoma", Font.BOLD, 48));
		dtrpnTrackAssetId.setText("                         Track Asset ID");
		dtrpnTrackAssetId.setForeground(Color.WHITE);
		dtrpnTrackAssetId.setBackground(new Color(0, 0, 102));
		dtrpnTrackAssetId.setBounds(0, 0, 1078, 63);
		searchaid.add(dtrpnTrackAssetId);
		
		JEditorPane editorPane_7 = new JEditorPane();
		editorPane_7.setBackground(new Color(0, 0, 102));
		editorPane_7.setBounds(0, 504, 1078, 31);
		searchaid.add(editorPane_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(370, 393, 316, 53);
		searchaid.add(panel_3);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
		);
		
		table_6 = new JTable();
		table_6.setFont(new Font("Serif", Font.BOLD, 15));
		table_6.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ASSET ID"
			}
		));
		scrollPane_1.setViewportView(table_6);
DefaultTableCellRenderer rendar1 = new DefaultTableCellRenderer();
		
		rendar1.setHorizontalAlignment(JLabel.CENTER);
	   

	    table_6.getColumnModel().getColumn(0).setCellRenderer(rendar2);
		panel_3.setLayout(gl_panel_3);
		table_6.setVisible(true);
		table_6.setEnabled(false);
		
		JPanel detail = new JPanel();
		panel_1.add(detail, "t8");
		detail.setLayout(null);
		
		JEditorPane dtrpnDetails = new JEditorPane();
		dtrpnDetails.setBounds(0, 0, 1078, 63);
		dtrpnDetails.setFont(new Font("Tahoma", Font.BOLD, 48));
		dtrpnDetails.setText("                                Details ");
		dtrpnDetails.setForeground(Color.WHITE);
		dtrpnDetails.setBackground(new Color(0, 0, 102));
		detail.add(dtrpnDetails);
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setBounds(0, 504, 1078, 31);
		editorPane_5.setBackground(new Color(0, 0, 102));
		detail.add(editorPane_5);
		
		JLabel lblCl = new JLabel("CL-1");
		lblCl.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCl.setBounds(173, 135, 69, 37);
		detail.add(lblCl);
		
		JLabel lblCl_1 = new JLabel("CL-2");
		lblCl_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCl_1.setBounds(523, 135, 69, 37);
		detail.add(lblCl_1);
		
		JLabel lblCl_2 = new JLabel("CL-3");
		lblCl_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCl_2.setBounds(840, 135, 69, 37);
		detail.add(lblCl_2);
		
		JLabel lblCl_3 = new JLabel("CL-4");
		lblCl_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCl_3.setBounds(173, 309, 69, 37);
		detail.add(lblCl_3);
		
		JLabel lblCl_4 = new JLabel("CL-5");
		lblCl_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCl_4.setBounds(523, 309, 69, 37);
		detail.add(lblCl_4);
		
		JLabel lblCl_5 = new JLabel("CL-6");
		lblCl_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCl_5.setBounds(840, 309, 69, 37);
		detail.add(lblCl_5);
		
		JEditorPane dtrpnNoOfRow = new JEditorPane();
		dtrpnNoOfRow.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dtrpnNoOfRow.setText("No. of Row : 8\r\nNo. of Asset : 60");
		dtrpnNoOfRow.setBackground(SystemColor.menu);
		dtrpnNoOfRow.setBounds(468, 202, 199, 70);
		detail.add(dtrpnNoOfRow);
		
		JEditorPane dtrpnNoOfRow1 = new JEditorPane();
		dtrpnNoOfRow1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dtrpnNoOfRow1.setText("No. of Row : 8\r\nNo. of Asset : 60");
		dtrpnNoOfRow1.setBackground(SystemColor.menu);
		dtrpnNoOfRow1.setBounds(114, 389, 199, 70);
		detail.add(dtrpnNoOfRow1);
		
		JEditorPane dtrpnNoOfRow2 = new JEditorPane();
		dtrpnNoOfRow2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dtrpnNoOfRow2.setText("No. of Row : 4\r\nNo. of Asset : 30");
		dtrpnNoOfRow2.setBackground(SystemColor.menu);
		dtrpnNoOfRow2.setBounds(468, 389, 199, 70);
		detail.add(dtrpnNoOfRow2);
		
		JEditorPane dtrpnNoOfRow3 = new JEditorPane();
		dtrpnNoOfRow3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dtrpnNoOfRow3.setText("No. of Row : 8\r\nNo. of Asset : 60");
		dtrpnNoOfRow3.setBackground(SystemColor.menu);
		dtrpnNoOfRow3.setBounds(792, 202, 199, 70);
		detail.add(dtrpnNoOfRow3);
		
		JEditorPane dtrpnNoOfRow4 = new JEditorPane();
		dtrpnNoOfRow4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dtrpnNoOfRow4.setText("No. of Row : 4\r\nNo. of Asset : 30");
		dtrpnNoOfRow4.setBackground(SystemColor.menu);
		dtrpnNoOfRow4.setBounds(792, 389, 199, 70);
		detail.add(dtrpnNoOfRow4);
		
		JEditorPane dtrpnNoOfRow5 = new JEditorPane();
		dtrpnNoOfRow5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dtrpnNoOfRow5.setText("No. of Row : 8\r\nNo. of Asset : 60");
		dtrpnNoOfRow5.setBackground(SystemColor.menu);
		dtrpnNoOfRow5.setBounds(114, 202, 199, 70);
		detail.add(dtrpnNoOfRow5);
		
		JEditorPane dtrpnWelcome = new JEditorPane();
		dtrpnWelcome.setFont(new Font("Tahoma", Font.BOLD, 18));
		dtrpnWelcome.setForeground(Color.WHITE);
		dtrpnWelcome.setText(    usernme);
		dtrpnWelcome.setBackground(new Color(0, 0, 51));
		dtrpnWelcome.setBounds(1125, 159, 235, 40);
		frame.getContentPane().add(dtrpnWelcome);
		
		JEditorPane dtrpnWelcome_1 = new JEditorPane();
		dtrpnWelcome_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		dtrpnWelcome_1.setText("    WELCOME  :-");
		dtrpnWelcome_1.setForeground(Color.WHITE);
		dtrpnWelcome_1.setBackground(new Color(0, 0, 51));
		dtrpnWelcome_1.setBounds(955, 159, 173, 40);
		frame.getContentPane().add(dtrpnWelcome_1);
		
		
		
		
	}
}

		