package java34.dya16.lianxi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectuonsDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(100);
		list.add(80);
		list.add(150);
		list.add(70);
		list.add(200);
		//排序  创建内部类实现 Comparator接口里的方法 自定义进行降序排序
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
		});
		System.out.println(list);
	}

}
