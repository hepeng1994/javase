package java34.dya13.collection.test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 	boolean addAll(Collection c) 添加一个集合
	boolean removeAll(Collection c)： 移除一个集合
	boolean containsAll(Collection c):是否包含
	boolean retainAll(Collection c): 求交集，共同好友
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Collection a=new ArrayList();
		a.add("我们");
		Collection a1=new ArrayList();
		a1.add("你们");
		
		a.addAll(a1);
		System.out.println(a);
		
		
		
	}

}
