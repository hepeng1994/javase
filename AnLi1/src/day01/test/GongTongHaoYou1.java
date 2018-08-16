package day01.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GongTongHaoYou1 {
	public static void main(String[] args) {
	//创建map集合	
	Map<String,List<String>>b=new HashMap<String, List<String>>();
	//读取数据
	try (BufferedReader a =new BufferedReader(new FileReader("D:\\练习/好友.txt"));
			){
		String str;
		while((str=a.readLine())!=null){
			//切割数据
			String[] split = str.split(":");
			String[] split2 = split[1].split(",");
			b.put(split[0],Arrays.asList(split2));
			
		}
		Set<Entry<String, List<String>>> entrySet = b.entrySet();
		List<Entry<String, List<String>>> c =new ArrayList<>(entrySet);
		for (int i = 0; i < c.size()-1; i++) {
			List<String> list = b.get(c.get(i).getKey());
			for (int j = i+1; j < c.size(); j++) {
				List<String> list2 = b.get(c.get(j).getKey());
				List<String> list3 =new ArrayList<String>(list2);
				list3.retainAll(list);
				if (list3!=null&&list3.size()>0) {
					
					System.out.println(c.get(i).getKey()+"与"+c.get(j).getKey()+"共同好有为:"+list3.toString());
				}
				
			}
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
