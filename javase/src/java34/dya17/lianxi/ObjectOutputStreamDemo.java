package java34.dya17.lianxi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		
		try(
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
				) {
			
			oos.writeObject("美好的一天从现在开始");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}

}
