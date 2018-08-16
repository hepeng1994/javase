package java34.dya17.lianxi;

import java.io.File;
import java34.Util.CobyMethod;

public class IoTest3 {
	public static void main(String[] args) {
		CopyFile("d:/pic","d:/pic6",".jpg");
	}
	public static void CopyFile(String srcPath,String destPath,String suffix){
		File src=new File(srcPath);
		File dest=new File(destPath);
		
		if(!dest.exists()){
			dest.mkdirs();
		}
		
		File[] listFiles = src.listFiles();
		if(listFiles!=null&&listFiles.length>0){
			for(File a:listFiles){
				if(a.isFile()&&a.getName().endsWith(suffix)){
						File file=new File(destPath,System.nanoTime()+suffix);
						CobyMethod.bisAndBosCopy(a.getAbsolutePath(), file.getAbsolutePath());
				}
			}
		}
	}
}
