package java34.dya15.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

import java34.dya15.Student;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		set.add(80);
		set.add(90);
		set.add(70);
		set.add(60);
		set.add(100);
		System.out.println(set);
		
		TreeSet<Student1> set1=new TreeSet<>(new Comparator<Student1>(){

			
			public int compare(Student1 o1, Student1 o2) {
				if(o1.age==o2.age){
					return o2.score-o1.score>0?1:-1;
				}else{
					return o1.age-o2.age;
				}
			}});
		
		set1.add(new Student1("王",15,80));
		set1.add(new Student1("张",25,80));
		set1.add(new Student1("李",16,90));
		set1.add(new Student1("赵",15,70));
		set1.add(new Student1("郑",20,86.4));
		set1.add(new Student1("王",18,86.5));
		for(Student1 a:set1){
		System.out.println(a);
	}}

}
