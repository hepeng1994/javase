package java34.dya07;

public class NoNameObjectDemo {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.age);
		System.out.println(s.name);
		
		System.out.println(new Student().age);
		System.out.println(new Student().name);
		
		say(new Student());
	}
	public static void say(Student s){
		System.out.println("强哥好帅");
	}
}
