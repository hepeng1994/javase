package day02.test1;

import java.io.BufferedReader;
import java.io.File;
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

public class AppUpgrade {
	public static void main(String[] args) {
		Map<String, List<String>> a= appInfo();
		List<AppBean> b =new ArrayList<AppBean>();
		//对版本进行局部排序
		Set<Entry<String, List<String>>> en = a.entrySet();
		for (Entry<String, List<String>> entry : en) {
			List<String> value = entry.getValue();
			SortUtil.sortByVersons(value);
			//获取最大值最小值 判断version大于一
			if (value.size()>1) {
			String minVlaue =value.get(0);
			String maxValue =value.get(value.size()-1);
			//重新分割key
			String[] split = entry.getKey().split(",");
			String date =split[0];
			String userName =split[1];
			String appName=split[2];
			String from =split[3];
			//那分割出来的封装
			AppBean ap = new AppBean();
			ap.set(date, userName, appName, from, minVlaue, maxValue);
			b.add(ap);
		}}
		SortUtil.sortByappBean(b);
		for (AppBean entry : b) {
			System.out.println(entry);
		}
		
	}

	private static Map<String ,List<String>> appInfo() {
		//创建MAP
		Map<String ,List<String>> b =new HashMap<>();
		//导入文件
		try (BufferedReader a =new BufferedReader(new FileReader("D:\\练习/app.txt"));
				
				){
			String str ;
			//分割数据   装入集合
			while((str=a.readLine())!=null){
				String[] split = str.split(",");
				String date =split[0];
				String userName =split[1];
				String appName =split[2];
				String from =split[3];
				String version =split[5];
				String stt=date+","+userName+","+appName+","+from;
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
