package java34.dya11;

public class StringDemo {
	public static void main(String[] args) {
		String a=new String();
		
		byte[] a1=new byte[]{98,99,100,101,102,103};
		String a2=new String(a1);
		System.out.println(a2);
		
		String a3=new String(a1,3,3);
		System.out.println(a3);
		
		char [] a4=new char[]{'强','哥','威','武'};
		String a5=new String(a4);
		System.out.println(a5);
		
		String a6=new String(a4,1,3);
		System.out.println(a6);
		
		String a7="郑贵强";
		boolean a8=a7.equals("郑");
		System.out.println(a8);
	}

}
