package java34.dya17.lianxi;

import java.io.File;
import java.io.FilenameFilter;
import java34.Util.CobyMethod;

/**
*
	复制单级文件夹中指定文件并修改文件名称
	
	d:/pic	源文件夹
			mn.jpg
			123.jpg
	
*	d:/pic2-----目标文件夹
*	后缀名： .jpg
*
*	srcPath: 		d:/pic
*	destPath		d:/pic3
*						d:/pic3/pic
*/

public class IoTest1 {
	public static void main(String[] args) {
		Copy("d:/pic","d:/pic2",".jpg");
	}
	public static void Copy(String srcPath,String destPath,String suffix){
		File srcFile=new File(srcPath);
		File destFile=new File(destPath);
		
		if(!destFile.exists()){
			destFile.mkdirs(); 
		}
		File[] lis = srcFile.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				File f1=new File(dir,name);
				if(f1.isFile()){
					if(name.endsWith(suffix)){
						return true;
					}
				}
				return false;
			}
		});
		if(lis!=null&&lis.length>0){
			for(File f:lis){
				File file=new File(destPath,System.nanoTime()+suffix);
				CobyMethod.bisAndBosCopy(f.getAbsolutePath(), file.getAbsolutePath());
			}
		}
	}
}
