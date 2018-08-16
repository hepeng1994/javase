package java34.dya16;

import java.io.File;



public class DiGui2 {
	public static void main(String[] args) {
		d("F:/1234");
	}
	public static void d(String paht){
		File f=new File(paht);
		if(f.isFile()){
			f.delete();
		}else{
			File[] li = f.listFiles();
			if(li!=null&&li.length>0){
				for(File a:li){
					d(a.getAbsolutePath());
				}
			}
			f.delete();
		}
	}
}
