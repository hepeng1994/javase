package java34.dya04;

import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int a= scn.nextInt();
		System.out.println("请输入+,-,*,/");
		String b=scn.next();
		System.out.println("请输入第二个数字");
		int c= scn.nextInt();
		switch(b){
		case "+":
			System.out.println(a+"+"+c+"="+(a+c));
			break;
		case "-":
			System.out.println(a+"-"+c+"="+(a-c));
			break;
		case "*":
			System.out.println(a+"*"+c+"="+(a*c));
			break;
		case "/":
			System.out.println(a+"/"+c+"="+(a/c));
			break;
		default:
			System.out.println("长点心吧");	
		}
	}

}
