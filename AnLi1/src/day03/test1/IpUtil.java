package day03.test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IpUtil {
	static List<IpBean> mc=null;
	static{
		mc=Ip();
	}
	public static List<IpBean> Ip (){
		//创建list
		List<IpBean> b =new ArrayList<IpBean>();
		//输入Ip数据
		try (BufferedReader a =new BufferedReader(new FileReader("D:\\x\\案例分析\\day03-ip地址归属地\\ip.txt"));
				){
			String str;
			while((str=a.readLine())!=null){
				//切割数据
				String[] split = str.split("\\|");
				 String startId=split[0];
				 String endId=split[1];
				 long startDecId=Long.parseLong(split[2]);
				 long endDecId=Long.parseLong(split[3]);
				 String province=split[6];
				 String city=split[7];
				 String carrieroperator=split[9] ;
				 IpBean ip = new IpBean();
				 //封装进ipbean
				 ip.set(startId, endId, startDecId, endDecId, province, city, carrieroperator);
				 b.add(ip);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return b;
	}
	public static long byId(String userId){
		String[] split = userId.split("\\.");
		long a=0l;
		for (int i = 0; i < 3; i++) {
			a|=Long.parseLong(split[i])<<((3-i)<<3);
		}
		return a;
	}
	public static IpBean byBean(long byId){
		int start=0;
		int end=mc.size()-1;
		while(start<=end){
			int mid =(start+end)/2;
			IpBean ip = mc.get(mid);
			if (byId>=ip.getStartDecId()&&byId<=ip.getEndDecId()) {
				return ip;
			}
			if (byId<ip.getStartDecId()) {
				end=mid-1;
			}
			if (byId>ip.getEndDecId()) {
				start=mid+1;
			}
		}return null;
	}
	public static void bian(Map<String,Integer> b){
		Set<Entry<String, Integer>> entrySet = b.entrySet();
		List<Entry<String, Integer>> a =new ArrayList<Map.Entry<String,Integer>>(entrySet);
		Collections.sort(a,new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
		for (Entry<String, Integer> entry : a) {
			System.out.println(entry);
		}
	}
}
