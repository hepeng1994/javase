package java34.dya08;

public class CodeBlockDemo {
	
	static{
		System.out.println("我是静态代码块");
	}
	static int a=0;
	{
		System.out.println("我是构造代码块");
		a++;
	}
	
	
	public CodeBlockDemo(){
		System.out.println("我是无参构造方法");
	}
	public CodeBlockDemo(String a){
		System.out.println("我是有参构造方法");
	}
	
	public static void main(String[] args) {
		
		CodeBlockDemo c=new CodeBlockDemo();
		CodeBlockDemo c1=new CodeBlockDemo();
		CodeBlockDemo c2=new CodeBlockDemo(" ");
		
		System.out.println(a);
	}
}
