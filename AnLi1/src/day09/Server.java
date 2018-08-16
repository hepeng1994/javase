package day09;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

import day09.model.Request;
import day09.model.UserResult;
import day09.model.response;

public class Server {
	public static void main(String[] args) {
		try {
			//创建端点,接受数据
			ServerSocket a =new ServerSocket(9999);
			System.out.println("服务端已启动");
			while(true){
			Socket accept = a.accept();
			InputStream in= accept.getInputStream();
			ObjectInputStream b =new ObjectInputStream(in);
			//用反射来调用方法
			//创建返回对象
			response res = new response();
			try {
				Object readObject = b.readObject();
				//将接受的数据强转
				Request c=(Request)readObject;
				String className = c.getClassName();
				Class<?> forName = Class.forName(className);
				Object newInstance = forName.newInstance();
				Method method = forName.getMethod(c.getMothedName(), c.getType());
				//invoke即是userresult
				UserResult invoke = (UserResult)method.invoke(newInstance, c.getValue());
				
				
				res.setStatus("200");
				res.setResult(invoke);
			} catch (Exception e1) {
				e1.getStackTrace();
				res.setStatus("500");
			}
			//创案输出流返回对象
			ObjectOutputStream e =new ObjectOutputStream(accept.getOutputStream());
			e.writeObject(res);
			e.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
