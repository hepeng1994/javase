package java34.dya19.lianxi;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ip = InetAddress.getLocalHost();//获取本机ip对象
		System.out.println(ip.getHostAddress());//ip地址
		System.out.println(ip.getHostName());//主机名
		
		InetAddress ip1=InetAddress.getByName("DESKTOP-J6SVKVL");
		System.out.println(ip1.getHostAddress());
		System.out.println(ip1.getHostName());
		
		InetAddress ip2 = InetAddress.getByName("192.168.11.155");
		System.out.println(ip2.getHostAddress());
		System.out.println(ip2.getHostName());
	}

}
