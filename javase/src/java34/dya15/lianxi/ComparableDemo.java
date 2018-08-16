package java34.dya15.lianxi;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ComparableDemo {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		
		list.add(new Student("赵",20,95.6));
		list.add(new Student("钱",18,95.7));
		list.add(new Student("孙",28,93.5));
		list.add(new Student("李",28,95.6));
		list.add(new Student("周",30,94.6));
		list.add(new Student("吴",17,91.6));
		list.add(new Student("郑",35,95.6));
		list.add(new Student("王",15,92.6));
	
		Collections.sort(list);
		//使用Comparable进行比较排序
		for(int i=0;i<list.size();i++){
			Student a=list.get(i);
			System.out.println("姓名："+a.getName()+"     "+"年龄："+a.getAge()+"    "+"成绩"+a.getScore());
		}
		System.out.println("---------------------------------------");
		for(Student a:list){
			System.out.println("姓名："+a.getName()+"     "+"年龄："+a.getAge()+"    "+"成绩"+a.getScore());
		}
		System.out.println("--------------------------------------");
		Object[] arr = list.toArray();
		for(int i=0;i<arr.length;i++){
			Student a=(Student)arr[i];
			System.out.println("姓名："+a.getName()+"     "+"年龄："+a.getAge()+"    "+"成绩"+a.getScore());
		}
		System.out.println("--------------------------------------");
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student a=it.next();
			System.out.println("姓名："+a.getName()+"     "+"年龄："+a.getAge()+"    "+"成绩"+a.getScore());
		}
		System.out.println("--------------------------------------");
		
		//使用comparator进行比较排序
		/*Collections.sort(list,new StudentComparator());
		for(Student b:list){
			System.out.println("姓名："+b.getName()+"     "+"年龄："+b.getAge()+"    "+"成绩"+b.getScore());
			}*/
		
		Collections.sort(list,new Comparator<Student>(){

			public int compare(Student o1, Student o2) {
				if(o1.getAge()==o2.getAge()){
					return  o2.getScore()-o1.getScore()>0?1:-1;
				}else{
					return  o1.getAge()-o2.getAge();
				}
				
			}});
		for(Student b:list){
			System.out.println("姓名："+b.getName()+"     "+"年龄："+b.getAge()+"    "+"成绩"+b.getScore());
			}
		System.out.println("------------------------------------------------------");
		
		List<Integer> a=new ArrayList<>();
		
		a.add(200);
		a.add(100);
		a.add(50);
		a.add(150);
		
		Collections.sort(a);
		System.out.println(a);
		
		Collections.sort(a,new Comparator<Integer>(){

			
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}});
		System.out.println(a);
	}
}
class StudentComparator implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		if(o1.getAge()==o2.getAge()){
			return  o2.getScore()-o1.getScore()>0?1:-1;
		}else{
			return  o1.getAge()-o2.getAge();
		}
		
	}
	
}