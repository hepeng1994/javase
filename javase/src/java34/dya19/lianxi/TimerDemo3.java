package java34.dya19.lianxi;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo3 {
	public static void main(String[] args) {
		
		Timer t=new Timer();
		
		/*t.schedule(new TimerTask() {
			
			public void run() {
				System.out.println("哈哈");
				
			}
		}, 5000,1000);*/
		t.schedule(new TimerTask(){

			@Override
			public void run() {
				System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS").format(new Date()));
				
			}}, 5000,1000);
	}
}
