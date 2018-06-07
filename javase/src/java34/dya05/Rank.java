package java34.dya05;

import java.util.Scanner;

public class Rank {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("请输入数值");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=rank(a,b);
	System.out.println(c);
		
	}
	public static int  rank(int a,int b){
		String str="";
		int c=0;
		for(int i=0;i<b;i++){
				str +=a;
				c+=Integer.valueOf(str);
				
				}
		return c;		
	}
}
