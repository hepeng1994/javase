package java34.dya20.lianxi;

public class Person {
	 private String name;
	public int age;
	 static char sex;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public String getName() {
		return name;
	}
	 private void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	 private Person(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public Person() {
		super();
	}
	
	
	
}
