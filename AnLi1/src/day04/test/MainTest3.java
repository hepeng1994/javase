package day04.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day04.RatinBean;

public class MainTest3 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> u = MainTest1.useInfo();
		//创建map集合
		Map<String,Float> a=new HashMap<String, Float>();
		Set<Entry<String, List<RatinBean>>> entrySet = u.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			String key = entry.getKey();
			List<RatinBean> value = entry.getValue();
			float sum = 0;
			for (RatinBean ra : value) {
				sum+=Float.parseFloat(ra.getRate());
			}
			int size = value.size();
			float avg=sum*1.0f/size;
			a.put(key,avg);
		}
		//排序
		Set<Entry<String, Float>> entrySet2 = a.entrySet();
		List<Entry<String, Float>> b =new ArrayList<Entry<String,Float>>(entrySet2);
		RatinUtils.sortAvg(b);
		for (int i = 0; i <Math.min(3, b.size()); i++) {
			System.out.println("用户:"+b.get(i).getKey()+"平均评分:"+String.format("%.2f", b.get(i).getValue()));
		}
	}
}
