package java34.dya13.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
	public static void main(String[] args) {
		Collection s=new ArrayList();
		
		s.add("孙悟空");
		s.add("郑贵强");
		
		Collection s1=new ArrayList();
		s1.add("强贵郑");
		s1.add("贵郑强");
		
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s1);
		
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s1);
		
		s.addAll(s1);
		s.containsAll(s1);
		System.out.println(s);
		System.out.println(s1);
		
		s.retainAll(s1);
		System.out.println(s);
		System.out.println(s1);
	}

}
