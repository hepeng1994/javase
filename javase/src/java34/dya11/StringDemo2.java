package java34.dya11;

public class StringDemo2 {
	public static void main(String[] args) {
		String a="abc";
		byte[] bytes=a.getBytes();
		System.out.println(bytes[1]);
		
		char[] b=a.toCharArray();
		System.out.println(b[0]);
		
		
	}

}
