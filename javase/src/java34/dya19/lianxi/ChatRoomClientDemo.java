package java34.dya19.lianxi;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class ChatRoomClientDemo  implements Runnable{

	@Override
	public void run() {
		try {
			DatagramSocket ds=new DatagramSocket();
			
			InetAddress ip = InetAddress.getByName("192.168.11.255");
			
			DatagramPacket dp;
			
			Scanner scr=new Scanner(System.in);
			String s;
			while((s=scr.nextLine())!=null){
				dp=new DatagramPacket(s.getBytes(), s.getBytes().length,ip,8888);
				ds.send(dp);
				if("over".equals(s)){
					break;
				}
			}
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
