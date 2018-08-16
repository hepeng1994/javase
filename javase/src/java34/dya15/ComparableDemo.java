package java34.dya15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		
		list.add(new Student("王",15,80));
		list.add(new Student("张",25,80));
		list.add(new Student("李",16,90));
		list.add(new Student("赵",15,70));
		list.add(new Student("郑",20,86.4));
		list.add(new Student("王",18,86.5));
		
		Collections.sort(list);
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student a=it.next();
			System.out.println(a.name+","+a.age+","+a.score);
		}
		System.out.println("-------------------------------------");
		Collections.sort(list,new StudentComparator());

		Iterator<Student> a = list.iterator();
		while(a.hasNext()){
			Student b=a.next();
			System.out.println(b.name+","+b.age+","+b.score);
		}
		System.out.println("-------------------------------------");
		Collections.sort(list, new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.age==o2.age){
					return o2.score-o1.score>0?1:-1;
				}else{
					return o1.age-o2.age;
				}
			}});
		Iterator<Student> i = list.iterator();
		while(i.hasNext()){
			Student c=i.next();
			System.out.println(c.name+","+c.age+","+c.score);
		}
	}
}
class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age==o2.age){
			return o2.score-o1.score>0?1:-1;
		}else{
			return o1.age-o2.age;
		}
		
	}
	
}