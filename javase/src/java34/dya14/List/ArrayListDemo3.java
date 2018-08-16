package java34.dya14.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		
		
		
		list.add(new Student("林青霞",27));
		list.add(new Student("林志玲",40));
		list.add(new Student("凤姐",35));
		list.add(new Student("芙蓉姐姐",18));
		list.add( new Student("翠花",16));
		list.add(new Student("林青霞",27));
		list.add(new Student("林青霞",18));
		
		ArrayList a=new ArrayList();
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			Student b=(Student)it.next();
			if(!a.contains(b)){
				a.add(b);
			}
		}
		for(int i=0;i<a.size();i++){
			Student b=(Student)a.get(i);
			System.out.println(b.name+","+b.age);
		}
	}

}
