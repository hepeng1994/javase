package java34.dya17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		
		try (
				BufferedWriter bw=new BufferedWriter(new FileWriter("d:/a.txt"));
				){
			bw.write("明月几时有，把酒问青天");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
