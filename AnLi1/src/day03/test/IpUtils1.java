package day03.test;

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

public class IpUtils1 {
	static List<IpBean> aIp=null;
	static{
		aIp=IP();
	}
	
	public static List<IpBean> IP(){
		List<IpBean> b =new ArrayList<IpBean>();
	//读入ip数据
	try (BufferedReader a =new BufferedReader(new FileReader("D:\\x\\案例分析\\day03-ip地址归属地\\ip.txt"));
			){
		String str;
		while((str=a.readLine())!=null){
			String[] split = str.split("\\|");
			 String startId=split[0];
			 String endId=split[1];
			 long startDecId=Long.parseLong(split[2]);
			 long endDecId=Long.parseLong(split[3]);
			 String province=split[6];
			 String city=split[7];
			 String carrieroperator =split[9];
			 IpBean ip = new IpBean();
			 ip.set(startId, endId, startDecId, endDecId, province, city, carrieroperator);
			 b.add(ip);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}return b;
}
	public static long zhuanHuan(String id){
		String[] split = id.split("\\.");
		long a=0L;
		if (split!=null&&split.length>0) {
			for (int i = 0; i < 3; i++) {
				a|=Long.parseLong(split[i])<<((3-i)<<3);
			}
		}return a;
	}
	public static IpBean byBean(long userIp){
		
		int start=0;
		int end=aIp.size()-1;
		
		//if (aIp!=null&&aIp.size()>0) {
			while(start<=end){
				int mid=(start+end)/2;
				IpBean ip= aIp.get(mid);
			if (userIp>=ip.getStartDecId()&&userIp<=ip.getEndDecId()) {
				return ip;
			}
			if (userIp<ip.getStartDecId()) {
				end =mid-1;
			}
			if (userIp>ip.getEndDecId()) {
				start=mid+1;
			}
			//}
			
		}
		return null;
	}
	public static void sort(Map<String,Integer> a){
		Set<Entry<String, Integer>> entrySet = a.entrySet();
		List<Entry<String, Integer>> b =new ArrayList<Map.Entry<String,Integer>>(entrySet);
		Collections.sort(b,new Comparator <Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o2.getValue()-o1.getValue();
						
			}
		});
		for (Entry<String, Integer> entry : b) {
			System.out.println(entry);
		}
	}
}
