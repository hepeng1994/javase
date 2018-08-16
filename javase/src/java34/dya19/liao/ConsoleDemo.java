package java34.dya19.liao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConsoleDemo {
	public static void main(String[] args) {
		
		ExecutorService a=Executors.newCachedThreadPool();
		a.execute(new ChatroomServerDemo());
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.execute(new ChatRoomClientDemo());
	}

}
