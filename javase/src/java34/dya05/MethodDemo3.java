package java34.dya05;

import java.util.Scanner;

public class MethodDemo3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String a=scn.nextLine();
		get(a);
	}
	public static void get(String name){
		System.out.println(name+"你真漂亮");
	}
}
