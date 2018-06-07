package java34.dya18;

public class JoinDemo extends Thread{
	
	public static int sum=0;
	public void run(){
		for(int i=0;i<=1000;i++){
			sum+=i;
		}
	}
	
	public static void main(String[] args) {
		JoinDemo j=new JoinDemo();
		j.start();
		try {
			j.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sun="+sum);
	}
}
