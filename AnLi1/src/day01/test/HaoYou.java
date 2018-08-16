package day01.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

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
public class HaoYou {
	public static void main(String[] args) {
		ComboPooledDataSource  co =new ComboPooledDataSource();
		QueryRunner qu = new QueryRunner(co);
		String sct ="INSERT INTO haoyou VALUES(?,?) ";
		Map<String,Integer> ma =new HashMap<String, Integer>();
		try (
			BufferedReader a =new BufferedReader(new InputStreamReader(new FileInputStream("d:/好友.txt")));
			BufferedWriter c =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/好友1.txt")));
				){
			String str;
			while((str=a.readLine())!=null){
				String[] split = str.split(":");
				String[] split2 = split[1].split(",");
				ma.put(split[0], split2.length);
			}
			Set<Entry<String, Integer>> entrySet = ma.entrySet();
			ArrayList<Entry<String, Integer>> arrayList = new ArrayList<Entry<String, Integer>>(entrySet);
			Collections.sort(arrayList,new Comparator<Entry<String, Integer>>() {

				@Override
				public int compare(Entry<String, Integer> o1,
						Entry<String, Integer> o2) {
					
					return o2.getValue()-o1.getValue();
				}
			});
			String stt;
			for (Entry<String, Integer> entry : arrayList) {
				 stt ="用户:"+entry.getKey()+"好友数:"+entry.getValue();
				 qu.update(sct, entry.getKey(),entry.getValue());
				 c.write(stt);
				 c.newLine();
				 c.flush();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
