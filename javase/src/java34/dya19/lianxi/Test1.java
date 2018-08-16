package java34.dya19.lianxi;

import java.lang.reflect.Field;

public class Test1 {
	public static void main(String[] args) {
		
		//Class.forName(className)
		
	}
	public static void setProperty( Object obj,String property,Object value){
		
		try {
			Class class1 = obj.getClass();
			Field field = class1.getDeclaredField(property);
			field.setAccessible(true);
			field.set(obj, value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Person{
	String name;
	int age;
	char sex;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
	
}