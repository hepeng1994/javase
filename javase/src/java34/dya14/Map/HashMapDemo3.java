package java34.dya14.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo3 {
	public static void main(String[] args) {
		HashMap<Student,String > hm=new HashMap<>();
		
		hm.put(new Student("貂蝉",27), "8888");
		hm.put(new Student("王昭君",30), "6666");
		hm.put( new Student("西施",33), "5555");
		hm.put(new Student("杨玉环",35), "7777");
		hm.put(new Student("貂蝉",27), "9999");
		
		Set<Student> set=hm.keySet();
		for(Student a:set){
			System.out.println(a.name+","+a.age+","+hm.get(a));
		}
		System.out.println("-----------------------------------");
		Set<Entry<Student,String>> set2 = hm.entrySet();
		for(Entry<Student,String> a:set2){
			System.out.println(a.getKey().name+","+a.getKey().age+","+a.getValue());
		}
		System.out.println("------------------------------");
		Iterator<Entry<Student, String>> it = set2.iterator();
		while(it.hasNext()){
			Entry a=it.next();
			System.out.println(a.getKey()+","+a.getValue());
		}
		System.out.println("--------------------------------");
		Collection<String> vl = hm.values();
		for(String a:vl){
			System.out.println(a);
		}
	}

}
