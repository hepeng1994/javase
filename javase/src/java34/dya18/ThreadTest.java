package java34.dya18;

public class ThreadTest {
	public static void main(String[] args) {
		abc d=new abc();
		d.start();
		abcd a=new abcd();
		Thread c=new Thread(a);
		c.start();
	}

}
class abc extends Thread{
	
	public void run(){
		for(char i='a';i<='z';i++){
			System.out.println(i);
		}
	}
}
class abcd implements Runnable{

	@Override
	public void run() {
		for(char i='A';i<='Z';i++){
			System.out.println(i);
		}
		
	}
	
}