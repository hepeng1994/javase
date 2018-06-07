package java34.dya15.lianxi;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			new SimpleDateFormat().parse("");
		} catch (ParseException e) {
			System.out.println("123");
			//e.printStackTrace();
		}finally{
			System.out.println("你好");
		}
		System.out.println("game over");
	}
}
