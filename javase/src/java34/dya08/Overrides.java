package java34.dya08;

public class Overrides {
	

}
class A{
	public void name(){
		System.out.println("郑贵强");
	}
	private void color(){
		System.out.println("蓝色");
	}
	public static void sex(){
		System.out.println("男");
	}
}

class B extends A{
	@Override
	public void name(){
		System.out.println("张彬");
	}
	
	private void color(){
		System.out.println("黄色");
	}
	
	public static void sex(){
		System.out.println("男");
	}
	
}