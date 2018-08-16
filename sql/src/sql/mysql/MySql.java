package sql.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MySql {
	public static void main(String[] args) throws SQLException {
		
		//new 
		DriverManager.deregisterDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day02", "root","root");
	
		Statement c = con.createStatement();
		String d ="SELECT * FROM products";
		ResultSet e = c.executeQuery(d);
		while(e.next()) {
			String f =e.getString(1);
			System.out.println(f);
		}
		e.close();
		c.close();
		con.close();
	}
	
}
