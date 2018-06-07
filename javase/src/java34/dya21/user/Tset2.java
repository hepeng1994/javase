package java34.dya21.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Tset2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream f = new FileInputStream(new File("src/config.properties"));
		p.load(f);
		String s = p.getProperty("className");
		System.out.println(s);
		User1 n =(User1) Class.forName(s).newInstance();
		n.add();
	}
}
