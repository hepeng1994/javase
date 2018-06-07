package java34.dya11;
/**
 * 			StringBuffer类的成员方法
		添加功能
			public StringBuffer append(String str) 把内容添加到你要添加到字符串的后面
			public StringBuffer insert(int offset,String str)把你要添加的内容 从第几个字符后开始添加
		删除功能
			public StringBuffer deleteCharAt(int index)删除一个字符串里的第几个字符
			public StringBuffer delete(int start,int end)删除一个字符串里从第几个字符到第几个字符之前
		替换功能
			public StringBuffer replace(int start,int end,String str)替换第几个字符到第几个字符的字符串内容
		反转功能	 
			public StringBuffer reverse()字符串反转
		截取功能
			public String substring(int start)截取第几个字符之后的字符串
			public String substring(int start,int end)截取第几个字符到第几个字符之前的字符串

 */

public class StringDemo7 {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("烦恼无处不在");
		System.out.println(s.append(",我该如何面对"));
		System.out.println(s.insert(2, "的"));
		System.out.println(s.deleteCharAt(5));
		System.out.println(s.delete(2, 5));
		System.out.println(s.replace(2, 3, "人心"));
		System.out.println(s.reverse());
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 5));
				
	}
}
