package java34.dya19.lianxi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class TcpServerDemo2 {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(8888);
			Socket accept = ss.accept();
			InputStream stream = accept.getInputStream();
			BufferedReader br=new BufferedReader(new InputStreamReader(stream));
			
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
			stream.close();
			accept.close();
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
