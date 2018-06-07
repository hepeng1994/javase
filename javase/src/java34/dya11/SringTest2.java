package java34.dya11;

public class SringTest2 {
	public static void main(String[] args) {
		String a="ss121HhkKJk78910lKOKP23Nllklh";
		int d=0;
		int b=0;
		int c=0;
		for(int i=0;i<a.length();i++){
			System.out.println(a.charAt(i));
			
			if(a.charAt(i)>='a'&a.charAt(i)<='z'){
				d++;
			}else if(a.charAt(i)>='A'&a.charAt(i)<='Z'){
				b++;
			}else if(a.charAt(i)>='0'&a.charAt(i)<='9'){
				c++;
			}
		}
		System.out.println("小写字母有"+d+"个");
		System.out.println("大写字母有"+b+"个");
		System.out.println("数字有"+c+"个");
	}

}
