package java34.dya19.Timer;

public class MyTimer {
	
	boolean flag=true;
	public void  c(){
		flag=false;
	}
	
	public void schedule(MyTimerTask task,long delay){
		new Thread(new Runnable() {
			
			public void run() {
				
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				if(flag){
					task.run();
				}
			}
		}).start();
	}
	public void schedule(MyTimerTask task,long delay,long period){
		new Thread(new Runnable() {
			
			public void run() {
				
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				while(flag){
					task.run();
					try {
						Thread.sleep(period);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}	
		}).start();
	}
}
