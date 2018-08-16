package day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainTest2 {
	public static void main(String[] args) {
		//创建map集合
		Map<String, Float> a =new HashMap<>();
		Map<String, List<RatinBean>> ra = MainTest.ratinInfo();
		Set<Entry<String, List<RatinBean>>> entrySet = ra.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			//对rate求平均值
			float sum =0;
			List<RatinBean> value = entry.getValue();
			for (RatinBean rat : value) {
				float rate = Float.parseFloat(rat.getRate());
				sum=sum+rate;
			}
			int size = value.size();
			float avg =sum/size*1.0f;
			a.put(entry.getKey(), avg);
			
		}
		//求每个用户平均分
//		Set<Entry<String, Float>> en = a.entrySet();
//		for (Entry<String, Float> ent : en) {
//			System.out.println(ent.getKey()+"平均评分为:"+String.format("%.2f",ent.getValue()));
//		}
		Set<Entry<String, Float>> entr = a.entrySet();
		ArrayList<Entry<String, Float>> arr = new ArrayList<Entry<String, Float>>( entr);
		RatinUtil.sortlist(arr);
		for (int i = 0; i < 3; i++) {
			System.out.println(arr.get(i).getKey()+"平均评分为:"+String.format("%.2f",arr.get(i).getValue()));
		}
		
	}
}
