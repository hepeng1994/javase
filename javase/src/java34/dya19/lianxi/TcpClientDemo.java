package java34.dya19.lianxi;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TcpClientDemo {
	public static void main(String[] args) {
		
		try {
			Socket s=new Socket("192.168.11.155",9999);
			
			OutputStream stream = s.getOutputStream();
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(stream));
			
			bw.write("强哥");
			bw.newLine();
			bw.flush();
			s.shutdownOutput();
			
			InputStream stream2 = s.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(stream2));
			System.out.println(br.readLine()); 
			br.close();
			bw.close();
			stream.close();
			
			s.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
