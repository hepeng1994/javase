package java34.dya20.lianxi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class TcpImpServerDemo {
	public static void main(String[] args) {
		
		
			 
			try {
				ServerSocket ss = new ServerSocket(9999);
				while(true){
					Socket accept = ss.accept();
					new Thread(new Uploadtask(accept) ).start();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

}
class Uploadtask implements Runnable{
	Socket accept;
	public  Uploadtask(Socket accept){
		this.accept=accept;
	}

	@Override
	public void run() {
	
		try {
			BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d:/"+System.nanoTime()+".txt"));
			
			byte[] bs=new byte[64*1024];
			int s;
			while((s=bis.read(bs))!=-1){
				bos.write(bs,0,s);
			}
			bos.flush();
			bos.close();
			bis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}