package java34.dya14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Person> set=new HashSet<Person>();
		set.add(new Person("张",28,"男"));
		set.add(new Person("王",20,"女"));
		set.add(new Person("李",23,"男"));
		set.add(new Person("郑",28,"女"));
		set.add(new Person("张",28,"男"));
		
		Iterator<Person> it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("-------------------------------");
		Object[] array = set.toArray();
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println("-------------------------------");
		for(Person i:set){
			System.out.println(i);
		}
		
		
	}

}
class Person{
	private String name;
	private int age;
	private String sex;
	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Person() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}