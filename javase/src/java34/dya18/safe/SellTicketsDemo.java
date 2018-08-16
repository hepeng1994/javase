package java34.dya18.safe;

public class SellTicketsDemo {
	public static void main(String[] args) {
		Tickets t=new Tickets();
		Thread td=new Thread(t);
		Thread td1=new Thread(t);
		Thread td2=new Thread(t);
		Thread td3=new Thread(t);
		td.start();
		td1.start();
		td2.start();
		td3.start();
	}
	
}
class Tickets implements Runnable{
	static int a=500;
	String s="1";
	@Override
	public void run() {
		while(true){
			synchronized (s) {
				if(a>0){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在销售第"+a--+"张票");
				}else{
					break;
				}
			
			}
		}
		
	}
	
}