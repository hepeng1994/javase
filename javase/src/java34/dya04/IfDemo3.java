package java34.dya04;

import java.util.Scanner;

public class IfDemo3 {
	public static void main(String[] args)  {
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入月份");
		int a= scn.nextInt();
		
		if(3<=a&a<=5){
			System.out.println("春季");
		}else if(6<=a&a<=8){
			System.out.println("夏季");
		}else if(9<=a&a<=11){
			System.out.println("秋季");
		}else if(a==12|a==1|a==2){
			System.out.println("冬季");
		}else{
			System.out.println("你输入的月份错误");
		}
	}

}
