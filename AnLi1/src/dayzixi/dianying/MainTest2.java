package dayzixi.dianying;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 2.	3.	最大方(评分平均值高)的3个用户的uid和评分平均值
 * @author ASUS
 *
 */
public class MainTest2 {
	public static void main(String[] args) {
		Map<String, List<MovieBean>> a = MainTest.moiveMap();
		//创建map<String,float>
		Map<String,Float> b =new HashMap<String, Float>();
		Set<Entry<String, List<MovieBean>>> entrySet = a.entrySet();
		for (Entry<String, List<MovieBean>> entry : entrySet) {
			List<MovieBean> value = entry.getValue();
			float avg = Movie.utilsAvg(value);
			b.put(entry.getKey(), avg);
		}
		Set<Entry<String, Float>> entrySet2 = b.entrySet();
		List<Entry<String, Float>> c =new ArrayList<Map.Entry<String,Float>>(entrySet2);
		Movie.utilsInteger(c);
		for (int i = 0; i < Math.min(3, c.size()); i++) {
			System.out.println(c.get(i).getKey()+"---"+String.format("%.2f",c.get(i).getValue()));
		}
	}
}
