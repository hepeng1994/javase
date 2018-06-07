package java34.dya05;

import java.util.Scanner;

public class MethodDemo1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		System.out.println(max(a,b,c));
	}
	public static int max(int a,int b,int c){
	
	if(a>b&a>c){
		return a;
	}else if(b>a&b>c){
		return b;
	}else {
		return c;
	}
	
}
	}
