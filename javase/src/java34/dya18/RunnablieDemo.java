package java34.dya18;

public class RunnablieDemo implements Runnable {
	public static String name;
	public static int sum=0;
	public void run() {
		for(int i=0;i<=1;i++){
			sum+=i;
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		RunnablieDemo rb=new RunnablieDemo();
		new Thread(rb).start();
		
		System.out.println("吓死你");
	}
}
