package java34.dya05;

import java.util.Scanner;

public class MethodDemo4 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		System.out.println(sum(a));
		
	}
	public static boolean sum(int a){
		return a%2==0;
	}
}
