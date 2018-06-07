package java34.dya20;

import java.lang.reflect.Field;

public class ReflectFieldDemo {
	public static void main(String[] args) {
		
		try {
			Class c=Class.forName("java34.dya20.Person");
			
			Field[] fields = c.getFields();
			for(Field f:fields){
				System.out.println(f);
			}
			
			Field[] fields2 = c.getDeclaredFields();
			for(Field f:fields2){
				System.out.println(f);
			}
			
			Field field=c.getField("name");
			System.out.println(field);
			
			Field field2 = c.getDeclaredField("age");
			System.out.println(field2);
			
			Object object = c.newInstance();
			field.set(object, "zhangsan");
			
			field2.setAccessible(true);
			System.out.println(object);
			field2.set(object, 18);
			System.out.println(object);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
