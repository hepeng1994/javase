package java34.dya10.wanShu;

public class Prime extends Number{
	@Override
	public void method() {
		for(int i=3;i<100;i++){
			for(int j=2;j<=i;j++){
				
			if(i==j){
				System.out.println(i);}
			if(i%j==0){
				break;
			}
			
			
			}
		
		}}}
		
	
 



//单力设计模式
class Singleton{
	private  static Singleton s=new Singleton();
	private  Singleton(){}
	private  static Singleton getInstance(){
		return s;
	}
}

class Singleton1{
	private static Singleton1 s=null;
	private Singleton1(){}
	public  static Singleton1 getInstance(){
		if(s==null){
			s=new Singleton1();
		}
		return s;
	}
}




















