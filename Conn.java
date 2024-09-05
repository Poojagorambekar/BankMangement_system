package BankManagement;

import java.sql.*;

public class Conn {
	
	Connection c;
	Statement s;
	public Conn()
	{
		try
		{
			c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","active@123");
			s=c.createStatement();
		}catch(Exception e)
		
		{
			System.out.println(e);
		}
	}

}
