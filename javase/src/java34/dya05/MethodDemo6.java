package java34.dya05;

public class MethodDemo6 {
	public static void main(String[] args) {
		boolean b=a(100000000000l,3);
		System.out.println(b);
		 
	}
	public static  boolean a(byte a,byte b){
		System.out.println("调用的是1");
		return a==b;
	}
	public static  boolean a(short a,short b){
		System.out.println("调用的是2");
		return a==b;
	}
	public static  boolean a(int a,int b){
		System.out.println("调用的是3");
		return a==b;
	}
	public static  boolean a(long a,long b){
		System.out.println("调用的是4");
		return a==b;
	}
}
