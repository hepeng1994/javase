package java34.dya16;

public class DiGuiTest {
	public static void main(String[] args) {
	System.out.println(f(7 ));
	}
	public static int f(int a){
		if(a==1||a==2){
			return 1;
		}else{
			return f(a-1)+f(a-2);
		}
	}
}
