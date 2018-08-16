package java34.dya12;

import java.math.BigDecimal;


/**		BigDecimal成员方法
		计算小数精确度
 * 	public BigDecimal add(BigDecimal augend)
	public BigDecimal subtract(BigDecimal subtrahend)
	public BigDecimal multiply(BigDecimal multiplicand)
	public BigDecimal divide(BigDecimal divisor)
	public BigDecimal divide(BigDecimal divisor,int scale, int roundingMode)

 
 *
 */

public class BigDecimalDemo {
	public static void main(String[] args) {
		BigDecimal s=new BigDecimal("2.25678654324");
		BigDecimal s1=new BigDecimal("1.2");
		
		System.out.println(s.add(s1));
		System.out.println(s.subtract(s1));
		System.out.println(s.multiply(s1));
		System.out.println(s.divide(s1));
		System.out.println(s.divide(s1,7, BigDecimal.ROUND_HALF_UP));
	}

}
