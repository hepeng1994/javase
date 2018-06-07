package java34.dya13;

public class Test1 {
	public static void main(String[] args) {
		String a="13552610761";
		
		String b=a.replaceAll("(\\d{3})(\\d{4})(\\d{4})"," $1****$3");
		System.out.println(b);
	}

}
