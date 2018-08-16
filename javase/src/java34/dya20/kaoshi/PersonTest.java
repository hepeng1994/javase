package java34.dya20.kaoshi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class PersonTest {
	public static void main(String[] args) {
		
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("张三",20,96.5));
		list.add(new Person("李四",18,90));
		list.add(new Person("王五",21,90));
		
		Collections.sort(list,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getSorc()==o2.getSorc()){
					return o1.getAge()-o2.getAge();
				}else{
					return  o2.getSorc()-o1.getSorc()>0?1:-1;
				}
			
			}
		});
		for(Person a:list){
			System.out.println(a);
		}
	}
	
}
