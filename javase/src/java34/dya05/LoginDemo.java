package java34.dya05;

import java.util.Scanner;

/**
 * login: 登录 
 * register:注册
 */
public class LoginDemo {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String userName=scn.nextLine();
		String password=scn.nextLine();
		boolean re = login(userName,password);
		if(re){
			System.out.println("登录成功");
		}else{
			System.out.println("用户名或密码错误");
		}
		
	}
	 public static boolean login(String userName,String password){
		 String gwd=getPwdByUserName(userName);
		 return gwd.equals(password);
} 
	public static  String getPwdByUserName(String userName ){
		return  "12345";
	}
}
