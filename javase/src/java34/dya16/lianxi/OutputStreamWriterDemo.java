package java34.dya16.lianxi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class OutputStreamWriterDemo {
	public static void main(String[] args) {
		try(
				//字符流输入
				OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("d:/a.txt"),"gbk");
				) {
			osw.write("你能耐我he");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}

}
