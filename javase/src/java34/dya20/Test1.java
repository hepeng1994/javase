package java34.dya20;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("哈喽");
		
		try {
			Class class1 = Class.forName("java.util.ArrayList");
			
			Method method = class1.getDeclaredMethod("add", Object.class);
			//Object o = class1.newInstance();
			
			method.invoke(list,123);
			method.invoke(list,"123");
			// System.out.println(o);
			
			System.out.println(list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
