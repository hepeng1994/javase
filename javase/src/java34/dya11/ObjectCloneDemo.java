package java34.dya11;
/**
 * protected Object clone()
 * 			返回一个对象的副本
 * 如果使用clone方法：
 * 		1.让这个类实现Cloneable接口
 * 		2.重写clone方法，由于clone方法在Object类中是protected修饰的，无法再其他类中调用，所以我们把它重写
 * 成public的
 * 		public Object clone(){
 * 			return super.clone();
 *			 }
 * 		3.处理一个异常，clone方法需要处理异常，我们直接向上抛。需要注意的是，在调用的地方也要继续抛
 * 		4.直接调用clone方法获取一个副本，副本是Object类型的，我们可以通过instanceo方法判断他的类型
 * 		5.clone方法是一个浅拷贝方法
 * 				浅拷贝中的类中的引用类型的成员变量是同一个地址
 * 
 * 		创建一个类的对象，使用clone方法获取一个他的副本
 * 
 * 
 * @author ASUS
 *
 */

public class ObjectCloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//创建一个student对象
		Student s=new Student();
		//创建一个Object的对象指向子类的方法
		Object o=s.clone();
		
		//判断o是不是student类型的是就是true,不是就是flase
		System.out.println(o instanceof Student);
		//强转成student类型
		Student s1=(Student)o;
		//比较两个对象的name变量是否在相同的地址
		System.out.println(s.name==s1.name);
	}

}
//创建一个类实现接口Cloneeable
class Student implements Cloneable{
	//定义成员变量
	String name="小郑";
	int age=100;
	//重写 Cloneable里的clone方法    出现异常向上抛throws CloneNotSupportedException
	public Object clone() throws CloneNotSupportedException{
		return  super.clone();
		
	}
			
	
}


















