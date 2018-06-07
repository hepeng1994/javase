package java34.dya15.Exception;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		
		try {
			test();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	public static void test() throws Exception{
		System.out.println("感觉不对劲");
		throw new Exception("有点不对劲");
	}
}
