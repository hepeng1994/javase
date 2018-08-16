package day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import day03.test.IpBean;

public class IpUtils {
	static List<IpBean> ip =null;
	static{
		ip = MainTest.IpLuRu();
	}
	public static long ZhuanHuan(String userIp) {
		String[] split = userIp.split("\\.");
		long a = 0L ;
		if (split!=null&&split.length>0) {
			a=0L;
		}
		for (int i = 0; i <=3; i++) {
			a |=Long.parseLong(split[i])<<((3-i)<<3);
		}
		return a;
	}

	public static IpBean chazhao(long zhuanHuan) {
		
		int start=0;
		int end = ip.size()-1;
		while(start<=end){
			int mid=(start+end)/2;
			if (zhuanHuan>=ip.get(mid).getStartDecId()&&zhuanHuan<=ip.get(mid).getEndDecId()) {
				return ip.get(mid);
			}
			if (zhuanHuan<ip.get(mid).getStartDecId()) {
				end=mid-1;
			}
			if (zhuanHuan>ip.get(mid).getEndDecId()) {
				start=mid+1;
			}
		}return null;
				
	}

	public static void sort(Map<String, Integer> b) {
		Set<Entry<String, Integer>> entrySet = b.entrySet();
		List<Entry<String, Integer>> a =new ArrayList<Map.Entry<String,Integer>>(entrySet)	;
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
