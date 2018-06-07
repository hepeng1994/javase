package java34.dya16.lianxi;

import java.io.File;

public class DiGui1 {
	//递归查找D盘中是Jpg的文件
	public static void main(String[] args) {
		a("d://",".jpg");
		
	}
	public static void a(String b,String c){
		File f=new File(b);
		//判断是不是一个文件
		if(f.isFile()){
			//如果是  文件名后缀和 c的一样 这打印出来绝对路径
			if(f.getName().endsWith(c)){
				System.out.println(f.getAbsolutePath());
			}
			//如果不是
		}else{
			//获取当前文件文件下的所有文件和绝对路径
			File [] e=f.listFiles();
			//判断文件下是否为空和长度是否大于0；
			if(e!=null&&e.length>0){
				//遍历当前文件夹下所有文件
				for(File g:e){
					//调用自己的方法 重复比对，知道找到当前目录下所有符合的文件
					a(g.getAbsolutePath(), c);
				}
			}
		}
	}
}
