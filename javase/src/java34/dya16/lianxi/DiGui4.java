package java34.dya16.lianxi;

import java.io.File;

public class DiGui4 {
	public static void main(String[] args) {
		
	}
	public 	static void deleteFile(String path){
		File file=new File(path);
		
		if(file.isFile()){
			file.delete();
			
		}else{
			File[] li = file.listFiles();
			if(li!=null&&li.length>0){
				for(File a:li){
					deleteFile(a.getAbsolutePath());
				}
			}
			file.delete();
		}
		
		
	}
}
