package day04.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import day04.RatinBean;

/**
 * 5.评价最高的3部电影id和评分均值
 * 
 * @author ASUS
 *
 */
public class MainTest5 {
	public static void main(String[] args) {

		// 创建Map集合
		Map<String, Integer> a = new HashMap<>();
		//求平均分
		Map<String, List<RatinBean>> m = movieInfo();
		// 读入数据
		try (BufferedReader b = new BufferedReader(new FileReader(
				"E:\\x\\案例分析\\day04-电影排行\\rating.txt"));) {
			String str;
			while ((str = b.readLine()) != null) {
				RatinBean p = JSON.parseObject(str, RatinBean.class);
				String movie = p.getMovie();
				Integer o = a.getOrDefault(movie, 0);
				o++;
				a.put(movie, o);
			}
			Set<Entry<String, Integer>> entrySet = a.entrySet();
			ArrayList<Entry<String, Integer>> arrayList = new ArrayList<Entry<String, Integer>>(
					entrySet);
			RatinUtils.sortInteger(arrayList);
			for (int i = 0; i < 3; i++) {
				 List<RatinBean> list = m.get(arrayList.get(i).getKey());
				 float sum=0f;
				 for (RatinBean r : list) {
					sum+=Float.parseFloat(r.getRate());
				}
				 int size = list.size();
				 float avg =sum/size;
				 System.out.println("电影:"+arrayList.get(i)+"平均评分:"+String.format("%.2f", avg));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Map<String, List<RatinBean>> movieInfo() {
		// 创建map集合
		Map<String, List<RatinBean>> a = new HashMap<>();
		// 输入数据
		try (BufferedReader b = new BufferedReader(new FileReader(
				"E:\\x\\案例分析\\day04-电影排行\\rating.txt"));) {
			String str;
			while ((str = b.readLine()) != null) {
				RatinBean p = JSON.parseObject(str, RatinBean.class);
				String movie = p.getMovie();
				List<RatinBean> o = a.getOrDefault(movie,
						new ArrayList<RatinBean>());
				o.add(p);
				a.put(movie, o);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
}
