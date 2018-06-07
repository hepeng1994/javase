package java34.dya20.lianxi;

import java.lang.reflect.Constructor;

public class ReflectConstructorDemo {
	public static void main(String[] args) throws Exception {
		//获取Class对象
		Class class1 = Class.forName("java34.dya20.lianxi.Person");
		//获取构造方法
		Constructor[] constructors = class1.getConstructors();//只能获得Public 修饰的构造方法
		for (Constructor co : constructors) {
			System.out.println(co);//public java34.dya20.lianxi.Person()
		}
		System.out.println("---------------------------------------");
		//获取所有构造方法
		Constructor[] constructors2 = class1.getDeclaredConstructors();
		for (Constructor c : constructors2) {
			System.out.println(c);//public java34.dya20.lianxi.Person() private java34.dya20.lianxi.Person(java.lang.String,int,char)
		}
		//获取单个构造方法//私有的也可以得到
		Constructor c=class1.getDeclaredConstructor(String.class,int.class,char.class);//获取参数列表是String.class,int.class,char.class方法
		System.out.println(c);
		//默认的private修饰的构造方法是不能用来创建对象的，如果想要创建，使用暴力破解
		c.setAccessible(true);
		Object o = c.newInstance("z",20,'男');
		System.out.println(o);
	}

}
