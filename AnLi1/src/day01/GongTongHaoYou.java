package day01;

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

import javax.imageio.stream.FileImageInputStream;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class GongTongHaoYou {
	public static void main(String[] args) {
		ComboPooledDataSource co= new ComboPooledDataSource();
		QueryRunner q= new QueryRunner(co);
		String stt ="INSERT INTO haoyou1 VALUES(?,?)";
		
	Map<String,List<String>> a =new HashMap<String,List<String>>();
	try (BufferedReader b =new BufferedReader(new InputStreamReader(new FileInputStream("D:\\好友.txt")));
			BufferedWriter out =new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\好友2.txt")))
			){
			String str;
			while((str=b.readLine())!=null){
				String[] split = str.split(":");
				String[] split2 = split[1].split(",");
				List<String> asList = Arrays.asList(split2);
				a.put(split[0], asList);
				
			}
			Set<String> keySet = a.keySet();
			ArrayList<String> arr = new ArrayList<String>(keySet);
			for (int i = 0; i < a.size()-1; i++) {
				List<String> list = a.get(arr.get(i));
				for (int j =i+1; j < a.size(); j++) {
					List<String> list2 = a.get(arr.get(j));
					ArrayList<String> arrayList = new ArrayList<String>(list2);
					 arrayList.retainAll(list);
					 String nnd =arr.get(i)+"与"+arr.get(j)+"的共同好友为:"+arrayList;
					 
					 
					 if (arrayList!=null&&arrayList.size()>0) {
						 q.update(stt,arr.get(i)+"与"+arr.get(j),arrayList.toString());
						out.write(nnd);
						out.newLine();
						out.flush();
					}
				}
				
			} 
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
