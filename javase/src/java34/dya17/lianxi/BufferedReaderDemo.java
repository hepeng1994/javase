package java34.dya17.lianxi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * 	1.使用五种流 	拷贝文件，封装到工具类中，并打印拷贝的时间
 * 		a. FileInputStream/FileOutputStream			文件字节流
 * 		b. BufferedInputStream/BufferedOutputStream	缓冲字节流
 * 		c. InputStreamReader/OutputStreamWriter		转换流
 * 		d. FileReader/FilerWriter					文件字符流
 * 		e. BufferedReader/BufferedWriter			缓冲字符流
 *
 */

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		try (
				BufferedReader br=new BufferedReader(new FileReader("d:/a.txt"));
				){
		/*	char [] ch=new char[1024];
			int length;
			while((length=br.read(ch))!=-1){
				System.out.println(new String(ch,0,length));
			}*/
			
			String sr;
			while((sr=br.readLine())!=null){
				System.out.println(sr);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
