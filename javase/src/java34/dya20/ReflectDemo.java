package java34.dya20;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Class a=Person.class;
		
		Person p= new Person();
		Class a1 = p.getClass();
		
		Class a2 = Class.forName("java34.dya20.Person");
		System.out.println(a==a1);
		System.out.println(a==a2);
		System.out.println(a1==a2);
		
		System.out.println(a.getName());
		System.out.println(a.getSimpleName());
		System.out.println(a.getPackage());
		
		Object o = a2.newInstance();
		System.out.println(o);
	}

}
