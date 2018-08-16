package java34.dya21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Properties  s=new Properties();
		FileInputStream  fs=new FileInputStream(new File("src/config.properties"));
		s.load(fs);
		String property = s.getProperty("className");
		 Rend r = (Rend) Class.forName(property).newInstance();
		 r.rend();
	

}
}