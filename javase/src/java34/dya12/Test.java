package java34.dya12;

public class Test {
	public static void main(String[] args) {
		String s="12sjjxkaMSKCNS212Kcls";
		//char[] a=s.toCharArray();
		int b=0; int c=0; int d=0;
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				b++;
			}
			if(Character.isLowerCase(s.charAt(i))){
				c++;
			}
			if(Character.isDigit(s.charAt(i))){
				d++;
			}
		}
		System.out.println("大写字母个数为："+b);
		System.out.println("小写字母个数为："+c);
		System.out.println("数字个数为："+d);
	}

}
