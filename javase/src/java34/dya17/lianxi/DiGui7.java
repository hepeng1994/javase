package java34.dya17.lianxi;

import java.io.File;
import java34.Util.CobyMethod;

public class DiGui7 {
	public static void main(String[] args) {
		copyFile("E:\\学习\\maven，mysql学习内容\\day01","d:/b");
		
	}
	public static void copyFile(String srcPath,String destPath){
		File src=new File(srcPath);
		File dest=new File(destPath);
		
		if(!dest.exists()){
			dest.mkdirs();
		}
		if(src.isFile()){
			File newFile=new File(dest,src.getName());
			CobyMethod.bisAndBosCopy(src.getAbsolutePath(), newFile.getAbsolutePath());
		}else{
			File[] files = src.listFiles();
			if(files!=null&&files.length>0){
				for(File f:files){
					File newFile=new File(dest,src.getName());
					copyFile(f.getAbsolutePath(),newFile.getAbsolutePath());
				}
			}
		}
	}
}
