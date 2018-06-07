package java34.dya11;

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Clone1 a=new Clone1();
		Object b=a.clone();
		System.out.println(b instanceof Clone1);
		Clone1 c=(Clone1)b;
		
	}
	
}
class Clone1 implements Cloneable{
	String name="郑贵强";
	int age=20;
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
		
	}
}