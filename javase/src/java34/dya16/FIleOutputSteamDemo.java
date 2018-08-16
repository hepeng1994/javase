package java34.dya16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FIleOutputSteamDemo {
	public static void main(String[] args) {
		
	
	try (
			FileOutputStream fos=new FileOutputStream("d:/a.txt");
			){
		fos.write(97);
		fos.write("海阔天空".getBytes());
	} catch (Exception e) {	
		e.printStackTrace();
		}
	}
}
