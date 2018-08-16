package java34.dya19.lianxi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTimerDemo {
	public static void main(String[] args) {
		MyTimer t=new MyTimer();
		
		t.schedule(new MyTimerTask(){

			@Override
			public void run() {
				System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
				
			}},3000,1000);
	}

}
