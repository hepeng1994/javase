package java34.dya16;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) {
		
		try (
				BufferedInputStream fis=new BufferedInputStream(new FileInputStream("d:/a.txt"));
				){
			byte [] a=new byte[1024];
			int len;
			while((len=fis.read(a))!=-1){
				System.out.println(new String(a,0,len));
			}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

}
