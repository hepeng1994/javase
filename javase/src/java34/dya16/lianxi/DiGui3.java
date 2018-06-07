package java34.dya16.lianxi;

import java.io.File;
//递归删除
public class DiGui3 {
	public static void main(String[] args) {
		File f = new File("F:\\123");
		deleteAllDiles("F:\\123");
	}
	public static void deleteAllDiles(String path){
		//把Path包装成文件
		File file=new File(path);
		//判断自己是文件还是文件夹
		if(file.isFile()){
			//如果是文件及删除
			file.delete();
			//否则
		}else{
			//是文件夹，获取下面的所有文件
			File[] list = file.listFiles();
			//判断是否为空，和长度是否大于0，如果不是说明下面有文件
			if(list!=null&&list.length>0){
				//遍历所有文件
				for(File a:list){
					//然后调用自己重复寻找遍历后的所有文件下的东西，直到把所有的文件都删除
					deleteAllDiles(a.getAbsolutePath());
				}
			}
			//然后删完了文件，删除自己
			file.delete();
		}
	}
}
