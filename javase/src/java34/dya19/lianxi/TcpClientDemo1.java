package java34.dya19.lianxi;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpClientDemo1 {
	public static void main(String[] args) {
		
		
		try {
			Socket s=new Socket("localhost",8888);
			OutputStream stream = s.getOutputStream();
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(stream));
			
			Scanner scr=new Scanner(System.in);
			String st;
			while((st=scr.nextLine())!=null){
				bw.write(st);
				bw.newLine();
				bw.flush();
				if("over".equals(st)){
					break;
				}
			}
			bw.close();
			stream.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
