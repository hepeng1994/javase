package java34.dya17.lianxi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java34.Util.CobyMethod;

/**
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

public class IoTest2 {
	public static void main(String[] args) {
		String a="d:/pic";
		String b="d:/pic3";
		String c=".jpg";
		
		File src =new File(a);
		File des=new File(b);
		
		if(!des.exists()){
			des.mkdirs();
		}
		File[] list = src.listFiles();
		List<File> li=new ArrayList<File>();
		if(list!=null&&list.length>0){
			for(File f:list){
				if(f.isFile()&&f.getName().endsWith(c)){
					li.add(f);
					
				}
			}
		}
		if(li!=null&&li.size()>0){
			for(File l:li){
				File f2=new File(b,System.nanoTime()+c);
				CobyMethod.bisAndBosCopy(l.getAbsolutePath(), f2.getAbsolutePath());
			}
		}
	}

}
