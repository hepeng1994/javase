package java34.dya04;

import java.util.Scanner;

public class WhileDemo2 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("请输入密码");
		int a = scn.nextInt();
		while(a!=1234){
			System.out.println("请重新输入密码");
			a=scn.nextInt();
			}
			
			System.out.println("登录成功");
		}
	}


