package java34.dya09.animal;

public class Store {
	public Animal getInstabce( String a){
		if("dog".equals(a)){
			return new Dog();
		}else if("pig".equals(a)){
			return new Pig();
		}else{
			return new Cat();
		}
	}
}
