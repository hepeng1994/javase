package java34.dya03;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		float sut=scn.nextFloat();
		String result = sut>=90?"a":sut>=80?"b":sut>=70?"c":sut>=60?"d":"e";
		System.out.println(result);
		
}
	}
