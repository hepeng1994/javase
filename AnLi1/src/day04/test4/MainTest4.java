package day04.test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * 	5.评价最高的3部电影id和评分均值
 * @author ASUS
 *
 */
public class MainTest4 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> a = MainTest3.movieMap();
		Map<String,Float> b =new HashMap<String, Float>();
		Set<Entry<String, List<RatinBean>>> entrySet = a.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			String key = entry.getKey();
			List<RatinBean> value = entry.getValue();
			float sum=0;
			for (RatinBean r : value) {
				sum=sum+Float.parseFloat(r.getRate());
			}
			int size = value.size();
			float avg =sum/size;
			b.put(key, avg);
		}
		Set<Entry<String, Float>> entrySet2 = b.entrySet();
		List<Entry<String, Float>> c =new  ArrayList<Entry<String,Float>>(entrySet2);
		test4.sortAvg(c);
		for (int i = 0; i < Math.min(3, c.size()); i++) {
			System.out.println(c.get(i));
		}
	}
}
