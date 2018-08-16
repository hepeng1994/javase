package java34.dya16;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilterDemo {
	public static void main(String[] args) {
		File l=new File("d:\\pic");
		f(l,".jpg");
		
	}
	public static void f(File f,String suffix){
		File[] li = f.listFiles(new FilenameFilter() {	
			public boolean accept(File dir, String name) {
				if(name.endsWith(suffix)){
					return true;
				}
				return false;
			}
		});
		for(File f1:li){
		System.out.println(f1.getAbsolutePath());
		}
	}
}
