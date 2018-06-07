package java34.dya18;

public class ThreedDemo {
	public static void main(String[] args) {
		
		Demo a=new Demo();
		a.setAname("郑贵强");
		
		Demo b=new Demo();
		b.setAname("张彬");
		
		a.start();
		b.start();
	}

}
class Demo extends Thread{
	String aname;
	public void run(){
		show();
	}
	
	public String getAName() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public void show(){
		for(int i=0;i<10;i++){
		System.out.println(aname+","+i);
		}
	}
}