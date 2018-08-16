package java34.dya12;
/**				Math及成员方法
		public static int abs(int a)
		public static double ceil(double a)
		public static double floor(double a)
		public static double pow(double a,double b)
		public static double random()
		public static int round(float a) 参数为double的自学
		public static double sqrt(double a)
 */

public class MathDemo {
	public static void main(String[] args) {
		System.out.println(Math.abs(-12.3));//绝对值
		System.out.println(Math.ceil(15.3));//比它大的离它最近的整数
		System.out.println(Math.floor(15.6));//比它小的离它最近的整数
		System.out.println(Math.pow(8,2));//数的几次方，前面是数，后面是几次方
		System.out.println(Math.random());//0-1之间的随机数
		System.out.println(Math.round(13.5));//四舍五入
		System.out.println(Math.sqrt(64));//开方
	}
}
