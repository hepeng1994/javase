package java34.dya16.lianxi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) {
		try(
				BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:/a.txt"));
				) {
			byte [] a=new byte[1024];
			
			int length;
			while((length=bis.read(a))!=-1){
				System.out.println(new String(a,0,length));
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
