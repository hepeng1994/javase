package day01.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HaoYou {
	public static void main(String[] args) {
		//创建Map集合
		Map<String,Integer> b =new HashMap<>();
		//读入数据
		try (BufferedReader a =new BufferedReader(new FileReader("D:\\练习/好友.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				//分割数据
				String[] split = str.split(":");
				String[] split2 = split[1].split(",");
				//装数据
				b.put(split[0], split2.length);
			}
			//map转换为list,排序输出
			Set<Entry<String, Integer>> entrySet = b.entrySet();
			List<Entry<String, Integer>> d =new ArrayList<Entry<String,Integer>>(entrySet);
			
				Collections.sort(d,new Comparator <Entry<String, Integer>>() {

					@Override
					public int compare(Entry<String, Integer> o1,
							Entry<String, Integer> o2) {
						return o2.getValue()-o1.getValue();
					}
				});
				for (Entry<String, Integer> entry : d) {
					System.out.println(entry);
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
