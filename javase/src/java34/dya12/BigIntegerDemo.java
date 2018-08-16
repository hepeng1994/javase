package java34.dya12;

import java.math.BigInteger;

/**
 * 			BigInteger成员方法
		public BigInteger add(BigInteger val) 两数相加
		public BigInteger subtract(BigInteger val)两数相减
		public BigInteger multiply(BigInteger val)两数相乘
		public BigInteger divide(BigInteger val)两数相除
		public BigInteger[] divideAndRemainder(BigInteger val) 两数相乘  的出商 和余数

 */

public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger s=new BigInteger("1000000");
		BigInteger s1=new BigInteger("2500");
		
		System.out.println(s.add(s1));
		System.out.println(s.subtract(s1));
		System.out.println(s.multiply(s1));
		System.out.println(s.divide(s1));
		
		BigInteger [] s2=s.divideAndRemainder(s1);
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
	}

}
