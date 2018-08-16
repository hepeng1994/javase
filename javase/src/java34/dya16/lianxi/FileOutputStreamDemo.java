package java34.dya16.lianxi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		try(
				FileOutputStream fos=new FileOutputStream("d:/a.txt",false);
				) {
			fos.write(97);
			String str="轻轻的我走了，正如我轻轻地来";
			fos.write(str.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
