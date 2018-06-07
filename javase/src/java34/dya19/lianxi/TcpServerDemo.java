package java34.dya19.lianxi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {
	public static void main(String[] args) {
		
		try {
			ServerSocket ss=new ServerSocket(9999);
			
			Socket accept = ss.accept();
			InputStream stream = accept.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(stream));
			String s;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			System.out.println("aaaaaaa");
		OutputStream stream2 = accept.getOutputStream();
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(stream2));
		bw.write("收到");
		bw.newLine();
		bw.flush();
		//bw.close();
		//br.close();
		//stream.close();
		ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
