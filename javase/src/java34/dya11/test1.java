package java34.dya11;

import java.util.Scanner;
import java34.Util.ArrayUtil;

/**
 * 字符串反转，例如键盘录入abc，输出cba
 * @author ASUS
 *
 */

public class test1 {
	public static void main(String[] args) {
		String s="abcd";
		StringBuffer a=new StringBuffer(s);
		System.out.println(a.reverse());
		
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}
}
