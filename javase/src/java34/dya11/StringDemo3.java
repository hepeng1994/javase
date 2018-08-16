package java34.dya11;
/**					String及构造方法
		public String(byte[] bytes)//按照byte数组里的数按照各自的编码转成所代表的字符拼接成字符串
		public String()
		public String(byte[] bytes,int offset,int length)offset ：偏移量 length：长度  按照byte数组里的数 从第一个角标截取几个长度的值
		public String(char[] value)按照char数组里的值按照各自的编码转成所代表的字符拼接成字符串
		public String(char[] value,int offset,int count) 按照char数组里的数 从第一个角标截取几个长度的值
		public String(String original)String类型
 */

public class StringDemo3 {
	public static void main(String[] args) {
		String b=new String();
		//public String(byte[] bytes) 按照byte数组里的数按照各自的编码转成所代表的字符拼接成字符串
		byte[] a=new byte[]{97,98,99,100,101};
		String b1=new String(a);
		System.out.println(b1);//abcde
		
		//public String(byte[] bytes,int offset,int length) //offset ：偏移量 length：长度  按照byte数组里的数 从第一个角标截取几个长度的值
		System.out.println(new String(a,2,3));
		
		//public String(char[] value)按照char数组里的值按照各自的编码转成所代表的字符拼接成字符串
		char [] c=new char[]{'a','b','c','d','e'};
		String c1=new String(c);
		System.out.println(c);
		
		//public String(char[] value,int offset,int count) 按照char数组里的数 从第一个角标截取几个长度的值
		System.out.println(new String(c,2,3));
		
		//public String(String original) String类型
		String d=new String("无怨无悔");
		System.out.println(d);
		
		//string直接赋值的方法
		
		String e="无怨无悔";
		System.out.println(e);
		
	}

}
