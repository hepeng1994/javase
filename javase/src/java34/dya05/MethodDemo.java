package java34.dya05;

import java.util.Scanner;

public class MethodDemo {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double a=scn.nextDouble();
		double b=scn.nextDouble();
		System.out.println(sum(a,b));
		
	}
	public static double sum (double a,double b){
		double sum=a+b;
		return sum;
	}
}
