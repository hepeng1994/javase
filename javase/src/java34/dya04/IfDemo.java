package java34.dya04;

import java.util.Scanner;

public class IfDemo {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("请输入一个数值");
	int  a=scn.nextInt();
	System.out.println("请在输入一个数值");
	int  b=scn.nextInt();
	/*if(a==b){
		System.out.println("相等");
	}
	if(a!=b){
		System.out.println("不相等");*/
	String c="不相等";
			if(a==b){
				c="相等";
	}
			System.out.println(c);
}
}
