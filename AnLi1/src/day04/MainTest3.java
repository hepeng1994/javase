package day04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

public class MainTest3 {
	public static void main(String[] args) {
		//读取数据
		Map<String, List<RatinBean>> m = movieInfo();
		//创建<电影,评级次数>集合1
		Map<String ,Integer>a =new HashMap<String, Integer>();
		//把评价次数放入合集
		Set<Entry<String, List<RatinBean>>> entrySet = m.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			a.put(entry.getKey(), entry.getValue().size());
		}
		Set<Entry<String, Integer>> entrySet2 = a.entrySet();
		ArrayList<Entry<String, Integer>> arrayList = new ArrayList<Entry<String, Integer>>( entrySet2);
		RatinUtil.sortInteger(arrayList);
		for (int i = 0; i < 3; i++) {
			System.out.println("电影"+arrayList.get(i).getKey()+"评价次数"+arrayList.get(i).getValue());
		}
	}

	public static Map<String,List<RatinBean>> movieInfo() {
		//创建map集合
		Map<String,List<RatinBean>>b=new HashMap<>();
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day04-电影排行\\rating.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				RatinBean p = JSON.parseObject(str,RatinBean.class);
				//判断并装入集合
				List<RatinBean> o= b.getOrDefault(p.getMovie(), new ArrayList<RatinBean>());
				o.add(p);
				b.put(p.getMovie(), o);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return b;
	}
}
