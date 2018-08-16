package day05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 	1.根据给的用户上网日志记录数据，计算出总流量最高的网站Top3(网站例如：v.baidu.com，weibo.com)
 * @author ASUS
 *
 */
public class MainTest1 {
	public static void main(String[] args) {
		//创建map合集
		Map<String,Long> b =new HashMap<>();
	//读取数据
	try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day05-流量统计\\http.log"));){
		String str;
		//15639120688	http://v.baidu.com/movie 3936 12058
		while((str=a.readLine())!=null){
			String[] split = str.split("\t")[1].split(" ");
			String oldUrl = split[0];
			long up = Long.parseLong(split[1]);
			long down =Long.parseLong( split[2]);
			String zheng = zhengZe(oldUrl);
			Long sum= b.getOrDefault(zheng, 0L);
			sum=sum+up+down;
			b.put(zheng, sum);
		}
		Set<Entry<String, Long>> entrySet = b.entrySet();
		List<Entry<String, Long>> c= new ArrayList<>(entrySet);
		Day5Utils.sortLong(c);
		for (int i = 0; i < Math.min(3, c.size()); i++) {
			System.out.println(c.get(i));
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

	private static String zhengZe(String oldUrl) {
		Pattern c = Pattern.compile("(\\w+\\.)?(\\w+\\.){1}\\w+");
		Matcher matcher = c.matcher(oldUrl);
		while(matcher.find()){
			String group = matcher.group();
			return group;
		}
		return null;
	}
}
