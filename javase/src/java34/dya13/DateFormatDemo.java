package java34.dya13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();
		System.out.println(d);
		
		SimpleDateFormat  sdf=new SimpleDateFormat();
		
		String sr=sdf.format(d);
		System.out.println(sr);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String sr1=sdf1.format(d);
		System.out.println(sr1);
		
		String sr2="2018/05/14 09:40:25";
		
		Date d1=sdf1.parse(sr2);
		System.out.println(d1);
	}

}
