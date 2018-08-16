package java34.dya19.lianxi;

public class MyTimer {
	boolean flag=true;
	public void cancel(){
		flag=false;
	}
	
	public void schedule(MyTimerTask task, long delay){
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(flag){
					
					task.run();
				}
				
			}}).start();
	}
	public void schedule(MyTimerTask task,long delay,long period){
		new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(flag){
					try {
						Thread.sleep(period);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					task.run();
				}
				
			}}).start();
	}
}
