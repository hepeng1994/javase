package java34.dya15.lianxi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
	public static void main(String[] args) throws ParseException {
		int[] arr=null;
		//System.out.println(arr[0]);
		
		Date d=new SimpleDateFormat("yyyy-MM-dd").parse("2017-01-01");
		System.out.println(d);
	}

}
