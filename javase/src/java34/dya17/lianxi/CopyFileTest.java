package java34.dya17.lianxi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyFileTest {
	public static void main(String[] args) {
		
		try(
				InputStreamReader isr=new InputStreamReader(new FileInputStream(""));
				OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(""));
				
				) {
			char []ch=new char[1024];
			int length;
			while((length=isr.read(ch))!=-1){
				osw.write(ch, 0, length);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
