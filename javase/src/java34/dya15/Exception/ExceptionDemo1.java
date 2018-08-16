package java34.dya15.Exception;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		
		try {
			new SimpleDateFormat().parse("");
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			try {
				e.printStackTrace(new PrintStream("d:/error.txt"));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
