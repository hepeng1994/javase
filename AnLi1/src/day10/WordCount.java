package day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
	public static void main(String[] args) throws Exception {
		//创建map合集封装
		Map<String,Integer> map=new HashMap<>();
		//读取目标文件
		BufferedReader a =new BufferedReader(new FileReader("E:\\x\\案例分析\\day10-worldCount\\day10/ThreadMain.java"));
		String  b =null;
		while((b=a.readLine())!=null){
			//用正则表达式筛选
			Pattern compile = Pattern.compile("\\b\\w+\\b");
			Matcher matcher = compile.matcher(b);
			while(matcher.find()){
				String group = matcher.group();
				//封装进集合中
				Integer orDefault = map.getOrDefault(group, 0);
				orDefault++;
				map.put(group, orDefault);
		}}
		//遍历输出
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
