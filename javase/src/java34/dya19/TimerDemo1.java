package java34.dya19;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo1 {
	public static void main(String[] args) {
		Timer t=new Timer();
		
		t.schedule(new TimerTask(){

			@Override
			public void run() {
				System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
				
			}}, 5000,1000);
	}

}
