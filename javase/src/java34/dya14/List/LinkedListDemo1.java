package java34.dya14.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add("hello");
		l.add("world");
		l.add("java");
		
		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
