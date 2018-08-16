package dayzixi.dianying;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

/**
 * 1.	每个用户评分最高的3部电影评分信息
 * @author ASUS
 *
 */
public class MainTest {
	public static void main(String[] args) {
		Map<String, List<MovieBean>> map = moiveMap();
		//对list以评分信息进行排序
		Set<Entry<String, List<MovieBean>>> entrySet = map.entrySet();
		for (Entry<String, List<MovieBean>> entry : entrySet) {
			List<MovieBean> value = entry.getValue();
			Movie.utilsValue(value);
			System.out.println(entry.getKey());
			for (int i = 0; i <Math.min(3,value.size()); i++) {
				System.out.println(value.get(i));
			}
			System.out.println("------------------------------");
		}
	}
/**
 * 创建map合集录入数据
 * @return
 */
	public static Map<String,List<MovieBean>> moiveMap() {
		//创建map合集
		Map<String,List<MovieBean>> b =new LinkedHashMap<>();
		//读入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\案例分析新\\day04-电影排行/rating.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				MovieBean p= JSON.parseObject(str, MovieBean.class);
				List<MovieBean> list = b.getOrDefault(p.getUid(), new ArrayList<MovieBean>());
				list.add(p);
				b.put(p.getUid(), list);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return b;
	}
}
