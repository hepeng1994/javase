package java34.dya16.lianxi;

import java.io.File;

public class DiGui2 {
	public static void main(String[] args) {
		d("d://",".jpg");
		
	}
	public static void d(String path ,String suffix){
		File file=new File(path);
		
		if(file.isFile()){
			if(file.getName().endsWith(suffix)){
				System.out.println(file.getAbsolutePath());
			}
		}else{
			File[] list = file.listFiles();
			if(list!=null&&list.length>0){
				for(File a:list){
					d(a.getAbsolutePath(),suffix);
				}
			}
		}
		
	}
}
