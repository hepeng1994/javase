package java34.dya19.lianxi;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpClientDemo {
	public static void main(String[] args) {
		
		try {
			//创建一个DatagramSocket，用来向服务器发送数据 DatagramSocket表示接受或发送数据报的套接字
			DatagramSocket ds=new DatagramSocket();
			System.out.println("准备发送数据");
			//创建数据包，用于发送
			byte [] bs="强哥最帅".getBytes();
			//获取本机ip对象
			InetAddress ip = InetAddress.getLocalHost();
			//DatagramPacket表示存放数据的数据报  存放数据
			DatagramPacket dp=new DatagramPacket(bs, bs.length,ip,8888);
			//发送数据包
			ds.send(dp);
			
			System.out.println("数据发送完毕");
			
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
