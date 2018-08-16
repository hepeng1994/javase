package day01.test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GongTongHaoYou {
	public static void main(String[] args) {
		Map<String,List<String>>b =new HashMap<>();
		//录入数据
		try (BufferedReader a =new  BufferedReader(new FileReader("D:\\练习/好友.txt"));
				){
			String str ;
			while((str=a.readLine())!=null){
				//切割数据
				String[] split = str.split(":");
				String[] split2 = split[1].split(",");
				//放入map中
				b.put(split[0], Arrays.asList(split2));
			}
			
			Set<String> keySet = b.keySet();
			List<String> c =new ArrayList<String>(keySet);
			for (int i = 0; i < c.size(); i++) {
				List<String> list = b.get(c.get(i));
				for (int j = 0; j < c.size(); j++) {
					List<String> list2 = b.get(c.get(j));
					List<String> list3 =new ArrayList<String>(list2);
					list3.retainAll(list);
					if (list3!=null&&list3.size()>0) {
						
							System.out.println(list3);
						
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
}
