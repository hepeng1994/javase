package day04.test4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

/**
 * 1.	每个用户评分最高的3部电影评分信息
 * @author ASUS
 *
 */

public class MainTest1 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> userMap = userMap();
		Set<Entry<String, List<RatinBean>>> entrySet = userMap.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			String key = entry.getKey();
			List<RatinBean> value = entry.getValue();
			test4.sortValue(value);
			System.out.println(key);
			for (int i = 0; i < Math.min(3, value.size()); i++) {
				System.out.println(value.get(i));
			}
		}
		
		
	}

	public static Map<String,List<RatinBean>> userMap() {
		//创建map集合
		Map<String,List<RatinBean>>b=new LinkedHashMap<>();
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day04-电影排行\\rating.txt"));){
			String str;
			while((str=a.readLine())!=null){
				RatinBean p = JSON.parseObject(str,RatinBean.class);
				String uid = p.getUid();
				List<RatinBean> o = b.getOrDefault(uid, new ArrayList<RatinBean>());
				o.add(p);
				b.put(uid, o);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return b;
	}
}
