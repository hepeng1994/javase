package dayzixi.liulaing;

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

public class MainTest1 {
	public static void main(String[] args) {
		//创建map<String,Long>合集
		Map<String,Long> b =new HashMap<>();
		//录入数据
		try (BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\案例分析新\\day05-流量统计/http.log"));){
			String str;
			while((str=a.readLine())!=null){
				//1.根据给的用户上网日志记录数据，计算出总流量最高的网站Top3(网站例如：v.baidu.com，weibo.com)
				//切分
				//15639120688	http://v.baidu.com/movie 3936 12058
				String[] split = str.split("\t")[1].split(" ");
				String wan = wan(split[0]);
				long upDown= Long.parseLong(split[1])+Long.parseLong(split[2]);
				Long o = b.getOrDefault(wan, 0L);
				o=o+upDown;
				b.put(wan, o);
			}
			Set<Entry<String, Long>> entrySet = b.entrySet();
			List<Entry<String, Long>> c =new ArrayList<Entry<String,Long>>(entrySet);
			utils.sort(c);
			for (int i = 0; i <Math.min(3, c.size()); i++) {
				System.out.println(c.get(i));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static String wan(String string) {
		Pattern c = Pattern.compile("(\\w+\\.)?(\\w+\\.){1}\\w+");
		Matcher matcher = c.matcher(string);
		while(matcher.find()){
			String group = matcher.group();
			return group;
		}
		return null;
	}
}
