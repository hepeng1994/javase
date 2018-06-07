package java34.dya10;

public class OutCLass {
	public static void main(String[] args) {
		//调用内部类方法
		OuterClass.InnerClass inner=new OuterClass(). new InnerClass();
		inner.show();
		//调用局部类方法
		OuterClass inner1=new OuterClass();
		inner1.method();
		//调用静态内部类
		System.out.println(OuterClass.InnerClass2.bcd);
		System.out.println(new OuterClass.InnerClass2().abc);
	}

}
class OuterClass{
	private String name="郑贵强";
	static int age=100;
	double heiht=12.5;
	InnerClass i=new InnerClass();
	
	public void print(){
		
		System.out.println(i.names);
	}
	//内部类
	class InnerClass{
		double heiht=9.6;
		private String names="张彬";
		public void show(){
			System.out.println(name);
			System.out.println(age);
			System.out.println(heiht);
			System.out.println(OuterClass.this.heiht);
		}
	}
	//局部内部类
	public void method(){
		class InnerClass1{
			int age=10;
			public void show1(){
				System.out.println("郑贵强"+age);
			}
		}
			InnerClass1 a=new InnerClass1();
			a.show1();	
	}
	//静态内部类
	static class InnerClass2{
		String abc="abc";
		static String bcd="bcd";
	}
	
}