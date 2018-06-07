package java34.dya17;

import java.io.File;
import java34.Util.CobyMethod;

public class IoTest {
	public static void main(String[] args) {
		copyMultiFolder("F:\\BiZhi","F:\\BiZhi1");
	}
	public static void copyMultiFolder(String srcPath,String destPath){
		File srcFile=new File(srcPath);
		File destFile=new File(destPath);
		
		if(!destFile.exists()){
			destFile.mkdirs();
		}
		
		if(srcFile.isFile()){
			File newFile=new File(destPath,srcFile.getName());
			CobyMethod.bisAndBosCopy(srcFile.getAbsolutePath(), newFile.getAbsolutePath());
		}else{
			File newFile=new File(destPath,srcFile.getName());
			newFile.mkdir();
			File[] listFiles = srcFile.listFiles();
			if(listFiles!=null&&listFiles.length>0){
				for(File f:listFiles){
					copyMultiFolder(f.getAbsolutePath(),newFile.getAbsolutePath());
				}
			}
		}
		System.out.println("over");
	}
}
