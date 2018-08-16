package dayzixi.dianying;
/**
 * 
5.	评价最高的3部电影id和评分均值
Movie：0 ， avg：5.0
Movie：123 ， avg：4.9
Movie：321 ， avg：4.8


 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MovieTest4 {
	public static void main(String[] args) {
		Map<String, List<MovieBean>> a = MainTest3.movieMap();
		//创建map合集
		Map<String,Float> b =new HashMap<String, Float>();
		Set<Entry<String, List<MovieBean>>> entrySet = a.entrySet();
		for (Entry<String, List<MovieBean>> entry : entrySet) {
			List<MovieBean> value = entry.getValue();
			float Avg = Movie.utilsAvg(value);
			b.put(entry.getKey(), Avg);
		}
		Set<Entry<String, Float>> entrySet2 = b.entrySet();
		List<Entry<String, Float>> c =new ArrayList<Entry<String,Float>>(entrySet2);
		Movie.utilsInteger(c);
		for (int i = 0; i < Math.min(3, c.size()); i++) {
			System.out.println(c.get(i));
		}
	}
}
