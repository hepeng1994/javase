package java34.dya16;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
	public static void main(String[] args) {
		try(
				BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream("d:/a.txt"));
				) {
			fos.write("你好啊".getBytes());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
