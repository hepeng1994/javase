package java34.dya17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputSreamDemo {
	public static void main(String[] args) {
		List<LiseDemo> list=new ArrayList<>();
		list.add(new LiseDemo("王",15,'男'));
		try(
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
				) {
			
			 
			oos.writeObject(list);
			
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
