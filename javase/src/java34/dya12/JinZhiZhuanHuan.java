package java34.dya12;
/**
 *	 常用的基本进制转换
	public static String toBinaryString(int i)
	public static String toOctalString(int i)
	public static String toHexString(int i)
	十进制到其他进制
	public static String toString(int i,int radix)
	其他进制到十进制
	public static int parseInt(String s,int radix)


 
 */

public class JinZhiZhuanHuan {
	public static void main(String[] args) {
		int a=300;
		//public static String toBinaryString(int i) 十进制转二进制
		System.out.println(Integer.toBinaryString(a));
		
		//public static String toOctalString(int i) 十进制转八进制
		System.out.println(Integer.toOctalString(a));
		
		//public static String toHexString(int i) 十进制转十六进制
		System.out.println(Integer.toHexString(a));
		
		//public static String toString(int i,int radix) 十进制到其他进制
		System.out.println(Integer.toString(a, 18));
		
		//public static int parseInt(String s,int radix) 其他进制到十进制
		System.out.println(Integer.parseInt("zzzzz", 36));
	}

}
