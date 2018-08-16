package java34.dya18.safe;

public class Tickets1 {
	public static void main(String[] args) {
		a b=new a();
		a c=new a();
		
		b.start();
		c.start();
	}

}
class a extends Thread{
	public static int b=100;
	
	public void run(){
		while(true){
			synchronized (a.class) {
				if(b>0){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"正在销售第"+b--+"张票");
				}else{
					break;
				}
			}
		}
	}
}