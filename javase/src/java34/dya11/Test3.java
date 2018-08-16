package java34.dya11;
/**
 * 
 *截取字符串”中国你最美，中国你是我的祖国中”中的“中国”然后输出

 *
 */
public class Test3 {
	public static void main(String[] args) {
		String a="中国你最美，中国你是我的祖国中”中的“中国";
		for(int i=0;i<a.length();i++){
			char b=a.charAt(i);
			if(b=='中'){
				char c=a.charAt(i+1);
				if(c=='国'){
					System.out.println(""+b+c);
				}
			}
		}
	}

}
