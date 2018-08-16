package day05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//	4.根据给的用户上网日志记录数据，计算出总流量最高的手机号Top3
public class MainTest4 {
public static void main(String[] args) {
	//创建map合集
	Map<String,Long> b =new HashMap<>();
	//输入数据
	try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day05-流量统计\\http.log"));
			){
		String str;
		while((str=a.readLine())!=null){
			//分割数据
			//15639120688	http://v.baidu.com/movie 3936 12058
			String[] split = str.split("\t");
			String number =split[0];
			String[] split2 = split[1].split(" ");
			long upDown =Long.parseLong(split2[1])+Long.parseLong(split2[2]);
			Long sum = b.getOrDefault(number, 0L);
			sum=sum+upDown;
			b.put(number, sum);
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
}
