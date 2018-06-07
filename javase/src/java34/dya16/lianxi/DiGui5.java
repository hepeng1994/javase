package java34.dya16.lianxi;

import java.io.File;

public class DiGui5 {
	public static void main(String[] args) {
		
	}
	public static void  a(String path,String suffix){
		File  file=new File(path);
		if(file.isFile()){
			if(file.getName().endsWith(suffix)){
				System.out.println(file.getAbsolutePath());
			}else{
				File[] li = file.listFiles();
				if(li!=null&&li.length>0){
					for(File b:li){
						a(b.getAbsolutePath(),suffix);
					}
				}
			}
		}
	}
}
