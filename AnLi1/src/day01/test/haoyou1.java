package day01.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
数据样例：
冒号左边为用户id，冒号右边为用户的好友列表
需求1：各个用户（user）的好友数量并排序（top3）
1：使用io流读取数据（bufferedReader），每一行数据就读过来了
2：使用字符串的分割
1）：使用冒号分割   用户名，好友列表
2）：好友列表进行分割   一个个的好友
//Map<用户名和好友列表>
//Map<用户名和长度>
//转化为list排序
3：求取用户对应的好友数量（后面的长度）
4：根据数量进行排序
涛哥：7
杨哥：5
*/
public class haoyou1 {
	public static void main(String[] args) {
		//创建map集合
		Map<String,Integer> b =new HashMap<String, Integer>();
		//读取数据;
		try(
			BufferedReader a =new BufferedReader(new FileReader("D:\\练习/好友.txt"));
				) {
			String str;
			while((str=a.readLine())!=null){
				//分解数据
				String[] split = str.split(":");
				String[] split2 = split[1].split(",");
				//将数据装入map
				b.put(split[0], split2.length);
				
			}
			//将map集合转化为list数据排序
			Set<Entry<String, Integer>> entrySet = b.entrySet();
			List<Entry<String, Integer>> c =new ArrayList<>(entrySet);
			Collections.sort(c,new Comparator<Entry<String, Integer>>() {

				@Override
				public int compare(Entry<String, Integer> o1,
						Entry<String, Integer> o2) {
					return o2.getValue()-o1.getValue();
					
				}
			});
			
			for (Entry<String, Integer> entry : c) {
				System.out.println(entry);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
