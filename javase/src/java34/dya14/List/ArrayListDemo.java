package java34.dya14.List;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *  ArrayList:
                     底层数据结构是数组，查询快，增删慢
                     线程不安全，效率高
              Vector:
                     底层数据结构是数组，查询快，增删慢
                     线程安全，效率低
              LinkedList:
                     底层数据结构是链表，查询慢，增删快
                     线程不安全，效率高
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		arr.add("Hello");
		arr.add("World");
		arr.add("java");
		
		Iterator it = arr.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println("------------------");
		for(int i=0;i<arr.size();i++){
			String s=(String)arr.get(i);
			System.out.println(s);
		}
	}

}
