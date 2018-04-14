package LoginSys;
import LoginSys.cdb;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

import LoginSys.Conh2;

import java.sql.*;

public class Database {
	 static String name;
	static String pas;
	  public Database(String dname, String dpas) {
		// TODO Auto-generated constructor stub
	name=dname;
	pas=dpas;
	  }

	public static void main(String[] args) {
		 try
		    {
		     Connection c = Conh2.getConnection();
		      Statement st = c.createStatement();
		      String cc1 ="CREATE TABLE COMP1(NAME VARCHAR2(20)NOT NULL,AID VARCHAR2(30) NOT NULL,ATYPE VARCHAR2(500) NOT NULL,DESCRIPTION VARCHAR2(1000) NOT NULL)";
		      String o1 ="CREATE TABLE  FEEDBACK1(UNAME VARCHAR2(30) NOT NULL,RATING NUMBER(10) NOT NULL,LIKED VARCHAR2(1000) NOT NULL, SUGG VARCHAR2(1000) NOT NULL)";
		      String Application1 = "CREATE TABLE  SIGNUP1(UNAME VARCHAR2(10) PRIMARY KEY NOT NULL, EMAIL VARCHAR2(40) NOT NULL,PASS VARCHAR2(20) NOT NULL)";
		      String asset="CREATE TABLE ASSET1(LAB VARCHAR2(10) NOT NULL,ASSET_ID VARCHAR2(20) PRIMARY KEY,ROW VARCHAR2(10) NOT NULL,POSITION INTEGER(10) NOT NULL,OS VARCHAR2(20) NOT NULL)";
		      st.executeUpdate(cc1);
		      st.executeUpdate(o1);
		      st.executeUpdate(Application1);
		      st.executeUpdate(asset);
		      c.close();
		    
		      //JOptionPane.showMessageDialog(null, "Database created with user name:- "+name);
	
		      int dialogButton = JOptionPane.YES_NO_OPTION;
	            JOptionPane.showConfirmDialog (null, "Are you sure?","WARNING", dialogButton);
	            if(dialogButton == JOptionPane.YES_OPTION) {
	           new cdb();
	            	
	            if(dialogButton == JOptionPane.NO_OPTION) {
	            	 LoginSystem.main(null);
	                }
	              }
		
		     }
		    catch (Exception e)
		    {
		      JOptionPane.showMessageDialog(null, "Database already exists with user name:- "+name);
		    
		    }
		  

	}

}
