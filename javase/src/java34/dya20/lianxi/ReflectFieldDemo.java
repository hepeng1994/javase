package java34.dya20.lianxi;

import java.lang.reflect.Field;

public class ReflectFieldDemo {
	public static void main(String[] args) throws Exception {
		//获取字节码对象
		Class a=Class.forName("java34.dya20.lianxi.Person");
		//获取类中变量
		Field[] fields = a.getFields();//只能获得public修饰的变量
		for (Field field : fields) {
			System.out.println(field);//public int java34.dya20.lianxi.Person.age
		}
		System.out.println("------------------------");
		//获取所有变量
		Field[] fields2 = a.getDeclaredFields();
		for (Field field : fields2) {
			System.out.println(field);
		}
		
		Field field = a.getField("age");//只能获得public的变量
		System.out.println(field);
		Field field2 = a.getDeclaredField("name");//私有的也可以获取
		System.out.println(field2);
		//给私有变量赋值 要进行暴力破解
		Object object = a.newInstance();
		field2.setAccessible(true);
		field2.set(object, "zz");
		System.out.println(object);
		
		Field field3 = a.getDeclaredField("sex");
		field3.set(null, '男');//静态变量的赋值
		System.out.println(Person.sex);
		
	}

}
