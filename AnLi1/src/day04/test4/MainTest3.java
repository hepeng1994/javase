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
 * 4.	最热门的3部电影id和评价次数   热门的定义：评次数多的
1）：电影名字作为key，把List当做value添加到Map
2）：求取list长度
3）：根据list长度做排序
 */
public class MainTest3 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> movieMap = movieMap();
		//创建 map集合
		Map<String ,Integer> a =new HashMap<>();
		Set<Entry<String, List<RatinBean>>> entrySet = movieMap.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			String key = entry.getKey();
			List<RatinBean> value = entry.getValue();
			a.put(key, value.size());
		}
		Set<Entry<String, Integer>> entrySet2 = a.entrySet();
		List<Entry<String, Integer>> b =new ArrayList<Entry<String,Integer>>(entrySet2);
		test4.sortInteger(b);
		for (int i = 0; i < Math.min(3,b.size()); i++) {
			System.out.println(b.get(i));
		}
	}

	public static Map<String,List<RatinBean>> movieMap() {
		//创建map
		Map<String,List<RatinBean>> b =new LinkedHashMap<>();
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day04-电影排行\\rating.txt"));){
			String str;
			while((str=a.readLine())!=null){
				RatinBean p = JSON.parseObject(str,RatinBean.class);
				String movie = p.getMovie();
				List<RatinBean> list = b.getOrDefault(movie, new ArrayList<RatinBean>());
				list.add(p);
				b.put(movie, list);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return b;
	}
}
