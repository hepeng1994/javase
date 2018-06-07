package java34.dya16.lianxi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStreamDemo1 {
	public static void main(String[] args) {
		
		try (
				////1. 创建一个输入字节流的对象，用来读文件
				FileInputStream fis=new FileInputStream("e:/昨日重现.txt");
				//创建一个输出字节流的对象，用来写入文件
				FileOutputStream fos=new FileOutputStream("e:/a.txt");
				){
			//创建一个Byte数组用来接收文件内容
			byte[] a=new byte[1024];
			//定义一个长度
			int length;
			//这个数组的长度不能为-1，读出指定文件中的内容
			while((length=fis.read(a))!=-1){
				//把读出指定文件中的内容写入指定文件中内容
				fos.write(a, 0, length);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
