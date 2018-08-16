package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * 1：建立通信 2：发送身份验证信息 3：接受验证信息返回结果 4：发送jar文件位置 5：发送jar文件 6：发送comd 7：获取结果
 * 
 * @author root
 *
 */
public class Client {
	public static void main(String[] args) {
		String id ="localhost";
		String key ="天王盖地虎";
		String path ="E:\\lianxi\\word1.jar";
		String comd ="java -jar E:\\lianxi\\word1.jar";
		try {
			// 建立通信
			Socket a = new Socket(id, 9999);
			System.out.println("客户端启动");
			OutputStream out = a.getOutputStream();
			// 发送身份验证
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(key);
			oos.flush();
			// 接受验证信息返回结果
			ObjectInputStream ois = new ObjectInputStream(a.getInputStream());
			String readObject = (String) ois.readObject();
			if ("宝塔镇河妖".equals(readObject)) {
				// 发送文件位置
				oos.writeObject(path);
				oos.flush();
				// 5：发送jar文件
				FileInputStream input = new FileInputStream(
						"E:\\lianxi\\word.jar");
				byte[] b = new byte[1024];
				int length = 0;
				while ((length = input.read(b)) != -1) {
					oos.write(b,0,length);
				}
				oos.flush();
				input.close();
				// 发送comd
				oos.writeObject(comd);
				oos.flush();
				// 获取结果
				String read = (String) ois.readObject();
				System.out.println(read);
			} else {
				System.out.println("身份验证失败");
			}
			a.shutdownInput();
			a.shutdownOutput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
