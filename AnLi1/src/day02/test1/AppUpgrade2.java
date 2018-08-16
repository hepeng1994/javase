package day02.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day02.AppBean;
import day02.SortUtil;

public class AppUpgrade2 {
	public static void main(String[] args) {
		Map<String, List<String>> a= AppInfo();
		//创建list
		List<AppBean> d =new ArrayList<AppBean>();
				
		//对list排序
		Set<Entry<String, List<String>>> entrySet = a.entrySet();
		List<Entry<String, List<String>>> b =new ArrayList<Map.Entry<String,List<String>>>(entrySet);
		for (Entry<String, List<String>> entry : b) {
			List<String> value = entry.getValue();
			SortUtil.sortByVersons(value);
			
			//获取最大版本和最小版本 先判断value是否大于1,小于或等于1表示没更新
			if (value.size()>1) {
				String minVlaue =value.get(0);
				String maxValue =value.get(value.size()-1);
			//重新分割key
				String[] split = entry.getKey().split(",");
				String date =split[0];
				String userName =split[1];
				String appName =split[2];
				String from =split[3];
			//创建javabean 并封装
				AppBean ap = new AppBean();
				ap.set(date, userName, appName, from, minVlaue, maxValue);
				d.add(ap);
			}
		}
		//根据时间进行排序
		SortUtil.sortByappBean(d);
		for (AppBean entry : d) {
			System.out.println(entry);
		}
	}

	private static Map<String,List<String>> AppInfo() {
		//构建集合
		Map<String,List<String>>b =new HashMap<>();
		//读入数据
		try(BufferedReader a =new BufferedReader(new FileReader("D:\\练习/app.txt"));
				) {
			String str;
			while((str=a.readLine())!=null){
				//分解数据
				String[] split = str.split(",");
				String date =split[0];
				String userName =split[1];
				String appName =split[2];
				String from =split[3];
				String version =split[5];
				//重新组合成key,
				String stt =date+","+userName+","+appName+","+  from;
				//装进集合中,判断是否key相同,把key相同的value放在一个list集合里,去掉重合的
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
		}
		
		return b;
	}
}
