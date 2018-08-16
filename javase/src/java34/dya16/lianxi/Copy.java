package java34.dya16.lianxi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Copy {
	public static void main(String[] args) {
		
	}
	public static void a(String path,String p){
		
		try(
				BufferedInputStream bis=new BufferedInputStream(new FileInputStream(path));
				BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(p));
				) {
			byte [] a=new byte[1024];
			int length;
			while((length=bis.read(a))!=-1){
				bos.write(a, 0, length);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
