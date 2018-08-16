package day10.test;

import java.io.File;
import java.io.IOException;

public class jhgfds {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\lianxi/b.txt");
		File a = file.getAbsoluteFile();
		String b = file.getAbsolutePath();
		File c = file.getCanonicalFile();
		String d = file.getCanonicalPath();
		long e = file.getFreeSpace();
		String f = file.getParent();//获得上一级路径
		String g = file.getPath(); //获得绝地路径
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
