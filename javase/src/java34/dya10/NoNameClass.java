package java34.dya10;

public class NoNameClass {
	public static void main(String[] args) {
		new Cat(){
			public void Cat() {
				System.out.println("我是一只猫");	
			}
			}.Cat();
		new Pig(){
			public void Pig() {
				System.out.println("猪");
			}
			}.Pig();
		new Dog(){
			public void Dog(){
				System.out.println("狗");
			}
		}.Dog();
	}

}
interface  Cat{
	void Cat();
}
abstract class Pig{
	abstract public void Pig();
}

class Dog{
	public void Dog(){
		System.out.println("");
	}
}