package java34.dya04;

import java.util.Scanner;

public class IfDemo1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("请输入数值");
		
		int a1=scn.nextInt();
		/*int a2=scn.nextInt();
		if(a1>a2){
			System.out.println(a1);
		}else{
			System.out.println(a2);	
		}*/
		if(a1%2==0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
	}

}
