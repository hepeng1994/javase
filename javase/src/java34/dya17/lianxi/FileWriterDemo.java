package java34.dya17.lianxi;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		
		try(
				FileWriter fw=new FileWriter("d:/a.txt");
				) {
			fw.write("真正的汉子");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
