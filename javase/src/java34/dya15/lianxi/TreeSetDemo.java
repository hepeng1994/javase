package java34.dya15.lianxi;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>();
		
		t.add(20);
		t.add(10);
		t.add(30);
		t.add(60);
		System.out.println(t);
		
		TreeSet<Integer> t1=new TreeSet<>(new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});

		t1.add(20);
		t1.add(10);
		t1.add(30);
		t1.add(60);
		System.out.println(t1);
		
		TreeSet<Student> t2=new TreeSet<>(new Comparator<Student>(){
			public int compare(Student o1, Student o2) {
				if(o1.getAge()==o2.getAge()){
					return  o2.getScore()-o1.getScore()>0?1:1;
				}else{
					return  o1.getAge()-o2.getAge();
				}
				
			}});
		t2.add(new Student("赵",20,95.6));
		t2.add(new Student("钱",18,95.7));
		t2.add(new Student("孙",28,93.5));
		t2.add(new Student("李",28,93.5));
		t2.add(new Student("周",30,94.6));
		t2.add(new Student("吴",17,91.6));
		t2.add(new Student("郑",35,95.6));
		t2.add(new Student("王",15,92.6));
		for(Student a:t2){
			System.out.println("姓名："+a.getName()+"     "+"年龄："+a.getAge()+"    "+"成绩"+a.getScore());
		}
	}
}
