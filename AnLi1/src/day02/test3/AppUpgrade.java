package day02.test3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppUpgrade {
	public static void main(String[] args) {
		Map<String, List<String>> a= appInfo();
		//创建list
		List<AppBean> c =new ArrayList<AppBean>();
		//对list进行了排序
		Set<String> keySet = a.keySet();
		List<String> b =new ArrayList<String>(keySet);
		for (String s : b) {
			List<String> list = a.get(s);
			sortUtil1.sortByvalue(list);
			//对list进行判断size大于1,排除没有升级的
			if (list.size()>1) {
				String minVersion=list.get(0);
				String maxVersion=list.get(list.size()-1);
			//对key进行重新分割
				String[] split = s.split(",");
				String date =split[0];
				String userName =split[1];
				String appName =split[2];
				String from =split[3];
			//封装进javabean
				AppBean ap = new AppBean();
				ap.set(date, userName, appName, from, minVersion, maxVersion);
				c.add(ap);
			}
		}
		for (AppBean s : c) {
			System.out.println(s);
		}
	}

	private static Map<String,List<String>> appInfo() {
		//创建map集合
		Map<String,List<String>> b =new HashMap<>();
		//读入数据
		try (BufferedReader a =new BufferedReader(new FileReader("D:\\练习/app.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				//分割数据
				String[] split = str.split(",");
				String date =split[0];
				String userName =split[1];
				String appName =split[2];
				String from =split[3];
				String version =split[5];
				//拼接key
				String stt =date+","+userName+","+appName+","+from;
				//把key相同的value放入集合
				if (b.containsKey(stt)) {
					b.get(stt).add(version);
				}else{
					ArrayList<String> arr = new ArrayList<String>();
					arr.add(version);
					b.put(stt, arr);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return b;
	}
}
