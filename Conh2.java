package LoginSys;
import LoginSys.cdb;

import java.sql.*;
import LoginSys.cdb;

import org.omg.CORBA.INITIALIZE;


public class Conh2 {
	static String name;
	public Conh2(String dnam) {
		// TODO Auto-generated constructor stub
	 name=dnam;
	 
INITIALIZE();
	}
	
	private void INITIALIZE() {
		// TODO Auto-generated method stub
		
	}

	public Conh2()
	{
		
		
	}

	public static Connection getConnection()
	{
		try
		{ 
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:~/"+name+"", "+name+", "+pass+");
			return con;
			
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
		
	}
}
