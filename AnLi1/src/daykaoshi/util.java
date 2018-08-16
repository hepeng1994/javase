package daykaoshi;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

public class util {
	//将ip转换成long值
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


	public static void sort(List<Entry<String, Integer>> arrayList) {
		Collections.sort(arrayList,new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				
				return o2.getValue()-o1.getValue();
			}
		});
		
	}
}
