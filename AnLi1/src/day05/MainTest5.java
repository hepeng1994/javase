package day05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//5.根据给的手机号段归属地规则，计算出总流量最高的市Top3
public class MainTest5 {
	public static void main(String[] args) {
		Map<String, String> cityMap = cityMap();
		//创建Map
		Map<String,Long> b =new HashMap<String, Long>();
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day05-流量统计\\http.log"));){
			String str;
			while((str=a.readLine())!=null){
				//分割数据
				//15639120688	http://v.baidu.com/movie 3936 12058
				String[] split = str.split("\t");
				String number=split[0].substring(0,7);
				String[] split2 = split[1].split(" ");
				long upDown =Long.parseLong(split2[1])+Long.parseLong(split2[2]);
				String city = cityMap.get(number);
				Long sum= b.getOrDefault(city, 0L);
				sum=sum+upDown;
				b.put(city, sum);
			}
			Set<Entry<String, Long>> entrySet = b.entrySet();
			List<Entry<String, Long>> c =new ArrayList<>(entrySet);
			Day5Utils.sortLong(c);
			for (int i = 0; i < Math.min(3, c.size()); i++) {
				System.out.println(c.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Map<String,String> cityMap() {
		//创建集合
		Map<String,String> b =new HashMap<>();
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day05-流量统计/phone.txt"));
				){
			String str;
			a.readLine();
			while((str=a.readLine())!=null){
				//分割数据
				//130	1300000	山东	济南	联通	250000	0531	370100
				String[] split = str.split("\t");
				String num =split[1];
				String city =split[3];
				b.put(num, city);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return  b;
	}
}
