package java34.dya20.lianxi;
/**
 * 
 *  JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
 *  对于任意一个对象，都能够调用它的任意一个方法和属性；
 *  这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
	
 *	对类的解剖
 *
 *	Class: 字节码对象
 *		如何获取Class对象
 *
 */

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		//类名.class
		Class c=Person.class;
		//对象.getClass
		//Person p=new Person(null, 0, 0);
		//Class c1 = p.getClass();
		//Class.forName
		Class c2 = Class.forName("java34.dya20.lianxi.Person");
		//对比三个字节码对象是否一个
		//System.out.println(c==c1);
		System.out.println(c==c2);
		//System.out.println(c1==c2);
		
		System.out.println(c.getName());//java34.dya20.lianxi.Person
		System.out.println(c.getSimpleName());//Person
		System.out.println(c.getPackage());//package java34.dya20.lianxi
		//调用变量
		Object object = c2.newInstance();
		System.out.println(object);//Person [name=null]
		
	}

}
