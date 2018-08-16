package java34.dya16;

import java.io.File;

public class DiGui1 {
	public static void main(String[] args) {
		findAllfiles("d://",".jpg");
		
	}
	public static void findAllfiles(String path,String suffix){
		File f=new File(path);
		if(f.isFile()){
			if(f.getName().endsWith(suffix)){
				System.out.println(f.getAbsolutePath());
			}
		}else{
			File[] li=f.listFiles();
			if(li!=null&&li.length>0){
				for(File a:li){
					findAllfiles(a.getAbsolutePath(),suffix);
				}
			}
		}
	}
}
