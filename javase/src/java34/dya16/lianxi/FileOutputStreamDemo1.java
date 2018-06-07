package java34.dya16.lianxi;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo1 {
	public static void main(String[] args) {
		try(
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d:/c.txt"));
				) {
			String a="人生与梦";
			bos.write(a.getBytes());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
