package java34.dya11;
/**			String判断功能
		boolean equals(Object obj) :比较字符串的内容
		boolean equalsIgnoreCase(String str)忽略大小写来比较内容
		boolean contains(String str)包含 比较的字符是否在内容里
		boolean startsWith(String str)是否以Str开头
		boolean endsWith(String str)是否以Str结束
		boolean isEmpty()判断字符串是否为空串
 */

public class StringDemo4 {
	public static void main(String[] args) {
		String s="abc";
		String s1=new String("abc");
		
		//boolean equals(Object obj) :比较字符串的内容
		System.out.println(s.equals(s1));//True
		
		//boolean equalsIgnoreCase(String str):忽略大小写来比较内容
		String s2="AbC";
		System.out.println(s2.equalsIgnoreCase("abc")); //true
		
		//boolean contains(String str):包含 比较的字符是否在内容里
		System.out.println("精忠报国".contains("国"));//true
		
		//boolean startsWith(String str) :是否以Str开头
		System.out.println("大不了重头再来".startsWith("大不了"));
		
		//boolean endsWith(String str):是否以Str结束
		System.out.println("大不了重头再来".endsWith("再来"));
		
		//boolean isEmpty() 判断字符串是否为空串
		String s3="";
		System.out.println(s3.isEmpty());
	}

}
