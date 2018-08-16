package dayzixi.dianying;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

/**
 	4.	最热门的3部电影id和评价次数   热门的定义：评次数多的
	Movie:321 ，评价次数：123
	Movie:312 ，评价次数：120
	Movie:121 ，评价次数：100

 
 */
public class MainTest3 {
	public static void main(String[] args) {
		//创建map合集
		Map<String,Integer> c =new HashMap<String, Integer>();;
		Map<String, List<MovieBean>> a = movieMap();
		Set<Entry<String, List<MovieBean>>> entrySet = a.entrySet();
		for (Entry<String, List<MovieBean>> entry : entrySet) {
			c.put(entry.getKey(), entry.getValue().size());
		}
		Set<Entry<String, Integer>> entrySet2 = c.entrySet();
		List<Entry<String, Integer>> d =new ArrayList<Entry<String,Integer>>(entrySet2);
		Movie.utilsSort(d);
		for (int i = 0; i < Math.min(3, d.size()); i++) {
			System.out.println(d.get(i));
		}
	}
/**
 * 创建map合集
 * 
 * @return
 */
	public static Map<String,List<MovieBean>> movieMap() {
		//创建map合集
		Map<String,List<MovieBean>> a =new HashMap<>();
		//录入数据
		try (BufferedReader b =new BufferedReader(new FileReader("E:\\x\\案例分析\\案例分析新\\day04-电影排行/rating.txt"));
				){
			String str;
			while((str=b.readLine())!=null){
				MovieBean p = JSON.parseObject(str,MovieBean.class);
				List<MovieBean> o = a.getOrDefault(p.movie,new ArrayList<MovieBean>() );
				o.add(p);
				a.put(p.movie, o);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return a;
	}
}
