package dayzixi.dianying;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 2.	每个用户的uid和评分的平均值
 * @author ASUS
 *
 */
public class MainTest1 {
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
		for (Entry<String, Float> entry : entrySet2) {
			System.out.println(entry.getKey()+"----"+String.format("%.2f", entry.getValue()));
		}
	}
}
