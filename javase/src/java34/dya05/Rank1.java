package java34.dya05;

import java.util.Scanner;
/**
 * 
 * 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 		例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 * 	(x,y)
  				x:3
  				y:5
  	String ---->int:
  			int i = Integer.valueOf(String);
  			int j  = Integer.valueOf("77777");
 */
public class Rank1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println(ran(a,b));
		
	}
	public static int ran(int a,int b){
		String str="";
		int c=0;
		for(int i=0;i<b;i++){
			str+=a;
			c+=Integer.valueOf(str);
		}
		return c;
	}
}
