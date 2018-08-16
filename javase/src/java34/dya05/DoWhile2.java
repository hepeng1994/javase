package java34.dya05;

import java.util.Scanner;

public class DoWhile2 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("请输入密码");
		int a=scn.nextInt();
		do{
			System.out.println("你输入的密码有误");
			a=scn.nextInt();
		}while(a!=1234);
		System.out.println("登录成功");
	}

}