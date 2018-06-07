package java34.dya19.Tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo {
	public static void main(String[] args) {
		
		try(
				Socket s=new Socket("192.168.11.155",6666);
				
				OutputStream stream = s.getOutputStream();
				
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(stream));
				) {
			
			bw.write("强哥好帅");
			bw.newLine();
			bw.flush();
			s.shutdownInput();
			BufferedReader dr=new BufferedReader(new InputStreamReader( s.getInputStream()));
			String ss;
			while((ss=dr.readLine())!=null){
				System.out.println(ss);
			}
			   
		} catch (Exception e) {
			
			e.printStackTrace();
	
		}
	}

}
