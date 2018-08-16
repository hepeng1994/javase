package java34.dya19.lianxi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatRoomTest {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		pool.execute(new ChatroomServerDemo());
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.execute(new ChatRoomClientDemo());
	}

}
