package java34.dya17.lianxi;

import java.io.File;

public class DiGui4 {
	public static void main(String[] args) {
		lookup("d://",".jpg");
		
	}
	public static void lookup(String path,String suffix){
		File file=new File(path);
		
		if(file.isFile()&&file.getName().endsWith(suffix)){
			System.out.println(file.getAbsolutePath());
		}else{
			File[] files = file.listFiles();
			if(files!=null&&files.length>0){
				for(File f:files){
					lookup(f.getAbsolutePath(),suffix);
				}
			}
		}	
		
	}
}
