package java34.dya19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		Timer t=new Timer();
		
		t.schedule(new TimerTask(){

			@Override
			public void run() {
			System.out.println("将在5秒后自爆");
			}},5000);
		
		
		try {
			t.schedule(new TimerTask(){

				@Override
				public void run() {
					System.out.println("9点42到了，该起床了");
					t.cancel();
				}}, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-05-22 9:42:00"));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}

}
