package java34.dya04;

import java.util.Scanner;

public class WhileDemo3 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("请输入密码");
		//接收输入端字符串
		String a=scn.nextLine();
		//利用while循环语句确定输入的字符串是否正确（字符串判断用equals)
		while(!"abc1234".equals(a)){
			//循环语句
			System.out.println("请再次输入密码");
			//重新赋值
			a=scn.nextLine();
		}
		System.out.println("登录成功");
	}

}
