package java34.dya19.liaotian;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpClientDemo {
	public static void main(String[] args) {
		try(
				
				DatagramSocket da=new DatagramSocket();
				) {
			System.out.println("准备发送数据");
		
			
			Scanner  scr=new Scanner(System.in);
			String line = scr.nextLine();
			byte[] bs=line.getBytes();
				
				
				
				InetAddress ip=InetAddress.getByName("192.168.11.153");
				DatagramPacket dp=new DatagramPacket(bs, bs.length,ip,6666);
			
				while(true){
					
					da.send(dp);
				}
			
			
				
		
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
