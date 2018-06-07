package java34.dya14.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		
		hm.put(20,"李凡");
		hm.put(30,"风清扬");
		hm.put(28,"刘意");
		hm.put(22,"李凡");
		
		//遍历
		Set<Integer> set = hm.keySet();
		for(Integer a:set){
			System.out.println(a+","+hm.get(a));
		}
		System.out.println("---------------------------");
		Set<Entry<Integer,String>> set2 = hm.entrySet();
		for(Entry<Integer,String> a:set2){
			System.out.println(a.getKey()+","+a.getValue());
		}
		System.out.println("------------------------------");
		Iterator<Entry<Integer, String>> it = set2.iterator();
		while(it.hasNext()){
			Entry a=it.next();
			System.out.println(a.getKey()+","+a.getValue());
		}
		System.out.println("---------------------------------");
		Collection<String> values = hm.values();
		for(String a:values){
			System.out.println(a);
		}
	}

}
