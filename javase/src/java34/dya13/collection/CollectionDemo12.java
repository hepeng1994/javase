package java34.dya13.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo12 {
	public static void main(String[] args) {
		Collection s=new ArrayList();
		
		s.add("沉默是金");
		s.add(123);
		s.add("浪子回头");
		
		
		Object [] a=s.toArray();
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println("---------------------------------------------");
		Iterator b=s.iterator();
		while(b.hasNext()){
			System.out.println(b.next());
		}
	}
}
