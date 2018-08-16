package java34.dya17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		
		try (
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:/a.txt"));
				){
			Object a=ois.readObject();
			List<LiseDemo> c=(List<LiseDemo>)a;
			
			System.out.println(c);
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
