package java34.dya11;

public class StringDemo1 {
	public static void main(String[] args) {
		//int length() 字符串长度
		String a=new String("强哥最帅");
		System.out.println(a.length());
		//char charAt(int index) 返回指定索引处的 char 值
		System.out.println(a.charAt(2));
		//int indexOf(int ch) 返回指定字符在此字符串中第一次出现处的索引
		System.out.println(a.indexOf("0"));
		//int indexOf(String str)  返回指定子字符串在此字符串中第一次出现处的索引。
		System.out.println(a.indexOf("帅"));
		//int indexOf(int ch,int fromIndex)   返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
		System.out.println(a.indexOf("最",0));
		//int indexOf(String str,int fromIndex) 返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
		System.out.println(a.indexOf("哥最", 0));
		//String substring(int start)
		//System.out.println(a.starts()));
	}

}
