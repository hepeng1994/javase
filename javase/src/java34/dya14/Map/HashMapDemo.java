package java34.dya14.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		//创建集合对象
		HashMap<String, String> hm=new HashMap<>();
		//创建元素
		hm.put("it001","马云");
		hm.put("it003","马化腾");
		hm.put("it004","乔布斯");
		hm.put("it005","张朝阳");
		hm.put("it002","裘伯君"); 
		hm.put("it001","比尔盖茨");
		
		//遍历
		Set<String> set = hm.keySet();
		for(String a:set){
			System.out.println(a+","+hm.get(a));
		}
		System.out.println("------------------------------------");
		Set<Entry<String,String>> set2 = hm.entrySet();
		for(Entry<String,String> a:set2){
			System.out.println(a.getKey()+","+a.getValue());
		}
		System.out.println("--------------------------------------");
		Iterator<Entry<String, String>> it = set2.iterator();
		while(it.hasNext()){
			Entry a=it.next();
			System.out.println(a.getKey()+","+a.getValue());
		}
		System.out.println("----------------------------------------");
		Collection<String> va = hm.values();
		for(String a:va){
			System.out.println(a);
		}
	}

}
