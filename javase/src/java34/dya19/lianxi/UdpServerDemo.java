package java34.dya19.lianxi;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServerDemo {
	public static void main(String[] args) {
		try {
			//创建DatagramSocket 对象，用来接收客户发过来的数据，并监听一个端口号
			DatagramSocket ds=new DatagramSocket(8888);
			
			System.out.println("服务器已启动。。。");
			//创建一个DatagramPacket对象，用来接收客户端发过来的数据
			byte[] bs=new byte[64*1024];
			
			DatagramPacket dp=new DatagramPacket(bs, bs.length);
			//使用ds对象接收数据，调用完该方法，数据就进入到dp对象中
			ds.receive(dp);
			//拆包，解析数据
			byte[] data = dp.getData();//客户端发过来的数据
			int length = dp.getLength();//发过来的数据长度
			InetAddress ip = dp.getAddress();//客户端的ip信息
			System.out.println(ip.getHostAddress()+":"+new String (data,0,length));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
