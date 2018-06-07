package java34.dya17;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class CopyTu {
	
	public static void main(String[] args) {
		File file=new File("d:/pic");
		File des=new File("d:/pic1");
		
		des.mkdirs();
		
		File[] list = file.listFiles();
		List<File> li=new ArrayList<>();
		if(list!=null&&list.length>0){
			for(File f:list){
				if(f.isFile()&&f.getName().endsWith(".jpg")){
					li.add(f);
				}
			}
		}
		if(li!=null&&li.size()>0){
			for(File l:li){
				
			}
		}
	}

}
