package java34.dya11;

import java.util.Scanner;

/**
 * 联系：模拟登陆，共三次机会，并提示还有几次
 * @author ASUS
 *
 */
public class StringDest1 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String userName="abc";
		String passwprd="a5612";
		for(int i=0;i<3;i++){
			System.out.println("请输入账号");
			String a=scn.nextLine();
			System.out.println("请输入密码");
			String b=scn.nextLine();
			if(userName.equals(a)&passwprd.equals(b)){
				System.out.println("登陆成功");
				break;
			}else {
				if(i==2){
					System.out.println("次数以用完");
				}else{
				System.out.println("密码错误，请重新登陆，你还有"+(2-i)+"次机会");
				}
			}
		}
	}

}
