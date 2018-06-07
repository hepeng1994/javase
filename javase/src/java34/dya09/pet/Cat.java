package java34.dya09.pet;

public class Cat extends Animal {
	String eyesColor;
	public Cat(){}
	public Cat(String name,String  eyesColor){
		this. eyesColor= eyesColor;
		this.name=name;
	}
	@Override
	public void enjoy() {
		System.out.println("我是"+this.name+",我的眼睛是"+this. eyesColor+"喵喵");	
	}

}
