package java34.dya08;

public class Extends {
	public static void main(String[] args) {
		C1 a=new C1();
		System.out.println(a.name);
		a.c();
		
		A1 b=new A1();
		System.out.println(b.name);
		b.a();
		
		B1 c=new B1();
		System.out.println(c.name);
		c.b();
	}

}


class A1{
	String name="郑贵强";

	
	public A1(){
		super();
	}
	
	public A1(String name){
		System.out.println("郑贵强是帅哥");
	}
	
	public void a(){
		System.out.println("郑贵强是帅哥1");
	}
}

class B1 extends A1{
	String name="何鹏";
	
	
	public void b(){
		System.out.println("何鹏你最帅");
	}
	
	public B1(){
		super();
	}
	
	public B1(String name){
		this();
		
	}
	
	public B1(double price){
		super();
		
	}
}

class C1 extends A1{
	String name="张彬";
	
	
	public void c(){
		System.out.println("何鹏你最帅2");
	}
	public C1(){
		super();
	}
	
	public C1(String name){
		
		this. name=name;
	}
	
	public C1(double price){
	
	}
}