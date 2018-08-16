package java34.dya14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, String> mp =new HashMap<String, String>();
		
		mp.put("太乙近天都", "连山接海隅");
		mp.put("白云回望合", "青霭入看无");
		mp.put("分野中峰变", "阴晴众壑殊");
		mp.put("欲投人处宿", "隔水问樵夫");
		
		System.out.println(mp);
		System.out.println("------------------------------");
		Set<String> key= mp.keySet();
		for(String a:key){
			System.out.println(a+","+mp.get(a));
		}
		System.out.println("************************************");
		Set<Entry<String,String>> set = mp.entrySet();
		for(Entry<String,String> c:set){
			System.out.println(c.getKey()+","+c.getValue());
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Iterator<Entry<String, String>> a = set.iterator();
		while(a.hasNext()){
			Entry<String, String> b = a.next();
			System.out.println(b.getKey()+","+b.getValue());
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		Collection<String> value = mp.values();
		for(String e:value){
			System.out.println(e);
		}
	}

}
