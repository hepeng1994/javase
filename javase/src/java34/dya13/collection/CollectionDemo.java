package java34.dya13.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		
		c.add("小强");
		boolean b=c.add("我困了");
		System.out.println(c);
		
		boolean b1=c.remove("小强");
		System.out.println(c);	
		
		boolean b3=c.contains("我困了");
		System.out.println(b3);
		
		boolean b4=c.isEmpty();
		System.out.println(b4);
		
		System.out.println(c.size());
		
		c.clear();
		System.out.println(c);
	}

}
