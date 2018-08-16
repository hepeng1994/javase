package day04.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import day04.RatinBean;

/**
 4.	最热门的3部电影id和评价次数   热门的定义：评次数多的
1）：电影名字作为key，把List当做value添加到Map
2）：求取list长度
3）：根据list长度做排序
 */
public class MainTest4 {
	public static void main(String[] args) {
		//创建Map集合
		Map<String,Integer> a =new HashMap<>();
		//读入数据
		try (BufferedReader b =new BufferedReader(new FileReader("D:\\x\\案例分析\\day04-电影排行\\rating.txt"));
				){
			String str;
			while((str=b.readLine())!=null){
				RatinBean p = JSON.parseObject(str,RatinBean.class);
				String movie = p.getMovie();
				Integer o = a.getOrDefault(movie, 0);
				o++;
				a.put(movie, o);
			}
			Set<Entry<String, Integer>> entrySet = a.entrySet();
			ArrayList<Entry<String, Integer>> arrayList = new ArrayList<Entry<String, Integer>>(entrySet);
			RatinUtils.sortInteger(arrayList);
			for (int i = 0; i < 3; i++) {
				System.out.println(arrayList.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
