package java34.dya20.lianxi;

import java.lang.reflect.Method;

public class ReflectMethodDemo {
	public static void main(String[] args) throws Exception {
		//获取字节码对象
		Class c = Class.forName("java34.dya20.lianxi.Person");
		
		Method[] methods = c.getMethods();//只能回取public修饰的方法，包括父类中的public方法
		for (Method method : methods) {
			System.out.println(method);
		}
		System.out.println("-----------------------");
		Method[] methods2 = c.getDeclaredMethods();//获取类中的所有方法，不包括父类的
		for (Method method : methods2) {
			System.out.println(method);
		}
		Method a=c.getMethod("setAge", int.class);//只能获取public修饰的方法
		System.out.println(a);
		
		Object o = c.newInstance();
		a.invoke(o, 18);//
		System.out.println(o);
		
		Method a1=c.getDeclaredMethod("getName");
		a1.setAccessible(true);
		Object invoke = a1.invoke(o);
		System.out.println(invoke);
	}

}
