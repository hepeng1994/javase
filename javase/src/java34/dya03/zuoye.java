package java34.dya03;

import java.util.Scanner;

public class zuoye {
	public static void main(String[] args) {
		Scanner scn= new  Scanner(System.in);
		
		float  x=scn.nextFloat();
		
		if(x>=3){
			
			float y=2*x+1;
			System.out.println(y);
		}else if(-1<=x&x<1){
			float y=2*x;
			System.out.println(y);
		}else if(x<-1){
			float y=2*x-1;
		    System.out.println(y);
		}else{
			System.out.println("你输入的数据不合法");
		}
	}

}
