package java34.dya11;
/**
 * public int hashCode():返回对象的hashCode值，是根据对象的地址运算出来的
 * 			不同的对象的hashCode值不同的
 * public final Class getClass():返回字节码对象：class
 * public String toString():获得对象的字符串表示。Object中的实现方式是返回地址值
 * 
 * public boolean equals(Object obj):判断两个对象是否是同一个对象
 *
 */

public class ObjectDemo {
	public static void main(String[] args) {
	
	Person p=new Person();
	System.out.println(p.toString());
	
	Person p1=new Person();
	//p1 = p;
			/**
			 * equals 和hashCode 是一对，equals也是可以重写的
			 * 在Object类中，equals的实现方法是  == 
			 * 
			 * 如果我们不想比较地址值，
			 * 		认定如果两个对象中的成员变量的值相同，我们就认为是同一个对象，应该怎么办？
			 * 		可以重写equals
			 * 		重写equals的时候，一定要重写hashCode
			 * 		
			 * 保证： 
			 * 		如果equals返回的结果是true,则他们的hashCode值一定要相同
			 * 
			 * 	equals： 判断的是字符串的内容
			 */
	boolean b = p.equals(p1);
	System.out.println(b);
	
	String s = "abc";
	String s1 = new String("abc");
	
	System.out.println(s ==s1);//false
	System.out.println(s.equals(s1));//true,比较字符串的内容
	}
}
class Person{
	String name="张三";
	int age=20;
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}