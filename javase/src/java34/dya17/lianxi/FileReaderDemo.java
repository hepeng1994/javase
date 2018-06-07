package java34.dya17.lianxi;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) {
		
		try(
				FileReader fr=new FileReader("d:/a.txt");
				
				){
			char[] ch=new char[1024];
			int length;
			while((length=fr.read(ch))!=-1){
				System.out.println(new String(ch,0,length));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
