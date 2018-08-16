package java34.dya16.lianxi;

import java.io.File;

public class DiGui7 {
	public static void main(String[] args) {
		
	}
	public static void d(String path, String suffix){
		File file=new File(path);
		if(file.isFile()){
			if(file.getName().endsWith(suffix)){
				System.out.println(file.getAbsolutePath());
			}
		}else{
			File[] files = file.listFiles();
			if(files!=null&&files.length>0){
				for(File a:files){
					d(a.getAbsolutePath(),suffix);
				}
			}
			file.delete();
		}
	}
}
