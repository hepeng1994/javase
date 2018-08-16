package day04.test1;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day04.RatinBean;

/**
 2.	每个用户的uid和评分的平均值
把值全部放到一个集合里面去   sum/size
整个javaBean都放进去
Uid:avg
1:4.5
2:5.0


 */
public class MainTest2 {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> u = MainTest1.userInfo();
		Set<Entry<String, List<RatinBean>>> entrySet = u.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			String key = entry.getKey();
			List<RatinBean> value = entry.getValue();
			float sum=0;
			for (RatinBean ra : value) {
				sum+=Float.parseFloat(ra.getRate());
			}
			int size = value.size();
			float a = sum/size;
			System.out.println("用户:"+key+"平均分"+String.format("%.2f", a));
		}
	}
}
