package java34.dya11;

public class StingTest1 {
	public static void main(String[] args) {
		String a="kkfknsldk2312HSJNSXDD";
		int b=0;
		int c=0;
		int d=0;
		for(int i=0;i<a.length();i++){
			System.out.println(a.charAt(i));
			if(a.charAt(i)>='a'&a.charAt(i)<='z'){
				b++;
			}
			if(a.charAt(i)>='A'&a.charAt(i)<='Z'){
				c++;
			}
			if(a.charAt(i)<='9'&a.charAt(i)>='0'){
				d++;
			}
		}
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
