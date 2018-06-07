package java34.dya19.liao;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatroomServerDemo implements Runnable {

	public void run(){
		try(	//创建 DatagramSocket 对象，用来接收客户端发过来的数据，并监听一个名字
				DatagramSocket da=new DatagramSocket(8888);
				) {
			System.out.println("服务端已启动");
			
			//创建一个DatagramPacket对象，用来接收客户端发过来的数据
			byte[] bs=new byte[64*1024];
			DatagramPacket dp=new DatagramPacket(bs, bs.length);
			while(true){
				
				da.receive(dp);
				
				byte[] data=dp.getData();
				int length = dp.getLength();
				InetAddress ip=dp.getAddress();
				
				System.out.println(ip.getHostAddress()+":"+new String(data,0,length));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
