package day04.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import day04.RatinBean;

/**
 1.	每个用户评分最高的3部电影评分信息
 */
public class MainTest1 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> u = userInfo();
		//对用户相对应的list排序
		Set<Entry<String, List<RatinBean>>> entrySet = u.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			String key = entry.getKey();
			List<RatinBean> value = entry.getValue();
			RatinUtil2.sortValue(value);
			System.out.println(key);
			for (int i = 0; i < Math.min(3,value.size()); i++) {
				System.out.println(value.get(i));
			}
		}
	}

	public static Map<String,List<RatinBean>>  userInfo() {
		//创建map合集
		Map<String,List<RatinBean>> a =new LinkedHashMap<>();
		//录入数据
		try (BufferedReader b =new BufferedReader(new FileReader("D:\\x\\案例分析\\day04-电影排行\\rating.txt"));
				){
			String str;
			while((str=b.readLine())!=null){
				RatinBean p = JSON.parseObject(str,RatinBean.class);
				String uid = p.getUid();
				List<RatinBean> o= a.getOrDefault(uid, new ArrayList<RatinBean>());
				o.add(p);
				a.put(uid, o);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return a;
	}
}
