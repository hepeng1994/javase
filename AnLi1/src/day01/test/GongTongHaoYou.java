package day01.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class GongTongHaoYou {
	public static void main(String[] args) {
		ComboPooledDataSource f =new ComboPooledDataSource();
		QueryRunner qu = new QueryRunner(f);
		String sct ="INSERT INTO haoyou1 VALUES(?,?)";
		Map<String,List<String>> b =new HashMap<String,List<String>>();
		try (
			BufferedReader a =new BufferedReader(new InputStreamReader(new FileInputStream("D:/好友.txt")));
			BufferedWriter d =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/好友2.txt")))	
				){
			String str;
			while((str=a.readLine())!=null){
				String[] split = str.split(":");
				String[] split2 = split[1].split(",");
				b.put(split[0],Arrays.asList(split2));
			}
			Set<String> keySet = b.keySet();
			List<String> arrayList = new ArrayList<String>(keySet);
			System.out.println(arrayList.size());
			for (int i = 0; i < arrayList.size()-1; i++) {
				 List<String> list = b.get(arrayList.get(i));
				 //List<String> list4 =new ArrayList<String>(list);
				for (int j = i+1; j < arrayList.size(); j++) {
					 List<String> list2 = b.get(arrayList.get(j));
					 List<String> list3 =new ArrayList<String>(list2);
					list3.retainAll( list);//注意list3必须在前边 ,如果list在前边,list每次都会被重写
					 if (list3!=null&&list3.size()>0) {
						qu.update(sct, arrayList.get(j)+"与"+arrayList.get(i),list3.toString());
						String stt =arrayList.get(i)+"与"+arrayList.get(j)+"的共同好友为:"+list3.toString();
						d.write(stt);
						d.newLine();
						d.flush();
					}
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
