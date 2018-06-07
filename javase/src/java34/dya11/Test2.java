package java34.dya11;
/**
 *  将字符串”axhhauububbuaa”中的字母”a,b”删除然后输出

 * @author ASUS
 *
 */
public class Test2 {
	public static void main(String[] args) {
		String a="axhhauububbua";
		StringBuffer b= new StringBuffer();
		
		String c=a.replace("a","").replace("b","");
		System.out.println(c);
	}
}