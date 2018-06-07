package java34.dya09.animal;

public class InterfaceTest {
	public static void main(String[] args) {
		Cat2 a=new Cat2();
		a.name="笑话";
		a.eat();
		a.speak();	
	}
}
interface Pet{
	public void eat();
}


abstract  class Animal2{
	String name;
	public abstract void speak();
}


class Cat2 extends Animal2 implements Pet{

	@Override
	public void eat() {
			System.out.println("I want to eat some fish");
	}
	@Override
	public void speak() {
			System.out.println("miao,my name is"+name);
	}
	
}






