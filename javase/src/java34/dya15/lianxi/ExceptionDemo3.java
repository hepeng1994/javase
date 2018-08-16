package java34.dya15.lianxi;

import java.text.SimpleDateFormat;

/**
 * 	getMessage()
		获取异常信息，返回字符串。
	toString()
		获取异常类名和异常信息，返回字符串。
	printStackTrace()
		获取异常类名和异常信息，以及异常出现在程序中的位置。返回值void。
	printStackTrace(PrintStream s)
		通常用该方法将异常内容保存在日志文件中，以便查阅。 

 * @author ASUS
 *
 */
public class ExceptionDemo3 {
	public static void main(String[] args) {
		new SimpleDateFormat();
	}

}
