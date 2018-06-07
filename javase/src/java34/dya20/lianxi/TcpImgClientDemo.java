package java34.dya20.lianxi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpImgClientDemo {
	public static void main(String[] args) {
		
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:/a.txt"));
			
			Socket s=new Socket("192.168.11.155",9999);
			OutputStream stream = s.getOutputStream();
			BufferedOutputStream bos=new BufferedOutputStream(stream);
			
			byte [] bs=new byte[1024];
			int length;
			while((length=bis.read(bs))!=-1){
				bos.write(bs,0,length);
			}
			bos.flush();
			bos.close();
			stream.close();
			s.close();
			bis.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
