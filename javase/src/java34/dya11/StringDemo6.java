package java34.dya11;
/**
 * 				String类转换功能
		byte[] getBytes()把字符串转换成byte数组
		char[] toCharArray()把字符串转换成char数组
		static String valueOf(char[] chs) 把char数组转换成字符串
		static String valueOf(int i)把int转换成字符串
		String toLowerCase()把字符串中的大写字母转成小写
		String toUpperCase()把字符串中的小写字母转成大写
		String concat(String str)字符串拼接
 */
public class StringDemo6 {
	public static void main(String[] args) {
		String a="abc";
		//byte[] getBytes() 把字符串转换成byte数组
		byte [] a1=a.getBytes();
		System.out.println(a1[0]);//97
		
		//char[] toCharArray() 把字符串转换成char数组
		String a2=new String(new char[]{'我','恨','你'});//把char数组转换成字符串
		System.out.println(a2);
		
		char[] a3=a2.toCharArray();//字符串转换成char数组
		System.out.println(a3[2]);
		
		//static String valueOf(char[] chs)  把char数组转换成字符串
		String a4=String.valueOf(new char[]{'我','烦','你'});
		System.out.println(a4);
		
		//static String valueOf(int i) 把int转换成字符串
		int a5=100;
		System.out.println(String.valueOf(a5));
		
		//String toLowerCase() 把字符串中的大写字母转成小写
		String  a6="AJHGkcsksk";
		System.out.println(a6.toLowerCase());
		
		//String toUpperCase() 把字符串中的小写字母转成大写
		System.out.println(a6.toUpperCase());
		
		//String concat(String str) 字符串拼接
		String a7="hello";
		System.out.println(a7.concat("word"));
	}

}
