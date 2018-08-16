package java34.dya20;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		
		try {
			HashMap<String, String> map=new HashMap<String, String>();
			Class a=Class.forName("java.util.HashMap");
			
			Method d= a.getDeclaredMethod("put",Object.class,Object.class);
			
			d.invoke(map, 1,"哈哈");
			d.invoke(map, 12.1f,12L);
			System.out.println(map);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
}
