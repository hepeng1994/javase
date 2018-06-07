package java34.dya05;

import java.util.Scanner;

public class MethodDemo5 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		suan(a,b);
	}
	public static void  suan(int a,int b){
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}
}
