package day04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

public class MainTest {
	public static void main(String[] args) {
		Map<String, List<RatinBean>> ra = ratinInfo();
		//排序
		Set<Entry<String, List<RatinBean>>> entrySet = ra.entrySet();
		for (Entry<String, List<RatinBean>> entry : entrySet) {
			List<RatinBean> value = entry.getValue();
			RatinUtil.sort(value );
			if (value.size()>3) {
				System.out.println(entry.getKey());
				System.out.println(value.get(0));
				System.out.println(value.get(1));
				System.out.println(value.get(2));
			}
			}
		
		
		
	}

	public static Map<String,List<RatinBean>> ratinInfo() {
		//创建map集合
		Map<String,List<RatinBean>> b =new HashMap<>();
		//读入数据
		 try(BufferedReader a =new BufferedReader(new FileReader("D:\\x\\案例分析\\day04-电影排行\\rating.txt"));
				 ) {
			String str ;
			while((str=a.readLine())!=null){
				//获取数据并封装进RatinBean
				RatinBean p = JSON.parseObject(str,RatinBean.class);
				List<RatinBean> o = b.getOrDefault(p.getUid(), new ArrayList<>());
				o.add(p);
				b.put(p.getUid(), o);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return b;
	}
}
