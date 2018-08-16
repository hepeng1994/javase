package java34.dya15.lianxi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println("除数是0了，搞啥呢");
			//e.printStackTrace();
		}
		
		Date d=null;
		try {
			new SimpleDateFormat("yyyy-MM").parse("1023M");
		} catch (ParseException e) {
			d=new Date();
			e.printStackTrace();
		}
		System.out.println(d);
		System.out.println("程序结束");
	}

}
