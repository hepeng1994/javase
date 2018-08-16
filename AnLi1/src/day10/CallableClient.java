package day10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.Callable;

public class CallableClient implements Callable<String>{
	final static String KEY = "天王盖地虎";
	String path ;
	String comd;
	String ip;
	String localPath;
	
	public CallableClient() {
		super();
	}

	public CallableClient(String path, String comd, String ip, String localPath) {
		super();
		this.path = path;
		this.comd = comd;
		this.ip = ip;
		this.localPath = localPath;
	}

	@Override
	public String call() throws Exception {
		String read =null;
		try {
			// 建立通信
			Socket a = new Socket(ip, 9999);
			System.out.println("客户端启动");
			OutputStream out = a.getOutputStream();
			// 发送身份验证
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(KEY);
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
						localPath);
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
				read = (String) ois.readObject();
				
			} else {
				System.out.println("身份验证失败");
			}
			a.shutdownInput();
			a.shutdownOutput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return read;
	}

}
