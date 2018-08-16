package java34.dya17.lianxi;

import java.io.File;
import java.io.FilenameFilter;
import java34.Util.CobyMethod;

public class IoTest4 {
	public static void main(String[] args) {
		copy1("d:/pic","d:/pic6",".jpg");
	}
	public static void copy1(String a,String b,String c){
		File src=new File(a);
		File dest=new File(b);
		
		if(!dest.exists()){
			dest.mkdirs();
		}
		
		File[] files = src.listFiles(new FilenameFilter() {
			
			public boolean accept(File dir, String name) {
				File fi=new File(dir,name);
				if(fi.isFile()&&fi.getName().endsWith(c)){
					return true;
				}
				return false;
			}
		});
		if(files!=null&&files.length>0){
			for(File d:files){
				File e=new File(dest,d.getName());
				CobyMethod.bisAndBosCopy(d.getAbsolutePath(), e.getAbsolutePath());
			}
		}
	}
}
