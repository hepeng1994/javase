package java34.dya17.lianxi;

import java.io.File;
import java34.Util.CobyMethod;

public class IoTest6 {
	
	public static void main(String[] args) {
		copy2("","");
	}
	public static void copy2(String a,String b){
		File src=new File(a);
		File dest=new File(b);
		
		if(!dest.exists()){
			dest.mkdirs();
		}
		
		if(src.isFile()){
			File file=new File(dest.getAbsoluteFile(),src.getName());
			CobyMethod.bisAndBosCopy(src.getAbsolutePath(), file.getAbsolutePath());
		}else{
			//File fi=new File(dest.getAbsoluteFile(),src.getName());
			//fi.mkdir();
			File[] files = src.listFiles();
				if(files!=null&&files.length>0){
					for(File f:files){
						File bd=new File(dest.getAbsoluteFile(),src.getName());
							copy2(f.getAbsolutePath(),bd.getAbsolutePath());
					}
				}
			}
		}
	}