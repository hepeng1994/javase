package java34.dya19.lianxi;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ChatroomServerDemo implements Runnable{

	@Override
	public void run() {
	
		try {
			DatagramSocket ds=new DatagramSocket(8888);
			
			byte [] bs=new byte[64*1024];
			DatagramPacket dp=new DatagramPacket(bs, bs.length);
			while(true){
				
				ds.receive(dp);
				byte[] data = dp.getData();
				int length = dp.getLength();
				InetAddress ip = dp.getAddress();
				System.out.println(ip.getHostAddress()+","+ip.getHostName()+","+new String(data,0,length));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
