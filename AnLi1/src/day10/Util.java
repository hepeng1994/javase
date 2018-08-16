package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 根据指定的名令返回结果
 * @author ASUS
 *
 */
public class Util {
	public static String runjia(String command)  {
		//配置运行环境
		Runtime runtime = Runtime.getRuntime();
		//运行jar包程序
		Process exec;
		try {
			exec = runtime.exec(command);
			//对程序输出进行读取
			BufferedReader a=new BufferedReader(new InputStreamReader(exec.getInputStream()));
			//用StringBuilder 字符串拼接
			StringBuilder s = new StringBuilder();
			String line=null;
			while((line=a.readLine())!=null){
				s.append(line+"\n");
			}
			System.out.println(s);
			return s.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return null;
	}
}
