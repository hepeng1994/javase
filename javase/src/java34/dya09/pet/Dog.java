package java34.dya09.pet;

public class Dog extends Animal {
	String furColor;
	public Dog(){}
	public Dog(String name,String furColor){
		this.name=name;
		this.furColor=furColor;
	}
	
	public void enjoy() {
		
		System.out.println("我是"+this.name+",我的皮毛是"+this. furColor+"摇啊摇");	
	}
}
