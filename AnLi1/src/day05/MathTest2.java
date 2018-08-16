package day05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MathTest2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> unmMap = unmMap();
		//创建map集合
		Map<String ,Long> b =new HashMap<String, Long>();
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day05-流量统计\\http.log")) ;){
			String str;
			while((str=a.readLine())!=null){
				//15639120688	http://v.baidu.com/movie 3936 12058
				//分割数据
				String[] split = str.split("\t");
				String[] split2 = split[1].split(" ");
				String number =split[0].substring(0,7);
				long upDown =Long.parseLong(split2[1])+Long.parseLong(split2[2]);
				String province = unmMap.get(number);
				Long sum = b.getOrDefault(province, 0L);
				sum=sum+upDown;
				b.put(province, sum);
			}
			Set<Entry<String, Long>> entrySet = b.entrySet();
			List<Entry<String, Long>> c =new ArrayList<Entry<String,Long>>(entrySet);
			Day5Utils.sortLong(c);
			for (int i = 0; i < Math.min(3, c.size()); i++) {
				System.out.println(c.get(i));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Map<String,String> unmMap() {
		//创建map装电话前七位及对应省份
		Map<String,String> b =new HashMap<>();
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:/x/案例分析/day05-流量统计/phone.txt"));){
			String str;
			a.readLine();//读取第一行无用数据
			while((str=a.readLine())!=null){
				//分割
				//130	1300000	山东	济南	联通	250000	0531	370100
				String[] split = str.split("\t");
				String num=split[1];
				String province=split[2];
				b.put(num, province);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return b;
	}
}
