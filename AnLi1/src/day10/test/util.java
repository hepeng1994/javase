package day10.test;

import day10.Util;

public class util {
	public static void main(String[] args) {
		try {
			String runjia = Util.runjia("java -jar E:\\lianxi\\word1.jar");
			System.out.println(runjia);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
