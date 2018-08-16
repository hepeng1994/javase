package java34.dya14.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<String, Student> hm=new HashMap<>();
		
		hm.put("9527", new Student("周星驰",58));
		hm.put("9522", new Student("刘德华",55));
		hm.put("9524", new Student("梁朝伟",54));
		hm.put("9529", new Student("刘嘉玲",50));
		
		Set<String> set = hm.keySet();
		for(String a:set){
			Student b=hm.get(a);
			System.out.println(a+","+b.name+","+b.age);
		}
		System.out.println("-------------------------------");
		Set<Entry<String,Student>> set2 = hm.entrySet();
		for(Entry<String,Student> b:set2){
			System.out.println(b.getKey()+","+b.getValue().name+","+b.getValue().age);
		}
		System.out.println("------------------------------");
		Iterator<Entry<String, Student>> it = set2.iterator();
		while(it.hasNext()){
			Entry a=it.next();
			Student b=(Student)a.getValue();
			System.out.println(a.getKey()+","+b.name+","+b.age);
		}
		System.out.println("----------------------------");
		Collection<Student> val = hm.values();
		for(Student a:val){
			System.out.println(a.name+","+a.age);
		}
	}
}
