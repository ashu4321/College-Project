package LoginSys;

import java.awt.*;

import LoginSys.Conh2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;

public class Adminpage extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JTable table;
	private JTextField textField_4;
	private CardLayout cd;
	private JTable table_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField,textfield1;
	private JTable table_2;
	private JTable table_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminpage frame = new Adminpage();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Adminpage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Adminpage.class.getResource("/image/system.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
	    setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLUE);
		panel.setBounds(0, 0, 1184, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				cd.show(panel_1, "t1");
				
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 51));
		btnNewButton.setBounds(117, 0, 118, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 0, 51));
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cd.show(panel_1, "t2");
			}
		});
		btnNewButton_1.setBounds(234, 0, 118, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(0, 0, 51));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_1, "t3");
			}
		});
		btnNewButton_2.setBounds(351, 0, 118, 40);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("COMPLAINT");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(0, 0, 51));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cd.show(panel_1, "t4");
			}
		});
		btnNewButton_3.setBounds(468, 0, 118, 40);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("FEEDBACK");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(new Color(0, 0, 51));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_1, "t5");
			}
		});
		btnNewButton_4.setBounds(585, 0, 118, 40);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("SHOW USER");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setBackground(new Color(0, 0, 51));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cd.show(panel_1, "t7");
			}
		});
		btnNewButton_6.setBounds(702, 0, 129, 40);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("Logout");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginSystem().frame.setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_8.setBackground(new Color(0, 0, 51));
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBounds(960, 0, 129, 40);
		panel.add(btnNewButton_8);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new home("Admin").frame.setVisible(true);
				cd.show(panel_1, "t9");
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnHome.setBackground(new Color(0, 0, 51));
		btnHome.setForeground(Color.WHITE);
		btnHome.setBounds(0, 0, 118, 40);
		panel.add(btnHome);
		
		JButton btnShowAssets = new JButton("SHOW ASSETS");
		btnShowAssets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cd.show(panel_1, "t9");	
			}
		});
		btnShowAssets.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnShowAssets.setForeground(Color.WHITE);
		btnShowAssets.setBackground(new Color(0, 0, 51));
		btnShowAssets.setBounds(832, 0, 129, 40);
		panel.add(btnShowAssets);
		
		cd=new CardLayout();
	    panel_1 = new JPanel();
		panel_1.setBounds(0, 45, 1180, 610);
		contentPane.add(panel_1);
		panel_1.setLayout(cd);
		
		//insert
		JPanel insert = new JPanel();
		panel_1.add(insert, "t1");
		insert.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "CL-1", "CL-2", "CL-3", "CL-4", "CL-5", "CL-6"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setBounds(136, 116, 188, 52);
		insert.add(comboBox);
		
		JLabel lblLab = new JLabel("Lab");
		lblLab.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLab.setBounds(195, 56, 59, 31);
		insert.add(lblLab);
		
		
		JLabel lblAssetId = new JLabel("Asset ID");
		lblAssetId.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblAssetId.setBounds(533, 50, 112, 43);
		insert.add(lblAssetId);
		
		
			
		
		textField = new JTextField();
		textField.setBounds(483, 123, 216, 43);
		insert.add(textField);
		textField.setColumns(10);
	
		
		JLabel lblRow = new JLabel("Row");
		lblRow.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblRow.setBounds(932, 56, 55, 31);
		insert.add(lblRow);
		
		textField_1 = new JTextField();
		textField_1.setBounds(852, 123, 216, 43);
		insert.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPositionrightTo = new JLabel("Position (Right to Left)");
		lblPositionrightTo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPositionrightTo.setBounds(239, 227, 293, 31);
		insert.add(lblPositionrightTo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(265, 287, 216, 43);
		insert.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblOsoperatingSystem = new JLabel("OS (Operating System)");
		lblOsoperatingSystem.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblOsoperatingSystem.setBounds(634, 221, 293, 43);
		insert.add(lblOsoperatingSystem);
		
		textField_3 = new JTextField();
		textField_3.setBounds(669, 289, 216, 39);
		insert.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAddAsset = new JButton("Add Asset");
		btnAddAsset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				String combo8=(String)comboBox.getSelectedItem();   //labs name
				String aid=textField.getText().toUpperCase();  //aid
				String rown=textField_1.getText().toUpperCase(); //row
				int anum=Integer.parseInt(textField_2.getText()); //position
				String ops=textField_3.getText();
				
				
				if(aid.isEmpty() && rown==null && anum==0 && ops==null) {
					JOptionPane.showMessageDialog(null,"Enter the details correctly");
			    					}
				else
				{

				try {
					Connection con = Conh2.getConnection();
				    PreparedStatement stmt=con.prepareStatement("INSERT INTO ASSET1 VALUES(?,?,?,?,?)");
				    stmt.setString(1,combo8);
				    stmt.setString(2,aid );
				    stmt.setString(3, rown);
				    stmt.setInt(4, anum);
				    stmt.setString(5, ops);
				    stmt.executeUpdate();
				     
				  con.close();
				  JOptionPane.showMessageDialog(null, "Asset inserted succesfully at "+combo8 +" ");
				  
				}
				catch(Exception ew)
				{
					ew.printStackTrace();
					JOptionPane.showMessageDialog(null,"Asset Already Inserted with same Asset ID:"+aid+" at Lab:"+combo8+"");
					
				}
				}
				comboBox.setSelectedItem("Select");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				} 	
	});		

				
			
			
		
		btnAddAsset.setForeground(new Color(0, 0, 51));
		btnAddAsset.setBackground(SystemColor.controlHighlight);
		btnAddAsset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAddAsset.setBounds(492, 412, 188, 43);
		insert.add(btnAddAsset);
				
				//update
				
				JPanel update = new JPanel();
				panel_1.add(update, "t2");
				update.setLayout(null);
				JComboBox comboBox1 = new JComboBox();
				comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CL-1", "CL-2", "CL-3", "CL-4", "CL-5", "CL-6"}));
				comboBox1.setFont(new Font("Tahoma", Font.BOLD, 16));
				comboBox1.setBounds(125, 102, 181, 44);
				update.add(comboBox1);
				
				JLabel lblLab1 = new JLabel("Lab");
				lblLab1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblLab1.setBounds(182, 34, 68, 40);
				update.add(lblLab1);
				
				JLabel lblAssetId1 = new JLabel("Asset ID");
				lblAssetId1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblAssetId1.setBounds(533, 39, 106, 31);
				update.add(lblAssetId1);
				
				textfield1 = new JTextField();
				textfield1.setBounds(469, 104, 222, 45);
				update.add(textfield1);
				textfield1.setColumns(10);
				
				JLabel lblRow1 = new JLabel("Row");
				lblRow1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblRow1.setBounds(928, 39, 55, 31);
				update.add(lblRow1);
				
				JTextField textField2 = new JTextField();
				textField2.setBounds(852, 104, 214, 44);
				update.add(textField2);
				textField2.setColumns(10);
				
				JLabel lblPositionrightTo1 = new JLabel("Position (Right to Left)");
				lblPositionrightTo1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblPositionrightTo1.setBounds(249, 200, 286, 31);
				update.add(lblPositionrightTo1);
				
				JTextField textField4 = new JTextField();
				textField4.setBounds(677, 276, 214, 44);
				update.add(textField4);
				textField4.setColumns(10);
				
				JLabel lblOsoperatingSystem1 = new JLabel("OS (Operating System)");
				lblOsoperatingSystem1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblOsoperatingSystem1.setBounds(660, 200, 289, 31);
				update.add(lblOsoperatingSystem1);
				
				JTextField textField3 = new JTextField();
				textField3.setBounds(289, 275, 222, 45);
				update.add(textField3);
				textField3.setColumns(10);
				
				JButton btnUpdateAsset = new JButton("Update Asset");
				btnUpdateAsset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
					
			 		String combo10=(String)comboBox1.getSelectedItem();   //labs name
						String aid1=textfield1.getText().toUpperCase();  //aid
						String rown1=textField2.getText().toUpperCase(); //row
						int anum1=Integer.parseInt(textField3.getText()); //position
						String ops1=textField4.getText().toUpperCase();  //os
						
						
						if(aid1==null || rown1==null || anum1==0 || ops1==null) {
							JOptionPane.showMessageDialog(null,"Enter the details correctly");
					    	
							}
						else
						{

						try {
						   Connection con = Conh2.getConnection();
						   PreparedStatement stmt=con.prepareStatement("UPDATE ASSET1 SET ASSET_ID=?,ROW=?,POSITION=?,OS=? WHERE ASSET_ID=?");
						    stmt.setString(1,aid1);
						    stmt.setString(2,rown1);
						    stmt.setInt(3,anum1);
						    stmt.setString(4,ops1);
						    stmt.setString(5,aid1);
						    
						    
						    stmt.executeUpdate();
						    con.close();
						    JOptionPane.showMessageDialog(null,"Asset updated succesfully in "+combo10 +" successfully");
						}
						     
						catch(Exception ew)
						{
							ew.printStackTrace();
							JOptionPane.showMessageDialog(null,ew.getMessage());
							
						}
						}} 	
			});		

						
					
					
				
				btnUpdateAsset.setForeground(new Color(0, 0, 51));
				btnUpdateAsset.setBackground(SystemColor.controlHighlight);
				btnUpdateAsset.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnUpdateAsset.setBounds(497, 399, 189, 44);
				update.add(btnUpdateAsset);
						
				
				//delete
				JPanel delete = new JPanel();
				panel_1.add(delete, "t3");
				delete.setLayout(null);
				
				textField_4 = new JTextField();
				textField_4.setBounds(567, 201, 295, 51);
				delete.add(textField_4);
				textField_4.setColumns(10);
				
				
				
				JLabel lblEnterAssetId = new JLabel("Enter Asset ID");
				lblEnterAssetId.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblEnterAssetId.setBounds(621, 127, 185, 35);
				delete.add(lblEnterAssetId);
				
				JComboBox comboBox_1 = new JComboBox();
				comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
				comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "CL-1", "CL-2", "CL-3", "CL-4", "CL-5", "CL-6"}));
				comboBox_1.setBounds(282, 201, 228, 51);
				delete.add(comboBox_1);
				
				JLabel lblLab_1 = new JLabel("Lab");
				lblLab_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblLab_1.setBounds(357, 127, 50, 35);
				delete.add(lblLab_1);
				
				JButton btnDelete = new JButton("Delete");
				btnDelete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String combox=(String)comboBox_1.getSelectedItem();
						String aids=textField_4.getText().toUpperCase();
						
						
						if(combox=="Select" || aids.isEmpty() ||aids.contains("nietNIETCS/CS")) {
							JOptionPane.showMessageDialog(null," Please Enter Right Asset ID and lab For Deletion!!!!");
					    	
							
							textField_4.setText(""); 
							comboBox_1.setSelectedIndex(0);
					    	textField_4.requestFocus();
							}
						else
						{

						try {
							Connection con = Conh2.getConnection();
						    PreparedStatement stmt=con.prepareStatement("DELETE FROM ASSET1 WHERE ASSET_ID=?");
						    stmt.setString(1,aids);
						    stmt.executeUpdate();
						       
						  con.close();
						  JOptionPane.showMessageDialog(null,"Asset Deleted Successfully from "+combox);
						}
						catch(Exception ew)
						{
							ew.printStackTrace(); //for tracing the error
						}
						}}	
				});
				btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnDelete.setBounds(890, 204, 115, 40);
				delete.add(btnDelete);
				
				
				//feedback fetching
				JPanel feedback = new JPanel();
				panel_1.add(feedback, "t5");
				
				JButton btnRefresh = new JButton("REFRESH");
				btnRefresh.addActionListener(new ActionListener() {
					@SuppressWarnings("rawtypes")
					public void actionPerformed(ActionEvent arg0) {
					
					
						try {
							Connection con = Conh2.getConnection();
							PreparedStatement stmt=con.prepareStatement("select * from FEEDBACK1");
						    ResultSet rs=stmt.executeQuery();
						    DefaultTableModel dtm =(DefaultTableModel)table_1.getModel();
						     while (dtm.getRowCount() > 0){
				                 dtm.removeRow(0);              
				            }
						    
						    while (rs.next()) {
				                Vector row = new Vector();
				                table_1.setFont(new Font("Serif", Font.BOLD, 15));
				                    row.add(rs.getString(1));
				                    row.add(rs.getInt(2));    
				                    row.add(rs.getString(3));
		                            row.add(rs.getString(4));
				                dtm.addRow(row);
				                
				                }
						    
						    if(dtm.getRowCount()==0){
				                 JOptionPane.showMessageDialog(null,"No Data Found");
				             }
						  con.close();}
						   
						    
						    
						    
							    
							catch(Exception e)
							{
								e.printStackTrace();
								System.out.println(e);
								
							
						
						
						
					}
					}
				});
				
				JPanel panel_2 = new JPanel();
				
				JButton btnNewButton_10 = new JButton("Print");
				feedback.add(btnNewButton_10);
				btnNewButton_10.addActionListener(new ActionListener()
			    {
			      public void actionPerformed(ActionEvent e)
			      {
			        try
			        {
			          ComponentPrinter.printComponent(feedback);
			        }
			        catch (PrinterException e1)
			        {
			          JOptionPane.showMessageDialog(null, "Printer is not in use.");
			        }
			      }
			    });
				 btnNewButton_10.setFont(new Font("Serif", Font.BOLD, 15));
				
				GroupLayout gl_feedback = new GroupLayout(feedback);
				gl_feedback.setHorizontalGroup(
					gl_feedback.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_feedback.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_feedback.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_feedback.createSequentialGroup()
									.addComponent(btnRefresh)
									.addPreferredGap(ComponentPlacement.RELATED, 1018, Short.MAX_VALUE)
									.addComponent(btnNewButton_10)))
							.addContainerGap())
				);
				gl_feedback.setVerticalGroup(
					gl_feedback.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_feedback.createSequentialGroup()
							.addGroup(gl_feedback.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_10)
								.addComponent(btnRefresh))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
							.addContainerGap())
				);
				
				JScrollPane scrollPane_2 = new JScrollPane();
				scrollPane_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
					}
				});
				scrollPane_2.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
				scrollPane_2.setBackground(Color.GRAY);
				scrollPane_2.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
				GroupLayout gl_panel_2 = new GroupLayout(panel_2);
				gl_panel_2.setHorizontalGroup(
					gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
				);
				gl_panel_2.setVerticalGroup(
					gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
				);
				
				table_1 = new JTable();
				
				table_1.setModel(new DefaultTableModel(
					new Object[][] {
						
					},
					new String[] {
						"USER NAME", "RATING", "LIKED ABOUT US", "SUGGESTIONS"
					}
				) {
					/**
					 * 
					 */
					
					

					private static final long serialVersionUID = 1L;
					Class[] columnTypes = new Class[] {
						String.class, Integer.class, String.class, String.class
					};
					public Class getColumnClass(int columnIndex) {
					
						return columnTypes[columnIndex];
					}
					
					
					
				});
				
				
				table_1.setFont(new Font("Serif", Font.BOLD, 15));
				table_1.getColumnModel().getColumn(0).setPreferredWidth(106);
				table_1.getColumnModel().getColumn(1).setPreferredWidth(90);
				table_1.getColumnModel().getColumn(2).setPreferredWidth(400);
			
				table_1.getColumnModel().getColumn(3).setPreferredWidth(400);
				table_1.setEnabled(false);
				scrollPane_2.setViewportView(table_1);
				panel_2.setLayout(gl_panel_2);
				feedback.setLayout(gl_feedback);
				DefaultTableCellRenderer rendar4 = new DefaultTableCellRenderer();
			    rendar4.setHorizontalAlignment(JLabel.CENTER);

			    table_1.getColumnModel().getColumn(0).setCellRenderer(rendar4);
			    table_1.getColumnModel().getColumn(1).setCellRenderer(rendar4);
			    
		     
			

				

				
					
				
				
				
				
				//complaint
				JPanel complaint = new JPanel();
				panel_1.add(complaint, "t4");
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setToolTipText("");
				
				JButton btnNewButton_5 = new JButton("REFRESH Complaint");
				btnNewButton_5.addActionListener(new ActionListener() {
					@SuppressWarnings("unchecked")
					public void actionPerformed(ActionEvent arg0) {
						
						
		                
		                
						
						
						
						
						try {
							Connection con = Conh2.getConnection();
						    PreparedStatement stmt=con.prepareStatement("select * from COMP1 ");
						    ResultSet rs=stmt.executeQuery();
						    DefaultTableModel dtm =(DefaultTableModel)table.getModel();
						    
						    while (dtm.getRowCount() > 0){
				                 dtm.removeRow(0);              
				            }

							
						    while (rs.next()) {
				                Vector row = new Vector();
				                table.setFont(new Font("Serif", Font.BOLD, 15));
				                    row.add(rs.getString(1));
				                    row.add(rs.getString(2));    
				                    row.add(rs.getString(3));
		                            row.add(rs.getString(4));
				                dtm.addRow(row);
				                
				                
				                }
						    if(dtm.getRowCount()==0){
				                 JOptionPane.showMessageDialog(null,"No Data Found");
				                 con.close();
				             }
						     
						  }
						   
						    
						    
						    
							    
							catch(Exception e)
							{
								e.printStackTrace();
								System.out.println(e);
								
							
						
						
						
					}
					}
				});
				
				JButton btnNewButton_9 = new JButton("Print");
				complaint.add(btnNewButton_9);
				btnNewButton_9.addActionListener(new ActionListener()
			    {
			      public void actionPerformed(ActionEvent e)
			      {
			        try
			        {
			          ComponentPrinter.printComponent(complaint);
			        }
			        catch (PrinterException e1)
			        {
			          JOptionPane.showMessageDialog(null, "Printer is not in use.");
			        }
			      }
			    });
			    btnNewButton_9.setFont(new Font("Serif", Font.BOLD, 15));
			    
				
				
				
				GroupLayout gl_complaint = new GroupLayout(complaint);
				gl_complaint.setHorizontalGroup(
					gl_complaint.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_complaint.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_complaint.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_complaint.createSequentialGroup()
									.addComponent(btnNewButton_5)
									.addPreferredGap(ComponentPlacement.RELATED, 970, Short.MAX_VALUE)
									.addComponent(btnNewButton_9))
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE))
							.addContainerGap())
				);
				gl_complaint.setVerticalGroup(
					gl_complaint.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_complaint.createSequentialGroup()
							.addGroup(gl_complaint.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_9)
								.addComponent(btnNewButton_5))
							.addGap(3)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
							.addContainerGap())
				);
				
				
				table = new JTable();
				table.setEnabled(false);
				
				table.setModel(new DefaultTableModel(
						
						
					new Object[][] {
					},
					new String[] {
						"USER NAME", "ASSET ID", "DESCRIPTION", "ASSET TYPE"
					}
					
				));
				table.setRowHeight(3,40);
				table.setFont(new Font("Serif", Font.BOLD, 15));
				table.getColumnModel().getColumn(0).setPreferredWidth(100);
				table.getColumnModel().getColumn(1).setPreferredWidth(100);
				table.getColumnModel().getColumn(2).setPreferredWidth(500);
				table.getColumnModel().getColumn(3).setPreferredWidth(100);
				
				//or, set TableCellRenderer into a specified JTable column
				 //table.getColumnModel().getColumn(2).setCellRenderer(rend);
				
				
			   
				DefaultTableCellRenderer rendar2 = new DefaultTableCellRenderer();
				
				
				rendar2.setHorizontalAlignment(JLabel.CENTER);
			
			   

			    table.getColumnModel().getColumn(0).setCellRenderer(rendar2); 
			    table.getColumnModel().getColumn(1).setCellRenderer(rendar2);
			    //table.getColumnModel().getColumn(2).setCellRenderer(rendar2);
			    table.getColumnModel().getColumn(3).setCellRenderer(rendar2);
			    
				
				
				scrollPane.setViewportView(table);
				complaint.setLayout(gl_complaint);
				 

				
				//users show
				JPanel user = new JPanel();
				panel_1.add(user, "t7");
				
				JScrollPane scrollPane_21 = new JScrollPane();
				
				JButton btnNewButton_7 = new JButton("VIEW");
				btnNewButton_7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						try {
							Connection con = Conh2.getConnection();
							
							PreparedStatement stmt=con.prepareStatement("select * from SIGNUP1 ");
						    ResultSet rs=stmt.executeQuery();
						    DefaultTableModel dtm =(DefaultTableModel)table_2.getModel();
						    
						    while (dtm.getRowCount() > 0){
				                 dtm.removeRow(0);              
				            }
						    
						    while (rs.next()) {
				                Vector<Comparable> row = new Vector();
				                table_2.setFont(new Font("Serif", Font.BOLD, 15));
				                    row.add(rs.getString(1));
				                    row.add(rs.getString(2)); 
				                    row.add(rs.getString(3));
				                    		                           
				                dtm.addRow(row);
				                }
						    
						    if(dtm.getRowCount()==0){
				                 JOptionPane.showMessageDialog(null,"No Data Found");
				             }
						  con.close();}
						   
						    
						    
						    
							    
							catch(Exception r)
							{
								r.printStackTrace();
								System.out.println(r);
								
							
						
						
						
					}
					}
				});
				
				JButton btnNewButton_11 = new JButton("Print");
				user.add(btnNewButton_11);
				btnNewButton_11.addActionListener(new ActionListener()
			    {
			      public void actionPerformed(ActionEvent e)
			      {
			        try
			        {
			          ComponentPrinter.printComponent(user);
			        }
			        catch (PrinterException e1)
			        {
			          JOptionPane.showMessageDialog(null, "Printer is not in use.");
			        }
			      }
			    });
			    btnNewButton_11.setFont(new Font("Serif", Font.BOLD, 15));
					
				GroupLayout gl_user = new GroupLayout(user);
				gl_user.setHorizontalGroup(
					gl_user.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_user.createSequentialGroup()
							.addGroup(gl_user.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_user.createSequentialGroup()
									.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 956, Short.MAX_VALUE)
									.addComponent(btnNewButton_11))
								.addComponent(scrollPane_21, GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE))
							.addGap(20))
				);
				gl_user.setVerticalGroup(
					gl_user.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_user.createSequentialGroup()
							.addGroup(gl_user.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnNewButton_11)
								.addComponent(btnNewButton_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_21, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
				);
				
				table_2 = new JTable();
				table_2.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"USER NAME", "E-MAIL", "PASSWORD"
					}
				));
				table_2.getColumnModel().getColumn(0).setPreferredWidth(50);
				table_2.getColumnModel().getColumn(1).setPreferredWidth(50);
				table_2.getColumnModel().getColumn(2).setPreferredWidth(50);
				DefaultTableCellRenderer rendar = new DefaultTableCellRenderer();
				
			    rendar.setHorizontalAlignment(JLabel.CENTER);
			   

			    table_2.getColumnModel().getColumn(0).setCellRenderer(rendar); 
			    table_2.getColumnModel().getColumn(1).setCellRenderer(rendar);
			    table_2.getColumnModel().getColumn(2).setCellRenderer(rendar); 
				
				
				
				
				scrollPane_21.setViewportView(table_2);
				user.setLayout(gl_user);
				table_2.setEnabled(false);
				
				
				//asset show
				JPanel assetshow = new JPanel();
				panel_1.add(assetshow, "t9");
				
				JComboBox<Object> usercomb = new JComboBox<Object>();
				usercomb.setFont(new Font("Tahoma", Font.BOLD, 18));
				usercomb.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select", "CL-1", "CL-2", "CL-3", "CL-4", "CL-5", "CL-6"}));
				
				JButton btnShow = new JButton("SHOW");
				btnShow.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						String combo110=(String)usercomb.getSelectedItem();	
						
						
						try {						
						    Connection con =Conh2.getConnection();
						    PreparedStatement stmt=con.prepareStatement("select * FROM ASSET1 where LAB=?");
						    stmt.setString(1, combo110);
						    ResultSet rs=stmt.executeQuery();
						    DefaultTableModel dtm =(DefaultTableModel)table_4.getModel();
						    
						    while (dtm.getRowCount() > 0){
				                 dtm.removeRow(0);              
				            }
						    
						    while (rs.next()) 
						    {
						   	 table_4.setFont(new Font("Serif", Font.BOLD, 15));
				                Vector<Comparable> row1 = new Vector();
				                    row1.add(rs.getString(1));//lab
				                    row1.add(rs.getString(2)); //Assetid
				                    row1.add(rs.getString(3)); //row
				                    row1.add(rs.getInt(4));  //position
				                    row1.add(rs.getString(5)); //os
				                    
				                   dtm.addRow(row1);
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
				
				JPanel panel_3 = new JPanel();
				
				JButton btnNewButton_12 = new JButton("Print");
				assetshow.add(btnNewButton_12);
				btnNewButton_12.addActionListener(new ActionListener()
			    {
			      public void actionPerformed(ActionEvent e)
			      {
			        try
			        {
			          ComponentPrinter.printComponent(table_4);
			        }
			        catch (PrinterException e1)
			        {
			          JOptionPane.showMessageDialog(null, "Printer is not in use.");
			        }
			      }
			    });
			    btnNewButton_12.setFont(new Font("Serif", Font.BOLD, 15));
			    
			    
				GroupLayout gl_assetshow = new GroupLayout(assetshow);
				gl_assetshow.setHorizontalGroup(
					gl_assetshow.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_assetshow.createSequentialGroup()
							.addComponent(usercomb, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnShow, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 765, Short.MAX_VALUE)
							.addComponent(btnNewButton_12)
							.addGap(18))
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
				);
				gl_assetshow.setVerticalGroup(
					gl_assetshow.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_assetshow.createSequentialGroup()
							.addGroup(gl_assetshow.createParallelGroup(Alignment.BASELINE)
								.addComponent(usercomb, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnShow, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_12))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
				);
				
				JScrollPane scrollPane_1 = new JScrollPane();
				GroupLayout gl_panel_3 = new GroupLayout(panel_3);
				gl_panel_3.setHorizontalGroup(
					gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 1180, GroupLayout.PREFERRED_SIZE)
				);
				gl_panel_3.setVerticalGroup(
					gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(2)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE))
				);
				
				table_4 = new JTable();
				table_4.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
					"LAB" , "ASSET I.D", "ROW NUMBER", "ASSET POSITION(R-L)", "O.S"
					}
				) {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;
					/**
					 * 
					 */
				Class[] columnTypes = new Class[] {
						String.class,String.class, String.class, Integer.class, String.class
					};
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
				});
				table_4.getColumnModel().getColumn(0).setPreferredWidth(109);
				table_4.getColumnModel().getColumn(1).setPreferredWidth(92);
				table_4.getColumnModel().getColumn(2).setPreferredWidth(132);
				table_4.getColumnModel().getColumn(3).setPreferredWidth(109);
                DefaultTableCellRenderer rendar1 = new DefaultTableCellRenderer();
			
			    rendar1.setHorizontalAlignment(JLabel.CENTER);
			   

			    table_4.getColumnModel().getColumn(0).setCellRenderer(rendar); 
			    table_4.getColumnModel().getColumn(1).setCellRenderer(rendar);
			    table_4.getColumnModel().getColumn(2).setCellRenderer(rendar);
			    table_4.getColumnModel().getColumn(3).setCellRenderer(rendar);
			    table_4.getColumnModel().getColumn(4).setCellRenderer(rendar);
				scrollPane_1.setViewportView(table_4);
				panel_3.setLayout(gl_panel_3);
				assetshow.setLayout(gl_assetshow);
				table_4.setEnabled(false);
				
				
				
			}
}