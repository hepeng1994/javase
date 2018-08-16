package java34.dya14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		Map<Person1, String> mp=new HashMap<Person1, String>();
		mp.put(new Person1("郑",18,'女'), "5");
		mp.put(new Person1("张",28,'男'), "6");
		mp.put(new Person1("刘",38,'女'), "7");
		mp.put(new Person1("王",48,'男'), "8");
		
		Set<Person1> a = mp.keySet();
		for(Person1 c:a){
			System.out.println(c+","+mp.get(c));
		}
		System.out.println("------------------------------");
		
		Set<Entry<Person1,String>> set = mp.entrySet();
		for(Entry<Person1,String> ab:set){
			System.out.println(ab.getKey()+","+ab.getValue());
		}
		System.out.println("--------------------------------");
		Iterator<Entry<Person1, String>> i= set.iterator();
		while(i.hasNext()){
			Entry<Person1, String> next = i.next();
			System.out.println(next.getKey()+","+next.getValue());
		}
	}

}
class Person1{
	String name;
	int age;
	char sex;
	
	public Person1(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Person1() {
		super();
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
		
}