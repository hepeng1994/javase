package java34.dya19.liao;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatRoomClientDemo implements Runnable {

	@Override
	public void run() {
try(
				
				DatagramSocket da=new DatagramSocket();
				) {
			System.out.println("准备发送数据");
		
				InetAddress ip=InetAddress.getByName("192.168.11.255");
				
				Scanner  scr=new Scanner(System.in);
				String line;
				while((line=scr.nextLine())!=null){
					DatagramPacket dp=new DatagramPacket(line.getBytes(), line.getBytes().length,ip,8888);
					da.send(dp);
					if("over".equals(line)){
						break;
					}
				}
			da.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
