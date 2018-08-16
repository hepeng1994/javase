package day02.test2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import day02.SortUtil;

public class AppUpgrade {
	public static void main(String[] args) {
		Map<String, List<String>> a = appInfo();
		//创建lisst集合
		List<AppVersion>c =new ArrayList<AppVersion>();
		//对version排序,判断是否size大于1
		Set<String> keySet = a.keySet();
		List<String> b =new ArrayList<String>(keySet);
			for (String s : b) {
				List<String> list = a.get(s);
				if (list.size()>1) {
				SortUtils.values(list);
				//找出最大值最小值
				String minVersion=list.get(0);
				String maxVersion=list.get(list.size()-1);
				//重新分割key
				String[] split = s.split(",");
				String date =split[0];
				String userName=split[1];
				String appName =split[2];
				String from =split[3];
				AppVersion ap = new AppVersion();
				ap.set(date, userName, appName, from, minVersion, maxVersion);
				c.add(ap);
			}
		}
			for (AppVersion t : c) {
				System.out.println(t);
			}
		
	}

	private static Map<String,List<String>> appInfo() {
		Map<String,List<String>> b =new HashMap<>();
		//读取文件
		try(BufferedReader a =new BufferedReader(new FileReader("D:/练习/App.txt"));
				) {
			String str;
			while((str=a.readLine())!=null){
				//分割数据
				String[] split = str.split(",");
				String date =split[0];
				String userName =split[1];
				String appName =split[2];
				String from =split[3];
				String version =split[5];
				//把相同成分组合
				String stt =date+","+userName+","+appName+","+from;
				//过滤相同成分并装到map中
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
