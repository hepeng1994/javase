package java34.dya19.lianxi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo2 {
	public static void main(String[] args) {
		//public void schedule(TimerTask task, long delay)
		Timer timer=new Timer();
		
		TimerTask task = new TimerTask(){
			
			public void run(){//用来定义定时器的任务
				System.out.println("炸弹将在5秒钟后爆炸");
				timer.cancel();
			}
		};
		//同一个定时器的任务只能被调度一次
		timer.schedule(task, 5000);
		//timer.schedule(timerTask, 1);//task already scheduled or cancelled
		
				//public void schedule(TimerTask task,Date time)//安排在指定的时间执行指定的任务。如果此时间已过去，则安排立即执行该任务。
				
		
		try {
			timer.schedule(new TimerTask(){

				@Override
				public void run() {
					System.out.println("我们");
					
				}}, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-5-22 20:06:00"));
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		//cancel 终止此计时器，丢弃所有当前已安排的任务。这不会干扰当前正在执行的任务（如果存在）。一旦终止了计时器，那么它的执行线程也会终止，并且无法根据它安排更多的任务。
				//public void schedule(TimerTask task,long delay,long period)---
	}
}
