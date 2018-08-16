package java34.dya13;

import java.util.Scanner;

public class RegexDemo {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("请输入你的qq号码");
		String a=scr.nextLine();
		boolean c=d(a);
		if(c){
			System.out.println("qq合法");
		}else{
			System.out.println("qq不合法");
		}
	}
	public static boolean d(String a){
		String b="[1-9][0-9]{4,14}";
		return a.matches(b);
	}
	
	public static boolean  b(String a){
		if(a.length()>=5&a.length()<=15){
			if(!a.startsWith("0")){
				for(int i=0;i<a.length();i++){
					char b=a.charAt(i);
					if(!Character.isDigit(b)){
					return false;
					}
				}
				return true;
			}
		}
		return false;
	}
}
	
