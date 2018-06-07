package java34.dya11;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String name="abcd";
		String pasword="abd1234";
		
		for(int i=0;i<3;i++){
			System.out.println("请输入账号");
			String  a=scr.nextLine();
			System.out.println("请输入密码");
			String b =scr.nextLine();
			if( name.equals(a)&&pasword.equals(b)){
				System.out.println("登录成功");
				break;
			}else {
				if(i==2){
					System.out.println("你已经没有机会");
					break;
					}
				System.out.println("密码错误，请重新输入，还有"+(2-i)+"次机会");
				 
			}
		}
	}

}
