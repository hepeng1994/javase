package java34.dya04;

import java.util.Scanner;

public class IfDemo2 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("请输入数值");
	int  x=scn.nextInt();
	int y;
	if(x>=3){
		 y=2*x+1;
		System.out.println(y);
	}else if(-1<=x&x<1){
		 y=2*x;
		System.out.println(y);
	}else if(x<-1){
		 y=2*x-1;
		System.out.println(y);
	}else{
		System.out.println("你输入的数字有误");
	}
}
}
