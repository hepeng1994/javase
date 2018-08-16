package java34.dya16.lianxi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		try(
				//字符流输入
				InputStreamReader isr=new InputStreamReader(new FileInputStream("d:/a.txt"),"gbk");
				)
				{
			char [] a=new char[1024];
			int length;
			while((length=isr.read(a))!=-1){
				System.out.println(new String(a,0,length));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
	}

}
