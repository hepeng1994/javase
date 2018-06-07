package java34.dya15.Exception;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws MyException {
		if(age<0||age>260){
			throw new MyException("你是不是傻");
		}
		this.age = age;
	}
	public static void main(String[] args) {
		Person p=new Person();
		try {
			p.setAge(-1);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
