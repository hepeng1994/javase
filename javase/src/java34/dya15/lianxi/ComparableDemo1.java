package java34.dya15.lianxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableDemo1 {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		

		list.add(new Student("赵",20,95.6));
		list.add(new Student("钱",18,95.7));
		list.add(new Student("孙",28,93.5));
		list.add(new Student("李",28,95.6));
		list.add(new Student("周",30,94.6));
		list.add(new Student("吴",17,91.6));
		list.add(new Student("郑",35,95.6));
		list.add(new Student("王",15,92.6));
		
		
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			Student a=list.get(i);
			System.out.println(a.getName()+"  "+a.getAge()+"  "+a.getScore());
		}
		
		Object[] arr = list.toArray();
		for(int i=0;i<arr.length;i++){
			Student a=list.get(i);
			System.out.println(a.getName()+"  "+a.getAge()+"  "+a.getScore());
		}
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			Student a=it.next();
			System.out.println(a.getName()+"  "+a.getAge()+"  "+a.getScore());
		}
		
		for(Student a:list){
			System.out.println(a.getName()+"  "+a.getAge()+"  "+a.getScore());
		}
	}

}
