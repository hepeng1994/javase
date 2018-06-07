package java34.dya18.safe;

public class WaitNotifyDemo {
	public static void main(String[] args) {
		Object o=new Object();
		Thread2 td=new Thread2(o);
		Thread4 td2=new Thread4(o);
		Thread5 td3=new Thread5(o);
		td.start();
		td2.start();
		td3.start();
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread3 td1=new Thread3(o);
		td1.start();
	}

}
class Thread2 extends Thread{
	Object o;
	public Thread2(Object o){
		this.o=o;
	}
	public void run(){
		synchronized(o){
			System.out.println("wait.........start......");
			try {
				o.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("wait........end......");
		}
	}
}
class Thread4 extends Thread{
	Object o;
	public Thread4(Object o){
		this.o=o;
	}
	public void run(){
		synchronized(o){
			System.out.println("wait.........start......");
			try {
				o.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("wait........end......");
		}
	}
}
class Thread5 extends Thread{
	Object o;
	public Thread5(Object o){
		this.o=o;
	}
	public void run(){
		synchronized(o){
			System.out.println("wait.........start......");
			try {
				o.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("wait........end......");
		}
	}
}
class Thread3 extends Thread{
	Object o;
	public Thread3(Object o){
		this.o=o;
	}
	public void run(){
		synchronized(o){
			
			System.out.println("notify.........start......");
				o.notifyAll();
			System.out.println("notify........end......");
		}
	}
}