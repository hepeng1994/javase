package java34.dya04;

import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("请输入数值");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		
		if(a>b&a>c){
			System.out.println(a);
		}else if(b>a&b>c){
			System.out.println(b);
		}else if(c>b&c>a){
			System.out.println(c);
		}
}
}
