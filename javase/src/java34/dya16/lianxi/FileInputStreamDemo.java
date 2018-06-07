package java34.dya16.lianxi;

import java.io.FileInputStream;




public class FileInputStreamDemo {
	public static void main(String[] args) {
		try(
				FileInputStream fis=new FileInputStream("d:/a.txt");
				) {
			byte []a=new byte[1024];
			int length=fis.read(a);
			System.out.println(new String(a,0,length));
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
