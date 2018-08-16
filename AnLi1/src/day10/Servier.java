package day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import day10.test.util;

/**
 * 
 * 1:建立链接 2：接受验证信息 3：返回验证结果 4：接受jar文件位置 5：接受jar文件‘ 6：接受comd命令 ----> 执行jar程序
 * 7：返回结果
 * 
 * @author root
 **/
public class Servier {
	final static String key = "天王盖地虎";

	public static void main(String[] args) {
		try {
			// 创建端口
			ServerSocket a = new ServerSocket(9999);
			System.out.println("服务端启动");
			while (true) {
				// 接收验证信息
				Socket accept = a.accept();
				ObjectInputStream ois = new ObjectInputStream(
						accept.getInputStream());
				String re = (String) ois.readObject();
				// 创建输出流
				ObjectOutputStream oos = new ObjectOutputStream(
						accept.getOutputStream());
				// 3：返回验证结果
				if (key.equals(re)) {
					oos.writeObject("宝塔镇河妖");
					oos.flush();

					// 接受文件位置
					String path = (String) ois.readObject();
					// //判断文件夹是否存在,也要排除多层文件夹
					// File file = new File(path);
					// if (!file.exists()) {
					// file.getAbsoluteFile()
					// }
					// 5：接受jar文件
					FileOutputStream outputStream = new FileOutputStream(path);// 多层目录可能出现问题
					byte[] b = new byte[1024];
					int length = 0;
					while ((length = ois.read(b)) != -1) {
						outputStream.write(b, 0, length);
					}
					outputStream.close();
					// 接受comd
					String comd = (String) ois.readObject();
					// 执行程序
					String runjia = Util.runjia(comd);
					oos.writeObject(runjia);
					oos.flush();
				} else {
					oos.writeObject("错误");
					oos.flush();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
