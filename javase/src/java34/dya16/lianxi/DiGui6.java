package java34.dya16.lianxi;

import java.io.File;

public class DiGui6 {
	public static void main(String[] args) {
		
	}
	public static void d(String path){
		File file=new File(path);
		
		if(file.isFile()){
			file.delete();
		}else{
			File[] list = file.listFiles();
			if(list!=null&&list.length>0){
				for(File a:list){
					d(a.getAbsolutePath());
				}
			}
		}
	}
}
