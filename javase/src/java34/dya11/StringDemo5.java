package java34.dya11;
/**			String类获取功能
		int length() 获取字符串长度
		char charAt(int index) 获取字符串中对于索引的字符,返回值是char类型
		int indexOf(int ch)返回指定字符在字符串中第一次出现的索引值,如果没有返回-1
		int indexOf(String str)获取参数编码所代表的字符在字符串中的索引值，如果没有返回-1
		int indexOf(int ch,int fromIndex)从第几个索引开始找，获取参数编码所代表的字符在字符串中的索引值
		int indexOf(String str,int fromIndex)从第几个索引开始找,返回指定字符在字符串中第一次出现的索引值,如果没有返回-1
		String substring(int start)从第几个字符串开始切割到字符串最后的内容
		String substring(int start,int end)从第几个字符串开始切割到第几个字符串结束 包含atart,不包含end

 * 
 * 
 *
 */

public class StringDemo5 {
	public static void main(String[] args) {
		String a="黑夜给了我黑色眼睛，我却用它寻找光明";
		
		//int length() 获取字符串长度
		System.out.println(a.length());//18
		
		//char charAt(int index): 获取字符串中对于索引的字符,返回值是char类型
		System.out.println(a.charAt(3));//了
		
		//int indexOf(String str) //返回指定字符在字符串中第一次出现的索引值,如果没有返回-1
		System.out.println(a.indexOf("眼"));
		
		//int indexOf(int ch) :获取参数编码所代表的字符在字符串中的索引值，如果没有返回-1
		String a1="abcdefg";
		System.out.println(a1.indexOf(99));//2
		
		//int indexOf(int ch,int fromIndex)//从第几个索引开始找，获取参数编码所代表的字符在字符串中的索引值
		System.out.println(a1.indexOf(100, 2));//3
		
		//int indexOf(String str,int fromIndex)从第几个索引开始找,返回指定字符在字符串中第一次出现的索引值,如果没有返回-1
		System.out.println(a.indexOf("我", 4));
		
		//String substring(int start) 从第几个字符串开始切割到字符串最后的内容
		System.out.println(a.substring(8));
		
		//String substring(int start,int end) 从第几个字符串开始切割到第几个字符串结束 包含atart,不包含end
		System.out.println(a.substring(5,10));
		
	}

}
