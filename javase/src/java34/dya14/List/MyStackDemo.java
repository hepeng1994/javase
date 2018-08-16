package java34.dya14.List;

public class MyStackDemo {
	public static void main(String[] args) {
		MyStack s=new MyStack();
		
		s.add("hello");
		s.add("world");
		s.add("java");
		
		while(!s.isEmpty()){
			System.out.println(s.get());
		}
	}

}
