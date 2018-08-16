package java34.dya09.pet;

public class Lady {
	String name;
	Animal get;
	public Lady(){}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getGet() {
		return get;
	}
	public void setGet(Animal get) {
		this.get = get;
	}
	public Lady(String name, Animal get) {
		this.name = name;
		this.get = get;
	}
	public void myPetEnjoy(){
		if(get instanceof Dog){
			System.out.println("宠物是狗");
		}
		if(get instanceof Cat){
			System.out.println("宠物是猫");
		}
		get.enjoy();
		System.out.println("我的宠物很高兴，我也很高兴");
	}
	
}
