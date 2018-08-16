package java34.dya10;

public class PersonTest{
	public static void main(String[] args) {
		new PersonDemo().method(new Person(){
			@Override
			public void show() {
				System.out.println("万水千山总是情");	
			}
			});
		
	}
}
 abstract class Person {
	public abstract void show();
}

class PersonDemo {
	public void method(Person p){
		p.show();
	}
}

