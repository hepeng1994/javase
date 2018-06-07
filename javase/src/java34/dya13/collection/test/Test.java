package java34.dya13.collection.test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 	boolean add(E e)   添加
	boolean remove(Object o)	移除
	void clear()		清空
	boolean contains(Object o)		是否包含
	boolean isEmpty()			是否为空
	int size()			获取集合容量
 * 
 *
 */

public class Test {
	public static void main(String[] args) {
		Collection a=new ArrayList();
		Collection b1=new ArrayList();
		a.add("光辉岁月");
		a.add("海阔天空");
		a.add(123);
		System.out.println(a);
		
		a.add(123);
		System.out.println(a);
		
		a.remove("海阔天空");
		System.out.println(a);
		
		boolean b=a.contains("光辉岁月");
		System.out.println(b);
		
		boolean c=a.isEmpty();
		System.out.println(c);
		
		System.out.println(a.size());
		
		a.clear();
		System.out.println(a);
	}

}
