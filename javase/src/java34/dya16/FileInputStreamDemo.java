package java34.dya16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java34.Util.ArrayUtil;
import java34.Util.CobyMethod;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		
		try(
				FileInputStream fis=new FileInputStream("E:\\学习\\day15\\资料\\昨日重现.txt");
				FileOutputStream fos=new FileOutputStream("d:/b.txt");
				) {
			//int a1=fis.read();
			//System.out.println((char)a1);
			byte [] a=new byte[1024];
			//int length=fis.read(a);
			//String s=new String(a,0,length);
			//System.out.println(s);
			
			int len;
			while((len=fis.read(a))!=-1){
				System.out.println(new String(a,0,len));
			
			fos.write(a,0,len);
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		CobyMethod.bisAndBosCopy("d:\\WeChat Files\\zhangbin900901\\HDHeadImage\\e289277abded90637163d56591c8cb79_1.jpg", "d:/a.jpg");
		CobyMethod.fisAndFosCopy("E:\\学习\\day15\\视频\\15.文件类.mp4","d:/a.mp4");
	}

}
