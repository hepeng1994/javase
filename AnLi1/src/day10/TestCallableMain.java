package day10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallableMain {
	final static String KEY = "天王盖地虎";
	public static void main(String[] args) {
		String stt=null;
		String stc=null;	
		String ip ="localhost";
		String path ="E:\\lianxi\\word1.jar";
		String comd ="java -jar E:\\lianxi\\word1.jar";
		String localPath="E:\\lianxi\\word.jar";
		CallableClient call = new CallableClient(path,comd,ip,localPath);
		FutureTask<String> futureTask = new FutureTask<String>(call);
		new Thread(futureTask).start();
		try {
			 stt = futureTask.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path2 ="E:\\lianxi\\word2.jar";
		String comd2 ="java -jar E:\\lianxi\\word2.jar";
		
		CallableClient call2 = new CallableClient(path2,comd2,ip,localPath);
		FutureTask<String> futureTask2 = new FutureTask<String>(call2);
		new Thread(futureTask2).start();
		try {
			 stc = futureTask2.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str =stt+stc;
		System.out.println(str);
	}
}
