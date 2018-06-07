package java34.dya14.List;

import java.util.LinkedList;

/*		LinkedList
			A:有特有功能      
				a:添加
						public void addFirst()
						public void addLast()
				b:删除
						public Object removeFirst()
						public Object removeLast()
				c:获取
						public Object getFirst()
						public Object getLast()
 * 
 */

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList link=new LinkedList();
		
		link.add("Hello");
		link.add("world");
		link.add("java");
		
		link.addFirst("javaee");
		link.addLast("android");
		
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		
		System.out.println(link.removeFirst());
		System.out.println(link.removeLast());
		
		System.out.println(link);
	}

}
