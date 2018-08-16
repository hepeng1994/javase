package java34.dya15.Exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		try{
		System.out.println(1/0);
		}catch(Exception e ){
			System.out.println("你好");
			//System.exit(0);
		}finally{
			System.out.println("好");
		}
	System.out.println("很好");
	}
}
