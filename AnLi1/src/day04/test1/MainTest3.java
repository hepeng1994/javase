package day04.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day04.RatinBean;
import day04.test.RatinUtils;

/**
 3.	最大方(评分平均值高)的3个用户的uid和评分平均值
 */
public class MainTest3 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> u = MainTest1.userInfo();
		//创建map合集
		Map<String,Float> a=new HashMap<String, Float>();
		Set<Entry<String, List<RatinBean>>> entrySet = u.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			String key = entry.getKey();
			List<RatinBean> value = entry.getValue();
			float sum=0;
			for (RatinBean r : value) {
				sum+=Float.parseFloat(r.getRate());
			}
			int size = value.size();
			float avg=sum/size;
			a.put(key, avg);
		}
		Set<Entry<String, Float>> entrySet2 = a.entrySet();
		List<Entry<String, Float>> b =new ArrayList<Entry<String,Float>>(entrySet2);
		RatinUtils.sortAvg(b);
		for (int i = 0; i < 3; i++) {
			System.out.println("用户"+b.get(i).getKey()+"平均分:"+String.format("%.2f", b.get(i).getValue()));
		}
	}
}
