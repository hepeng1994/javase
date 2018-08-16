package java34.dya14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NestDemo {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("周瑜");
		l.add("周瑜");
		List<String> l1=new ArrayList<String>();
		l1.add("令狐冲");
		l1.add("林平之");
		List<String> l2=new ArrayList<String>();
		l2.add("杨过");
		l2.add("小龙女");
		
		Map<String, List<String>> mp=new HashMap<String, List<String>>();
		mp.put("三国演义", l);
		mp.put("笑傲江湖", l1);
		mp.put("神雕侠侣", l2);
		
		System.out.println(mp);
			Set<String> set = mp.keySet();
			for(String a:set){
				System.out.println(a+mp.get(a));
			}
		
	}

}
