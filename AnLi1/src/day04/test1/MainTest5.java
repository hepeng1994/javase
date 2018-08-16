package day04.test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import day04.RatinBean;

/**
 * 	5.评价最高的3部电影id和评分均值
 * @author ASUS
 *
 */
public class MainTest5 {
	public static void main(String[] args) {
		//创建map合集
		Map<String,Integer> b=new LinkedHashMap<>();
		//创建map 接收信息
		Map<String, List<RatinBean>> d =new LinkedHashMap<String, List<RatinBean>>();
		//读取数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day04-电影排行\\rating.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				RatinBean p= JSON.parseObject(str,RatinBean.class);
				String movie = p.getMovie();
				List<RatinBean> or= d.getOrDefault(movie, new ArrayList<RatinBean>());
				or.add(p);
				d.put(movie, or);
				Integer o = b.getOrDefault(movie, 0);
				o++;
				b.put(movie, o);
			}
			Set<Entry<String, Integer>> entrySet = b.entrySet();
			List<Entry<String, Integer>> c =new ArrayList<Entry<String,Integer>>(entrySet);
			RatinUtil2.sortInteger(c);
			for (int i = 0; i < 3; i++) {
				float sum=0;
				List<RatinBean> list = d.get(c.get(i).getKey());
				for (RatinBean r : list) {
					sum+=Float.parseFloat(r.getRate());
				}
				int size = list.size();
				float avg =sum/size;
				System.out.println("电影:"+c.get(i).getKey()+"平均分:"+String.format("%.2f", avg));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
