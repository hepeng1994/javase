package java34.dya14;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CollectionArrayDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("我");
		list.add("们");
		list.add("不");
		list.add("一");
		list.add("样");
		
		Object[] array = list.toArray();
		System.out.println(array.toString());
		
		List<String> list1=Arrays.asList("1","3","5","7","8");
		
		List<String> list2=new ArrayList(list1);
		
		list2.add("123");
		System.out.println(list2);
		
		
	}

}
