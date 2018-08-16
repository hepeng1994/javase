package day04.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import day04.RatinBean;

public class MainTest1 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> u= useInfo();
		//录入数据
				try(BufferedWriter a =new BufferedWriter(new FileWriter("D:\\练习/lala.txt"));
						) {
					//对List<RatinBean>进行排序
					Set<Entry<String, List<RatinBean>>> entrySet = u.entrySet();
					for (Entry<String, List<RatinBean>> entry : entrySet) {
						String key = entry.getKey();
						List<RatinBean> value = entry.getValue();
						RatinUtils.sortValue(value);
						a.write(key);
						a.newLine();
						for (int i = 0; i <Math.min(3, value.size()); i++) {
							a.write(value.get(i).toString());
							a.newLine();
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

	public static Map<String,List<RatinBean>> useInfo() {
		//创建map集合
		Map<String,List<RatinBean>> b =new LinkedHashMap<>();
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("D:\\x\\案例分析\\day04-电影排行\\rating.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				RatinBean p = JSON.parseObject(str, RatinBean.class);
				String uid = p.getUid();
				List<RatinBean> o = b.getOrDefault(uid, new ArrayList<RatinBean>());
				o.add(p);
				b.put(uid, o);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
