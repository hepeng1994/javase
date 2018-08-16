package baidu.client.day09;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import day09.model.Request;
import day09.model.User;
import day09.model.response;

public class Client {
	public static void main(String[] args) {
		try {
			Socket a =new Socket("localhost",9999);
			System.out.println("客户端已启动");
			OutputStream out = a.getOutputStream();
			ObjectOutputStream b =new ObjectOutputStream(out);
			Request re = new Request();
			User user = new User();
			user.set("礼物", "123", "小三", 18);
			re.setClassName("day09.service.impl.UserServiceImpl");
			re.setMothedName("login");
			
			re.setType(new Class[]{User.class });
			re.setValue(new Object[]{user});
			//写出对象
			b.writeObject(re);
			b.flush();
			//读取数据
			ObjectInputStream c =new ObjectInputStream(a.getInputStream());
			response res = (response)c.readObject();
			System.out.println(res);
			a.shutdownInput();
			a.shutdownOutput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
