package day04.test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 2.	每个用户的uid和评分的平均值
把值全部放到一个集合里面去   sum/size
整个javaBean都放进去
3.	最大方(评分平均值高)的3个用户的uid和评分平均值
 */
public class MainTest2 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> userMap = MainTest1.userMap();
		//创建map集合放<uid和avg>
		Map<String ,Float> a =new HashMap<String, Float>();
		Set<Entry<String, List<RatinBean>>> entrySet = userMap.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			String key = entry.getKey();
			List<RatinBean> value = entry.getValue();
			float sum=0;
			for (RatinBean r : value) {
				sum=sum+Float.parseFloat(r.getRate());
			}
			int size = value.size();
			float avg=sum/size;
			//System.out.println("用户:"+key+"平均值"+String.format("%.2f", avg)); 以上为第2题
			a.put(key, avg);
		}
		Set<Entry<String, Float>> entrySet2 = a.entrySet();
		List<Entry<String, Float>> c =new ArrayList<Entry<String,Float>>(entrySet2);
		test4.sortAvg(c);
		for (int i = 0; i < Math.min(3,c.size()); i++) {
			System.out.println("用户:"+c.get(i).getKey()+"平均分:"+c.get(i).getValue());
		}
	}
}
