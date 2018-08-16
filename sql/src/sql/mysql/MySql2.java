package sql.mysql;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MySql2 {
	static String root;
	static String url;
	static String passWord;
	static{
		try {
			FileInputStream f = new FileInputStream(new File("config/propertres"));
			Properties a =new Properties();
			a.load(f);
			String className = a.getProperty("className");
			Class.forName(className);
			root = a.getProperty("userName");
			url=a.getProperty("url");
			passWord=a.getProperty("passWord");
			f.close();
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws Exception {
		Statement c=null;
		Connection con=null;
		ResultSet f=null;
		try {
			con = DriverManager.getConnection(url,root,passWord);
			c = con.createStatement();
			String a="SELECT * FROM products";
			f = c.executeQuery(a);
			while(f.next()){
				String string = f.getString(1);
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (f!=null) {
				f.close();
				f=null;
			}
			if (c!=null) {
				c.close();
				c=null;
			}
			if (con!=null) {
				con.close();
				con=null;
			}
		}
		
	}
}
