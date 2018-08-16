package java34.dya12;

public class WrapperClassDemo {
	public static void main(String[] args) {
		
		//装箱：把基本数据类型包装成包装类
		int i=100;
		Integer i1=new Integer(i);
		
		//拆箱：把包装类拆成基本类型
		int i2=i1.intValue();
		
		//从JDK1.5以后，支持自动拆装箱
		Integer i3=i;
		int i4=i3;
		
		//int 和string之间的相互转换
		//1.int 转成String
		int i5=100;
		String s=i5+"";
		String s1=String.valueOf(i5);
		//2.String转成int
		String str="50";
		int a=Integer.parseInt(str);
		int b=Integer.valueOf(str);
		int c= new Integer(str);
		
		
	}

}
