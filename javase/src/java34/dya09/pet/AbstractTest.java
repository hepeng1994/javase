package java34.dya09.pet;

public class AbstractTest {
	public static void main(String[] args) {
		
	
	Animal a=new Cat("佩琪","绿色");
	
	Lady gaga=new Lady("gaga女士",a);
	gaga.myPetEnjoy();
	
	System.out.println("过了一段时间，很不幸，我家的旺财走了。。。。我有换了一只狗");
	gaga.setGet(new Dog("旺财","黄色"));
	gaga.myPetEnjoy();
}
}