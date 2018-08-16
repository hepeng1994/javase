package java34.dya19.Tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSeryerDemo {
	public static void main(String[] args) {
		
		try (
				ServerSocket ss=new ServerSocket(6666);
				
				Socket socket = ss.accept();
				
				InputStream stream = socket.getInputStream();
				
				
				BufferedReader br=new BufferedReader(new InputStreamReader(stream));
				){
			
			String s;
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write("你好");
			bw.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
