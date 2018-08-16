package java34.dya13.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List a=new ArrayList();
	
		a.add(0,"强强");
		a.add(1,"贵贵");
		a.add(2,"鹏鹏");
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		System.out.println(a.get(1));
		
		a.set(0, "贵贵");
		System.out.println(a);
		
		ListIterator b=a.listIterator();
		while(b.hasNext()){
			System.out.println(b.next());
		}
		System.out.println("----------------");
		
		while(b.hasPrevious()){
			System.out.println(b.previous());
		}
	}

}
