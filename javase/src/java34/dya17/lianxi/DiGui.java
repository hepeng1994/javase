package java34.dya17.lianxi;

import java.io.File;

public class DiGui {
	//递归删除
	public static void main(String[] args) {
		
	}
	public static void delete1(String a){
		File file=new File(a);
		
		if(file.isFile()){
			file.delete();
		}else{
			File[] files = file.listFiles();
			if(files!=null&&files.length>0){
				for(File b:files){
					delete1(file.getAbsolutePath());
				}
			}
			file.delete();
		}
	}
}
