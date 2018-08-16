package java34.dya19.lianxi;

public class TimerDemo1 {
	public static void main(String[] args) {
		new Thread(new Runnable(){

			@Override
			public void run() {
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("该起床了");
			}}).start();
	}

}
