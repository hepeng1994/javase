package java34.dya17.lianxi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		
		try(
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:/a.txt") );
				) {
			
			Object object = ois.readObject();
			System.out.println(object);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}
}
